package CustomeTable;
import view.VIncomeManagement;
import control.CIncomeManagement;

public class VIncomeManagement_Table_PanelAction extends javax.swing.JPanel {

    private VIncomeManagement vim;
    public VIncomeManagement_Table_PanelAction(VIncomeManagement vim) {
        initComponents();
        this.vim = vim;
    }
    
    CIncomeManagement cim = new CIncomeManagement();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();

        setLayout(null);

        btn_delete.setBackground(new java.awt.Color(204, 0, 0));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-delete-20.png"))); // NOI18N
        btn_delete.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_delete.setFocusPainted(false);
        btn_delete.setFocusable(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        add(btn_delete);
        btn_delete.setBounds(60, 10, 30, 30);

        btn_edit.setBackground(new java.awt.Color(255, 204, 0));
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-edit-20.png"))); // NOI18N
        btn_edit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_edit.setFocusPainted(false);
        btn_edit.setFocusable(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        add(btn_edit);
        btn_edit.setBounds(10, 10, 30, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
         
        try
        {
         int row = vim.table_incomedetials.getSelectedRow();
         String id = (String) vim.table_incomedetials.getValueAt(row, 0);
         cim.DeleteIncome(id);
         vim.LoadIncomeTable();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        
        try
        {
        int row = vim.table_incomedetials.getSelectedRow();
        String id = (String) vim.table_incomedetials.getValueAt(row, 0);
        vim.OpenInputPanels(vim.pnl_income_updateincome);
        vim.updateid = id;
        cim.LoadUpdateDetails(vim, id);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        
        }
    }//GEN-LAST:event_btn_editActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    // End of variables declaration//GEN-END:variables
}
