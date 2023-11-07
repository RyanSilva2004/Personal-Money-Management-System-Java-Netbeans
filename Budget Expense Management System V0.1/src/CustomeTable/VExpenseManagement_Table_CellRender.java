package CustomeTable;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.*;
import view.VExpenseManagement;

public class VExpenseManagement_Table_CellRender extends DefaultTableCellRenderer
{
    private VExpenseManagement vem;
    
     public VExpenseManagement_Table_CellRender(VExpenseManagement vem)
    {
        this.vem = vem;
    }
     
      @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        
        VExpenseManagement_Table_PanelAction action = new VExpenseManagement_Table_PanelAction(vem);
        return action;
    }
}
