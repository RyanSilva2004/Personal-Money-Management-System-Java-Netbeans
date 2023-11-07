package model;

import java.io.File;
import java.io.*;
import java.util.Date;
import java.sql.*;
import javax.swing.*;
import static model.MyDBConnection.con;
import java.util.*;
import view.VSignUp;

public class MSignUp 
{
   public void Account_SignUp(String fname,String lname,String email,String dob,String password) 
   {
    try
        {
            Statement statement = MyDBConnection.createConnection().createStatement();

            int rows = statement.executeUpdate("insert into tbl_accounts (acc_email,acc_fname,acc_lname,acc_bd,acc_password) values"
                    + " ('"+email+"','"+fname+"','"+lname+"','"+dob+"','"+password+"') ");
            if (rows > 0) 
            {
                JOptionPane.showMessageDialog(null, "Congratulations! You have successfully signed up with your email and password. Welcome to our service!", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "We are sorry for the inconvenience. There was an error while trying to sign you up. Please check your input and try again.", "Sign Up Error", JOptionPane.WARNING_MESSAGE);
            }
            
        }
        
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"We are sorry for the inconvenience. There was an exception: "+e+" while trying to sign you up. Please contact our support team for assistance.","Sign Up Error",JOptionPane.ERROR_MESSAGE);     
        }
   }
    
}
