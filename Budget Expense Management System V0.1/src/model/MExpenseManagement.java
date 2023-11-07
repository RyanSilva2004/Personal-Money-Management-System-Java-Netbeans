package model;
import CustomeTable.VExpenseManagement_Table_ActionCellEditor;
import CustomeTable.VExpenseManagement_Table_CellRender;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import view.*;

public class MExpenseManagement 
{
     public void AddNewExpense(String expensename, Double expenseamount, String expensedate, String expensecategory, String expensenote) {
    try 
    {
        String sql = "INSERT INTO tbl_expense (ex_email, ex_name, ex_amount, ex_date, ex_category, ex_note) VALUES ('" + VSignIn.getEmail() + "', '" + expensename + "', " + expenseamount + ", '" + expensedate + "', '" + expensecategory + "', '" + expensenote + "')";
        Statement statement = MyDBConnection.createConnection().createStatement();
        int rows = statement.executeUpdate(sql);
        if (rows > 0) 
        {
            JOptionPane.showMessageDialog(null, "Well done! You have added a new expense record successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    } 
    catch (SQLException e) 
    {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Oops, there was an error while inserting the expense record. Please check your input and try again.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
     
     public void UpdateExpense(String id, String expensename, Double expenseamount, String expensedate, String expensecategory, String expensenote) 
     {
        try 
        {
            String sql = "UPDATE tbl_expense SET ex_name = '" + expensename + "', ex_amount = " + expenseamount + ", ex_date = '" + expensedate + "', ex_category = '" + expensecategory + "', ex_note = '" + expensenote + "' WHERE ex_id = '" + id + "'";
            Statement statement = MyDBConnection.createConnection().createStatement();
            int rows = statement.executeUpdate(sql);
            if (rows > 0) 
            {
                JOptionPane.showMessageDialog(null, "Well done! You have updated an expense record successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Sorry, there was an error updating the expense record. Please check your input and try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (SQLException e) 
        {
        JOptionPane.showMessageDialog(null, "An exception occurred: " + e.getMessage(), "Exception", JOptionPane.ERROR_MESSAGE);
        }
}
     
     public void LoadExpenseTable(VExpenseManagement vem) {
    try {
        String sql = "select ex_id, ex_date, ex_name, ex_category, ex_amount, ex_note from tbl_expense where ex_email = '" + VSignIn.getEmail() + "'";
        PreparedStatement statement = MyDBConnection.createConnection().prepareStatement(sql);
        ResultSet rst = statement.executeQuery();
        DefaultTableModel model = (DefaultTableModel) vem.table_expensedetials.getModel();
        model.setRowCount(0);
        while (rst.next()) 
        {
            model.addRow(new String[] {rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)});
            vem.table_expensedetials.getColumnModel().getColumn(6).setCellRenderer(new VExpenseManagement_Table_CellRender(vem));
            vem.table_expensedetials.getColumnModel().getColumn(6).setCellEditor(new VExpenseManagement_Table_ActionCellEditor(vem));
        }
    } 
    catch (SQLException e)
    {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Oops, there was an error while loading the expense data. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
     
     public void DeleteExpense(String ID) {
    try {
        String sql = "delete from tbl_expense where ex_id = '" + ID + "'";
        Statement statement = MyDBConnection.createConnection().createStatement();
        int result = statement.executeUpdate(sql);
        if (result > 0) {
            JOptionPane.showMessageDialog(null, "You have successfully deleted an expense record.");
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, there was an error deleting the expense record.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "An exception occurred: " + e.getMessage());
    }
}
     
     public void LoadUpdateDetails(VExpenseManagement vem, String id) {
    try {
        String sql = "select ex_name, ex_amount, ex_note, ex_date from tbl_expense where ex_id = ?";
        PreparedStatement statement = MyDBConnection.createConnection().prepareStatement(sql);
        statement.setString(1, id);
        ResultSet rst = statement.executeQuery();
        if (rst.next()) {
            vem.txt_updateexpense_name.setText(rst.getString("ex_name"));
            vem.txt_updateexpense_amount.setText(rst.getString("ex_amount"));
            vem.txt_updateexpense_note.setText(rst.getString("ex_note"));
            vem.date_updateexpense_date.setDate(rst.getDate("ex_date"));
        } else {
            JOptionPane.showMessageDialog(null, "No record was found with this ID.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "An exception occurred: " + e.getMessage());
    }
}

     
}
