package control;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import model.MDashboard;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import view.VDashboard;

public class CDashboard 
{
    MDashboard md = new MDashboard();
    public String getTotalIncome() 
    {
        return md.getTotalIncome();
    }
    
    public String getTotalExpense()
    {
        return md.getTotalExpense();
    }
    
    public String getTotalBalance()
    {
        return md.getTotalBalance();
    }
           
    public void LoadIncomeTable(VDashboard vd)
    {
        md.LoadIncomeTable(vd);
    }
    
     public void LoadExpenseTable(VDashboard vd)
    {
        md.LoadExpenseTable(vd);
    }
}
