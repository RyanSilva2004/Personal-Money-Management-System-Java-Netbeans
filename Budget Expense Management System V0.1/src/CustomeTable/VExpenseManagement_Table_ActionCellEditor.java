package CustomeTable;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import view.VExpenseManagement;


public class VExpenseManagement_Table_ActionCellEditor extends DefaultCellEditor
{
     private VExpenseManagement vem;
     
     public VExpenseManagement_Table_ActionCellEditor(VExpenseManagement vem)
    {
        super(new JCheckBox());
        this.vem = vem;
    }
     
     @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column)
    {
        VExpenseManagement_Table_PanelAction action = new VExpenseManagement_Table_PanelAction(vem);
        return action;
    }
}
