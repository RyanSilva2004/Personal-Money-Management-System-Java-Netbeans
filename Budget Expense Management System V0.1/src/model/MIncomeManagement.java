package model;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import view.*;
import CustomeTable.*;

public class MIncomeManagement
{
    
     public void AddNewIncome(String incomename,Double incomeamount,String incomedate,String incomecategory,String incomenote) {

        try {

            String sql = "INSERT INTO tbl_income (in_email, in_name, in_amount, in_date, in_category, in_note) VALUES ('" + VSignIn.getEmail() + "', '" + incomename + "', " + incomeamount + ", '" + incomedate + "', '" + incomecategory + "', '" + incomenote + "')";



            Statement statement = MyDBConnection.createConnection().createStatement();
            int rows = statement.executeUpdate(sql);


            if (rows > 0) 
            {
                JOptionPane.showMessageDialog(null, "Well done! You have added a new income record successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Oops, there was an error while inserting the income record. Please check your input and try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     public void UpdateIncome(String id, String incomename, Double incomeamount, String incomedate, String incomecategory, String incomenote) 
    {
        try 
        {
            String sql = "UPDATE tbl_income SET in_name = '" + incomename + "', in_amount = " + incomeamount + ", in_date = '" + incomedate + "', in_category = '" + incomecategory + "', in_note = '" + incomenote + "' WHERE in_id = '" + id + "'";
            Statement statement = MyDBConnection.createConnection().createStatement();
            int rows = statement.executeUpdate(sql);
            if (rows > 0) 
            {
                JOptionPane.showMessageDialog(null, "Well done! You have updated an income record successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Sorry, there was an error updating the income record. Please check your input and try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "An exception occurred: " + e.getMessage(), "Exception", JOptionPane.ERROR_MESSAGE);
        }
    }

     
     public void LoadIncomeTable(VIncomeManagement vim)
     {
        try 
        {
            String sql = "select in_id,in_date,in_name,in_category,in_amount,in_note from tbl_income where in_email = '"+VSignIn.getEmail()+"'";
            PreparedStatement statement = MyDBConnection.createConnection().prepareStatement(sql);
            ResultSet rst = statement.executeQuery();
            DefaultTableModel model = (DefaultTableModel)vim.table_incomedetials.getModel();
            model.setRowCount(0);
            while(rst.next())
            {
                model.addRow(new String[] {rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)});
                vim.table_incomedetials.getColumnModel().getColumn(6).setCellRenderer(new VIncomeManagement_Table_CellRender(vim));
                vim.table_incomedetials.getColumnModel().getColumn(6).setCellEditor(new VIncomeManagement_Table_ActionCellEditor(vim));
            }
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Oops, there was an error while inserting the income record. Please check your input and try again.", "Error", JOptionPane.ERROR_MESSAGE);
        } 
     }
    public void DeleteIncome(String ID) {
    try 
    {
        String sql = "delete from tbl_income where in_id = '"+ID+"'";
        Statement statement = MyDBConnection.createConnection().createStatement();
        int result = statement.executeUpdate(sql);
        if (result > 0) 
        {
           JOptionPane.showMessageDialog(null, "You have successfully deleted an income record.");
        } 
        else 
        {
           JOptionPane.showMessageDialog(null, "Sorry, there was an error deleting the income record.");
        }
    } 
    catch (SQLException e) 
    {
        JOptionPane.showMessageDialog(null, "An exception occurred: " + e.getMessage());
    }
}

    public void LoadUpdateDetails(VIncomeManagement vim, String id) {
    try 
    {
        String sql = "select in_name, in_amount, in_note, in_date from tbl_income where in_id = ?";
        PreparedStatement statement = MyDBConnection.createConnection().prepareStatement(sql);
        statement.setString(1, id);
        ResultSet rst = statement.executeQuery();
        if (rst.next()) 
        {
            vim.txt_updateincome_name.setText(rst.getString("in_name"));
            vim.txt_updateincome_amount.setText(rst.getString("in_amount"));
            vim.txt_updateincome_note.setText(rst.getString("in_note"));
            vim.date_updateincome_date.setDate(rst.getDate("in_date"));
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "No record was found with this ID.");
        }
    }
    catch (SQLException e) 
    {
        JOptionPane.showMessageDialog(null, "An exception occurred: " + e.getMessage());
    }
}

}
