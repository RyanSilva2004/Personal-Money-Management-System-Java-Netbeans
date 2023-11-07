package CustomeTable;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import view.VIncomeManagement;


public class VIncomeManagement_Table_ActionCellEditor extends DefaultCellEditor
{
    private VIncomeManagement vim;
    
    public VIncomeManagement_Table_ActionCellEditor(VIncomeManagement vim)
    {
        super(new JCheckBox());
        this.vim = vim;
    }
    
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column)
    {
        VIncomeManagement_Table_PanelAction action = new VIncomeManagement_Table_PanelAction(vim);
        return action;
    }
    
    
}
