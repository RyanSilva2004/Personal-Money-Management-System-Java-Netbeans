package CustomeTable;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import view.VGoalManagement;


public class VGoalManagement_IncomeGoal_Table_ActionCellEditor extends DefaultCellEditor
{
    private VGoalManagement vgm;
    
    public VGoalManagement_IncomeGoal_Table_ActionCellEditor(VGoalManagement vgm)
    {
        super(new JCheckBox());
        this.vgm = vgm;
    }
    
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column)
    {
       VGoalManagement_IncomeGoal_Table_PanelAction action = new VGoalManagement_IncomeGoal_Table_PanelAction(vgm);
        return action;
    }
}
