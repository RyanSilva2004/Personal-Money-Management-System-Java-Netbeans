package model;
import java.sql.*;

public class MHome
{
    public String getFirstName(String email) {
        String firstName = null;
        try 
        {
            String sql = "select acc_fname from tbl_accounts where acc_email = ?";
            PreparedStatement statement = MyDBConnection.createConnection().prepareStatement(sql);
            statement.setString(1, email);
            ResultSet rst = statement.executeQuery();
            if (rst.next())
            {
                firstName = rst.getString("acc_fname");
            }
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return firstName;
    }
    
    public String getLastName(String email)
    {
        String lastName = null;
        try {
            String sql = "select acc_lname from tbl_accounts where acc_email = ?";
            PreparedStatement statement = MyDBConnection.createConnection().prepareStatement(sql);
            statement.setString(1, email);
            ResultSet rst = statement.executeQuery();
            if (rst.next()) {
                lastName = rst.getString("acc_lname");
            }
        } 
        catch (SQLException e) 
        {

            e.printStackTrace();
        }
        return lastName;
    }
}
