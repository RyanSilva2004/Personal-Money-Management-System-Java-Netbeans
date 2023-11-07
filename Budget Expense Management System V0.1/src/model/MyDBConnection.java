package model;
import java.sql.*;
import javax.swing.JOptionPane;

public class MyDBConnection
{
    public static Connection con;
    public static Connection createConnection()
    {
        try
        {
            String DBpath = "jdbc:mysql://localhost/budget_management_system_db";
            con = DriverManager.getConnection(DBpath,"root","");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error"+e,"Database Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return con;
    }
}
