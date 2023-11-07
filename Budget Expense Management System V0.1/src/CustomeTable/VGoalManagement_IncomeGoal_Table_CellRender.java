package CustomeTable;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.*;
import view.VGoalManagement;


public class VGoalManagement_IncomeGoal_Table_CellRender extends DefaultTableCellRenderer
{
     private VGoalManagement vgm;
    
    public VGoalManagement_IncomeGoal_Table_CellRender(VGoalManagement vgm)
    {
        this.vgm = vgm;
    }
    
     @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        
        VGoalManagement_IncomeGoal_Table_PanelAction action = new VGoalManagement_IncomeGoal_Table_PanelAction(vgm);
        return action;
    }
}
