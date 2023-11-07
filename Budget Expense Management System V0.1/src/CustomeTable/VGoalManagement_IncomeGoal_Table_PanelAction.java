package CustomeTable;
import view.VGoalManagement;
import control.CGoalManagement;

public class VGoalManagement_IncomeGoal_Table_PanelAction extends javax.swing.JPanel {

    private VGoalManagement vgm;
    public VGoalManagement_IncomeGoal_Table_PanelAction(VGoalManagement vgm) {
        initComponents();
        this.vgm = vgm;
    }
    
    CGoalManagement cgm = new CGoalManagement();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_edit = new javax.swing.JButton();

        setLayout(null);

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
        btn_edit.setBounds(30, 10, 30, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed

        try
        {
             int row = vgm.table_goaldetails.getSelectedRow();
        int id = (int) vgm.table_goaldetails.getValueAt(row, 0);
        vgm.OpenInputPanels(vgm.pnl_goal_updategoal);
        vgm.updateid = id;        
        cgm.LoadUpdateDetails(vgm, id);  
        vgm.LoadGoalTable();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        
        }
       
    }//GEN-LAST:event_btn_editActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    // End of variables declaration//GEN-END:variables
}
