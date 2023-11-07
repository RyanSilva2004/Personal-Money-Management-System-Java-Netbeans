package model;
import CustomeTable.VGoalManagement_IncomeGoal_Table_ActionCellEditor;
import CustomeTable.VGoalManagement_IncomeGoal_Table_CellRender;
import java.awt.Color;
import java.awt.Component;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import view.VGoalManagement;

import view.VSignIn;

public class MGoalManagement 
{
  public void AddNewGoal(String goalname, Double goalamount, String goalstartdate, String goalenddate, String goalcategory, String goalnote) {
    try 
    {
        String sql = "INSERT INTO tbl_goals (g_email, g_name, g_amount, g_startdate, g_enddate, g_category, g_note) VALUES ('" + VSignIn.getEmail() + "', '" + goalname + "', " + goalamount + ", '" + goalstartdate + "', '" + goalenddate + "', '" + goalcategory + "', '" + goalnote + "')";
        Statement statement = MyDBConnection.createConnection().createStatement();
        int rows = statement.executeUpdate(sql);
        if (rows > 0) 
        {
            JOptionPane.showMessageDialog(null, "Well done! You have added a new goal record successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    } 
    catch (SQLException e) 
    {
        JOptionPane.showMessageDialog(null, "Oops, there was an error while inserting the goal record. Please check your input and try again.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
  public void UpdateGoal(int id, String goalname, Double goalamount, String goalstartdate, String goalenddate, String goalcategory, String goalnote) 
{
    try 
    {
        String sql = "UPDATE tbl_goals SET g_name = '" + goalname + "', g_amount = " + goalamount + ", g_startdate = '" + goalstartdate + "', g_enddate = '" + goalenddate + "', g_category = '" + goalcategory + "', g_note = '" + goalnote + "' WHERE g_id = '" + id + "'";
        Statement statement = MyDBConnection.createConnection().createStatement();
        int rows = statement.executeUpdate(sql);
        if (rows > 0) 
        {
            JOptionPane.showMessageDialog(null, "Well done! You have updated a goal record successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Sorry, there was an error updating the goal record. Please check your input and try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } 
    catch (SQLException e) 
    {
        JOptionPane.showMessageDialog(null, "An exception occurred: " + e.getMessage(), "Exception", JOptionPane.ERROR_MESSAGE);
    }
}

public void DeleteGoal(int ID) {
    try {
        String sql = "DELETE FROM tbl_goals WHERE g_id = '" + ID + "'";
        Statement statement = MyDBConnection.createConnection().createStatement();
        int result = statement.executeUpdate(sql);
        if (result > 0) 
        {
            JOptionPane.showMessageDialog(null, "You have successfully deleted a goal record.");
        } 
        else {
            JOptionPane.showMessageDialog(null, "Sorry, there was an error deleting the goal record.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "An exception occurred: " + e.getMessage());
    }
}

public void LoadUpdateDetails(VGoalManagement vgm, int id) {
    try {
        String sql = "SELECT g_name, g_amount, g_note, g_startdate, g_enddate FROM tbl_goals WHERE g_id = ?";
        PreparedStatement statement = MyDBConnection.createConnection().prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet rst = statement.executeQuery();
        if (rst.next()) {
            vgm.txt_updategoal_name.setText(rst.getString("g_name"));
            vgm.txt_updategoal_amount.setText(rst.getString("g_amount"));
            vgm.txt_updategoal_note.setText(rst.getString("g_note"));
            vgm.date_updategoal_startdate.setDate(rst.getDate("g_startdate"));
            vgm.date_updategoal_enddate.setDate(rst.getDate("g_enddate"));
        } else {
            JOptionPane.showMessageDialog(null, "No record was found with this ID.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "An exception occurred: " + e.getMessage());
    }
}


public void LoadGoalTable(VGoalManagement vgm) {
    try {
        String sql = "SELECT g_id, g_name, g_startdate, g_enddate, g_amount, g_category, " +
                     "CASE WHEN g_category = 'Income Goal' THEN (SELECT SUM(in_amount) FROM tbl_income WHERE in_date BETWEEN g_startdate AND g_enddate AND in_email = g_email) " +
                     "WHEN g_category = 'Expense Goal' THEN (g_amount - (SELECT COALESCE(SUM(ex_amount), 0) FROM tbl_expense WHERE ex_date BETWEEN g_startdate AND g_enddate AND ex_email = g_email)) END AS 'Amount', " +
                     "CASE WHEN (SELECT SUM(in_amount) FROM tbl_income WHERE in_date BETWEEN g_startdate AND g_enddate AND in_email = g_email) >= g_amount OR (SELECT COALESCE(SUM(ex_amount), 0) FROM tbl_expense WHERE ex_date BETWEEN g_startdate AND g_enddate AND ex_email = g_email) >= g_amount THEN CASE WHEN g_category = 'Income Goal' THEN 'Achieved' ELSE 'Successful' END " +
                     "WHEN g_enddate > NOW() THEN CONCAT(FORMAT((SELECT SUM(in_amount) FROM tbl_income WHERE in_date BETWEEN g_startdate AND g_enddate AND in_email = g_email) / g_amount * 100, 2), '%') " +
                     "ELSE 'Failed' END AS 'Status' " +
                     "FROM tbl_goals WHERE g_email = ?";
        PreparedStatement statement = MyDBConnection.createConnection().prepareStatement(sql);
        statement.setString(1, VSignIn.getEmail());
        ResultSet rst = statement.executeQuery();
        DefaultTableModel model = (DefaultTableModel) vgm.table_goaldetails.getModel();
        model.setRowCount(0);
        while (rst.next()) 
        {
            model.addRow(new Object[] {rst.getInt(1), rst.getString(2), rst.getDate(3), rst.getDate(4), rst.getDouble(5), rst.getString(6), rst.getDouble(7), rst.getString(8)});
            vgm.table_goaldetails.getColumnModel().getColumn(8).setCellRenderer(new VGoalManagement_IncomeGoal_Table_CellRender(vgm));
            vgm.table_goaldetails.getColumnModel().getColumn(8).setCellEditor(new VGoalManagement_IncomeGoal_Table_ActionCellEditor(vgm));           
        }
    } 
    catch (SQLException e)
    {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Oops, there was an error while loading the goal data. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


}
