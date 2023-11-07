package CustomeTable;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.*;
import view.VIncomeManagement;

public class VIncomeManagement_Table_CellRender extends DefaultTableCellRenderer
{
    private VIncomeManagement vim;
    
    public VIncomeManagement_Table_CellRender(VIncomeManagement vim)
    {
        this.vim = vim;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        
        VIncomeManagement_Table_PanelAction action = new VIncomeManagement_Table_PanelAction(vim);
        return action;
    }
    
}
