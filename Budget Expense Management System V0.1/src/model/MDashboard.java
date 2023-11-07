package model;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.VDashboard;
import view.VSignIn;

public class MDashboard {

    // Method to get total income
   public String getTotalIncome() {
    try {
        String sql = "SELECT SUM(in_amount) AS TotalIncome FROM tbl_income WHERE in_email = ?";
        PreparedStatement statement = MyDBConnection.createConnection().prepareStatement(sql);
        statement.setString(1, VSignIn.getEmail());
        ResultSet rst = statement.executeQuery();

        if (rst.next()) {
            return rst.getString("TotalIncome") != null ? rst.getString("TotalIncome") : "0";
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Oops, there was an error while loading the income data. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    return "0";
}

    public String getTotalExpense() {
        try {
            String sql = "SELECT SUM(ex_amount) AS TotalExpense FROM tbl_expense WHERE ex_email = ?";
            PreparedStatement statement = MyDBConnection.createConnection().prepareStatement(sql);
            statement.setString(1, VSignIn.getEmail());
            ResultSet rst = statement.executeQuery();

            if (rst.next()) {
                return rst.getString("TotalExpense") != null ? rst.getString("TotalExpense") : "0";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Oops, there was an error while loading the expense data. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return "0";
    }

    public String getTotalBalance() {
        try {
            String sql = "SELECT (SELECT SUM(in_amount) FROM tbl_income WHERE in_email = ?) - (SELECT SUM(ex_amount) FROM tbl_expense WHERE ex_email = ?) AS TotalBalance";
            PreparedStatement statement = MyDBConnection.createConnection().prepareStatement(sql);
            statement.setString(1, VSignIn.getEmail());
            statement.setString(2, VSignIn.getEmail());
            ResultSet rst = statement.executeQuery();

            if (rst.next()) {
                return rst.getString("TotalBalance") != null ? rst.getString("TotalBalance") : "0";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Oops, there was an error while loading the balance data. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return "0";
    }

    public void LoadIncomeTable(VDashboard vd)
         {
            try 
            {
                String sql = "select in_id,in_date,in_name,in_category,in_amount,in_note from tbl_income where in_email = '"+VSignIn.getEmail()+"'";
                PreparedStatement statement = MyDBConnection.createConnection().prepareStatement(sql);
                ResultSet rst = statement.executeQuery();
                DefaultTableModel model = (DefaultTableModel)vd.table_incomedetials.getModel();
                model.setRowCount(0);
                while(rst.next())
                {
                    model.addRow(new String[] {rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)});

                }
            } 
            catch (SQLException e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Oops, there was an error while inserting the income record. Please check your input and try again.", "Error", JOptionPane.ERROR_MESSAGE);
            } 
         }

    public void LoadExpenseTable(VDashboard vd) {
        try {
            String sql = "select ex_id, ex_date, ex_name, ex_category, ex_amount, ex_note from tbl_expense where ex_email = '" + VSignIn.getEmail() + "'";
            PreparedStatement statement = MyDBConnection.createConnection().prepareStatement(sql);
            ResultSet rst = statement.executeQuery();
            DefaultTableModel model = (DefaultTableModel) vd.table_expensedetials.getModel();
            model.setRowCount(0);
            while (rst.next()) 
            {
                model.addRow(new String[] {rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)});           
            }
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Oops, there was an error while loading the expense data. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
