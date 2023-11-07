package CustomeTable;
import view.VExpenseManagement;
import control.CExpenseManagement;

public class VExpenseManagement_Table_PanelAction extends javax.swing.JPanel {

    private VExpenseManagement vem;
    public VExpenseManagement_Table_PanelAction(VExpenseManagement vem) {
        initComponents();
        this.vem = vem;
    }
    
    CExpenseManagement cem = new CExpenseManagement();
    
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

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        
        try
        {
        int row = vem.table_expensedetials.getSelectedRow();
        String id = (String) vem.table_expensedetials.getValueAt(row, 0);
        vem.OpenInputPanels(vem.pnl_expense_updateexpense);
        vem.updateid = id;
        cem.LoadUpdateDetails(vem, id);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        
        try
        {
         int row = vem.table_expensedetials.getSelectedRow();
         String id = (String) vem.table_expensedetials.getValueAt(row, 0);
         cem.DeleteExpense(id);
         vem.LoadExpenseTable();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            
        }
    }//GEN-LAST:event_btn_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    // End of variables declaration//GEN-END:variables
}
