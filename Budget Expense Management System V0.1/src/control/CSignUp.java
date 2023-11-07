package control;
import java.awt.Image;
import java.io.*;
import java.util.*;
import javax.swing.*;
import model.MSignUp;
import view.VSignUp;
import model.MSignUp;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CSignUp

{
    MSignUp msu = new MSignUp();
    
     public void Account_SignUp(VSignUp vsu)
     {
        String fname = vsu.txt_fname.getText();
        String lname = vsu.txt_lname.getText();
        String password = vsu.txt_password.getText();
        String email = vsu.txt_email.getText();       
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String dob = dateFormat.format(vsu.date_dob.getDate());
        
        msu.Account_SignUp(fname, lname, email, dob, password);
        
     }

    
    public ImageIcon uploadFile() 
    {
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(null);
        File f = null;
        String FileName = null;

        if(returnVal != JFileChooser.APPROVE_OPTION)
        {
            JOptionPane.showMessageDialog(null, "Oops! It seems the file chooser was cancelled. Please try again.", "File Chooser Cancelled", JOptionPane.ERROR_MESSAGE);
        }
        else if((f = chooser.getSelectedFile()) == null) 
        {
            JOptionPane.showMessageDialog(null, "Oops! It seems no file was selected. Please select a file.", "No File Selected", JOptionPane.ERROR_MESSAGE);
        } 
        else if((FileName = f.getAbsolutePath()) == null || FileName.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Oops! It seems the file path is empty. Please select a valid file.", "Invalid File Path", JOptionPane.ERROR_MESSAGE);
        }
        else 
        {

            // Extention Check
            String extension = "";
            int i = FileName.lastIndexOf('.');
            if (i > 0) 
            {
                extension = FileName.substring(i+1);
            }

            if(extension.equals("jpg") || extension.equals("png") || extension.equals("gif") || extension.equals("bmp") || extension.equals("tif")) 
            {    
                ImageIcon imgicon = new ImageIcon(new ImageIcon(FileName).getImage().getScaledInstance(140, 140, Image.SCALE_SMOOTH));
                return imgicon;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Oops! The selected file is not a valid image file. Please select a .jpg, .png, .gif, .bmp, or .tif file.", "Invalid File Type", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    return null;
}
    

    public boolean validateAll(VSignUp vsu) 
{
    vsu.clearErrorLabels();
    boolean isValid = true;
    
    // Validate the first name field
    if (vsu.txt_fname.getText().isEmpty()) 
    {
        vsu.lbl_fname_error.setVisible(true);
        vsu.lbl_fname_error.setText("Please enter your first name");
        isValid = false;
    } 
    else if (!isAlpha(vsu.txt_fname.getText()))
    {
        vsu.lbl_fname_error.setVisible(true);
        vsu.lbl_fname_error.setText("First name cannot contain numbers");
        isValid = false;
    } 
    else 
    {
        vsu.lbl_fname_error.setVisible(false);        
    }

    // Validate the last name field
    if (vsu.txt_lname.getText().isEmpty()) 
    {
        vsu.lbl_lname_error.setVisible(true);
        vsu.lbl_lname_error.setText("Please enter your last name");
        isValid = false;
    } 
    else if (!isAlpha(vsu.txt_lname.getText()))
    {
        vsu.lbl_lname_error.setVisible(true);
        vsu.lbl_lname_error.setText("Last name cannot contain numbers");
        isValid = false;
    } 
    else 
    {
        vsu.lbl_lname_error.setVisible(false);        
    }

    // Validate the email field
    String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    if (vsu.txt_email.getText().isEmpty())
    {
        vsu.lbl_email_error.setVisible(true);
        vsu.lbl_email_error.setText("Please enter your email");
        isValid = false;
    } 
    else if (!vsu.txt_email.getText().matches(regex)) 
    {
        vsu.lbl_email_error.setVisible(true);
        vsu.lbl_email_error.setText("Invalid email format");
        isValid = false;
    }
    else 
    {
        vsu.lbl_email_error.setVisible(false);
    }


    // Validate the password field
    if (vsu.txt_password.getText().isEmpty()) 
    {
        vsu.lbl_password_error.setVisible(true);
        vsu.lbl_password_error.setText("Please enter your password");
        isValid = false;
    } 
    else if (vsu.txt_password.getText().length() < 8) 
    {
        vsu.lbl_password_error.setVisible(true);
        vsu.lbl_password_error.setText("Password too short");
        isValid = false;
    } 
    else 
    {
        vsu.lbl_password_error.setVisible(false);
    }

    // Validate the confirm password field
    if (vsu.txt_comfirmpassword.getText().isEmpty()) 
    {
        vsu.lbl_confirmpassword_error.setVisible(true);
        vsu.lbl_confirmpassword_error.setText("Please confirm your password");
        isValid = false;
    }
    else if (!vsu.txt_comfirmpassword.getText().equals(vsu.txt_password.getText()))
    {
        vsu.lbl_confirmpassword_error.setVisible(true);
        vsu.lbl_confirmpassword_error.setText("Passwords do not match");
        isValid = false;
    } 
    else 
    {
        vsu.lbl_confirmpassword_error.setVisible(false);
    }

    // Validate the date of birth component
    if (vsu.date_dob.getDate() == null) 
    {
        vsu.lbl_dob_error.setVisible(true);
        vsu.lbl_dob_error.setText("Please select your date of birth");
        isValid = false;
    } 
    else if (!isOlderThanFive(vsu.date_dob.getDate()))
    {
        vsu.lbl_dob_error.setVisible(true);
        vsu.lbl_dob_error.setText("Date of birth must be older than five years");
        isValid = false;
    } 
    else 
    {
        vsu.lbl_dob_error.setVisible(false);
    }
    
    return isValid;
}


    public boolean isAlpha(String str) 
    {    
        for (int i = 0; i < str.length(); i++) 
        {
            char c = str.charAt(i);
            if (Character.isDigit(c)) 
            {
                return false;
            }
        }
        return true;
    }


    public boolean isOlderThanFive(java.util.Date date) 
    {
        Calendar now = Calendar.getInstance();
        now.add(Calendar.YEAR, -5);
        Calendar dob = Calendar.getInstance();
        dob.setTime(date);
        return dob.before(now);
    }

}

