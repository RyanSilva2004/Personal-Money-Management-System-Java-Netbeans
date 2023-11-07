package Reports;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.MyDBConnection;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import view.VSignIn;


public class VReportFrom extends javax.swing.JPanel {


    public VReportFrom() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date_startdate = new com.toedter.calendar.JDateChooser();
        date_enddate = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(null);

        date_startdate.setForeground(new java.awt.Color(102, 102, 102));
        date_startdate.setDateFormatString("yyyy/MM/dd");
        date_startdate.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        date_startdate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_startdatePropertyChange(evt);
            }
        });
        add(date_startdate);
        date_startdate.setBounds(122, 72, 210, 30);

        date_enddate.setForeground(new java.awt.Color(102, 102, 102));
        date_enddate.setDateFormatString("yyyy/MM/dd");
        date_enddate.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        date_enddate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_enddatePropertyChange(evt);
            }
        });
        add(date_enddate);
        date_enddate.setBounds(122, 108, 210, 30);

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(120, 160, 210, 27);

        jLabel1.setText("Report Income / Expense ");
        add(jLabel1);
        jLabel1.setBounds(122, 23, 150, 16);

        jLabel2.setText("End Date");
        add(jLabel2);
        jLabel2.setBounds(30, 110, 70, 16);

        jLabel3.setText("Start Date");
        add(jLabel3);
        jLabel3.setBounds(30, 80, 70, 16);
    }// </editor-fold>//GEN-END:initComponents

    private void date_startdatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_startdatePropertyChange


    }//GEN-LAST:event_date_startdatePropertyChange

    private void date_enddatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_enddatePropertyChange
        
        

    }//GEN-LAST:event_date_enddatePropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String startdate = dateFormat.format(date_startdate.getDate());
        String enddate = dateFormat.format(date_enddate.getDate());
        
        String sql = "SELECT tbl_accounts.*, tbl_expense.*, tbl_income.*, " +
                     "SUM(tbl_expense.ex_amount) AS TotalExpense, " +
                     "SUM(tbl_income.in_amount) AS TotalIncome, " +
                     "SUM(tbl_income.in_amount) - SUM(tbl_expense.ex_amount) AS IncomeExpenseDifference " +
                     "FROM budget_management_system_db.tbl_accounts " +
                     "INNER JOIN budget_management_system_db.tbl_expense ON tbl_accounts.acc_email = tbl_expense.ex_email AND tbl_expense.ex_date BETWEEN '"+startdate+"' AND '"+enddate+"' " +
                     "INNER JOIN budget_management_system_db.tbl_income ON tbl_accounts.acc_email = tbl_income.in_email AND tbl_income.in_date BETWEEN '"+startdate+"' AND '"+enddate+"' " +
                     "WHERE tbl_accounts.acc_email = '"+VSignIn.getEmail()+"' GROUP BY tbl_accounts.acc_email";
        try
        {
            Connection con = MyDBConnection.createConnection();
            JasperDesign jdesgin = JRXmlLoader.load("C:\\Users\\ryans\\Desktop\\EAD - 1\\EAD-Project\\Version 0.2\\Budget Expense Management System V0.1\\src\\Reports\\report1.jrxml");
            JRDesignQuery updatequery = new JRDesignQuery();
            updatequery.setText(sql);
            jdesgin.setQuery(updatequery);
            JasperReport jreport = JasperCompileManager.compileReport(jdesgin);
            JasperPrint jprint = JasperFillManager.fillReport(jreport, null,con);
            JasperViewer.viewReport(jprint);
        }
       catch(Exception e)
{
    e.printStackTrace();
}
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date_enddate;
    private com.toedter.calendar.JDateChooser date_startdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
