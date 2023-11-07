package control;
import model.MSignIn;
import view.VSignIn;

public class CSignIn
{
    public boolean Account_SignIn(String email,String password)
    {
        MSignIn msi = new MSignIn();
        if(true == msi.Account_SignIn(email,password))
        {
            return true;
        }
        return false;
    }
    
        public boolean checkValidations(VSignIn vsi)
    {
        vsi.lbl_email_error.setVisible(false);
        vsi.lbl_password_error.setVisible(false);
        
        if (vsi.txt_email1.getText().isEmpty())
        {
            vsi.lbl_email_error.setText("Please enter your Email");
            vsi.lbl_email_error.setVisible(true);
        }
        else if (!vsi.txt_email1.getText().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"))
        {
            vsi.lbl_email_error.setText("Please enter a valid email address.");
            vsi.lbl_email_error.setVisible(true);
        }
        else if (vsi.txt_password.getText().isEmpty())
        {
            vsi.lbl_password_error.setText("Please enter your Password");
            vsi.lbl_password_error.setVisible(true);
        }
        else if (vsi.txt_password.getText().length() < 8) 
        {
            vsi.lbl_password_error.setVisible(true);
            vsi.lbl_password_error.setText("Password too short");
        } 
        else 
        {
            return true;
        }
        
        return false;
    }
}
