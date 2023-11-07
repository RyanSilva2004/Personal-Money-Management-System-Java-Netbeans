package model;
import java.sql.*;
import javax.swing.JOptionPane;
import view.*;

public class MSignIn 
{
    public boolean Account_SignIn(String email,String password)
    {
         try
        {
            Statement statement = MyDBConnection.createConnection().createStatement();
            ResultSet resultset = statement.executeQuery("select * from tbl_accounts where acc_email = '"+email+"' and acc_password = '"+password+"'");
            if(resultset.next())
            {             
                return true;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"We could not find a match for your email and password. Please check your input and try again.","Sign In Error",JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"We are sorry for the inconvenience. There was an exception: "+e+" while trying to sign you in. Please contact our support team for assistance.","Sign In Error",JOptionPane.ERROR_MESSAGE);            
        }
         return false;
    }
}
