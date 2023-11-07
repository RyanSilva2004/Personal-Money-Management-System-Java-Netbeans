package control;
import java.text.SimpleDateFormat;
import java.util.Date;
import view.VIncomeManagement;
import model.MIncomeManagement;

public class CIncomeManagement
{
    MIncomeManagement mim = new MIncomeManagement();
    
    
    //New Income Validations
    public boolean ValidateNewIncomeName(String name,VIncomeManagement vim)
    {
        boolean isValid = true;
        vim.lbl_newincomename_error.setVisible(false);
        if (name == null || name.isEmpty())
        {
            vim.lbl_newincomename_error.setVisible(true);
            vim.lbl_newincomename_error.setText("Name cannot be blank");
            isValid = false;
        }
        
        return isValid;
    }
    
    public boolean ValidateNewIncomeDate(Date date, VIncomeManagement vim) 
    {
        boolean isValid = true;
        vim.lbl_newincomedate_error.setVisible(false);
        if (date == null)
        {
          vim.lbl_newincomedate_error.setText("Date cannot be blank");
          vim.lbl_newincomedate_error.setVisible(true);
          isValid = false;
        }
        
        Date today = new Date();
        int result = date.compareTo(today);
        
        if (result > 0) 
        {
            vim.lbl_newincomedate_error.setText("Date cannot be in the future");
            vim.lbl_newincomedate_error.setVisible(true);
            isValid = false;
        } 
        return isValid;
  }
    
    
    public boolean ValidateNewIncomeAmount(String amount, VIncomeManagement vim) 
    {
        boolean isValid = true;
        vim.lbl_newincomeamount_error.setVisible(false);
        if (amount == null || amount.isEmpty()) 
        {
            vim.lbl_newincomeamount_error.setText("Amount cannot be blank");
            vim.lbl_newincomeamount_error.setVisible(true);
            isValid = false;
        }

         try 
         {
            double value = Double.parseDouble(amount);
            if (value < 0) 
            {
                vim.lbl_newincomeamount_error.setText("Amount must be positive");
                vim.lbl_newincomeamount_error.setVisible(true);
                isValid = false;
            }
        }
        catch (NumberFormatException e) 
        {
            vim.lbl_newincomeamount_error.setText("Amount must be a number");
            vim.lbl_newincomeamount_error.setVisible(true);
            isValid = false;
        }
       
       return isValid;
    }
    
    
    //Update Income Validations
     public boolean ValidateUpdateIncomeName(String name,VIncomeManagement vim)
    {
        boolean isValid = true;
        vim.lbl_updateincomename_error.setVisible(false);
        if (name == null || name.isEmpty())
        {
            vim.lbl_updateincomename_error.setVisible(true);
            vim.lbl_updateincomename_error.setText("Name cannot be blank");
            isValid = false;
        }
        
        return isValid;
    }
    
     public boolean ValidateUpdateIncomeDate(Date date, VIncomeManagement vim) 
    {
        boolean isValid = true;
        vim.lbl_updateincomedate_error.setVisible(false);
        if (date == null)
        {
          vim.lbl_updateincomedate_error.setText("Date cannot be blank");
          vim.lbl_updateincomedate_error.setVisible(true);
          isValid = false;
        }
        
        Date today = new Date();
        int result = date.compareTo(today);
        
        if (result > 0) 
        {
            vim.lbl_updateincomedate_error.setText("Date cannot be in the future");
            vim.lbl_updateincomedate_error.setVisible(true);
            isValid = false;
        } 
        return isValid;
  }
    
    public boolean ValidateUpdateIncomeAmount(String amount, VIncomeManagement vim) 
    {
        boolean isValid = true;
        vim.lbl_updateincomeamount_error.setVisible(false);
        if (amount == null || amount.isEmpty()) 
        {
            vim.lbl_updateincomeamount_error.setText("Amount cannot be blank");
            vim.lbl_updateincomeamount_error.setVisible(true);
            isValid = false;
        }

         try 
         {
            double value = Double.parseDouble(amount);
            if (value < 0) 
            {
                vim.lbl_updateincomeamount_error.setText("Amount must be positive");
                vim.lbl_updateincomeamount_error.setVisible(true);
                isValid = false;
            }
        }
        catch (NumberFormatException e) 
        {
            vim.lbl_updateincomeamount_error.setText("Amount must be a number");
            vim.lbl_updateincomeamount_error.setVisible(true);
            isValid = false;
        }
       
       return isValid;
    }
    
    
    // Validating All
     public boolean ValidateUpdateIncomeAll(String name, Date date, String amount, VIncomeManagement vim) {
      boolean isValid = true;
      if (!ValidateUpdateIncomeName(name, vim)) 
      {
        isValid = false;
      }
      if (!ValidateUpdateIncomeDate(date, vim))
      {
        isValid = false;
      }
      if (!ValidateUpdateIncomeAmount(amount, vim))
      {
        isValid = false;
      }
      
      return isValid;
    }
    
    
    public boolean ValidateNewIncomeAll(String name, Date date, String amount, VIncomeManagement vim) {
      boolean isValid = true;
      if (!ValidateNewIncomeName(name, vim)) 
      {
        isValid = false;
      }
      if (!ValidateNewIncomeDate(date, vim))
      {
        isValid = false;
      }
      if (!ValidateNewIncomeAmount(amount, vim))
      {
        isValid = false;
      }
      
      return isValid;
    }
    
    
    // 
    public void AddNewIncome(String incomename,String incomeamount,java.util.Date incomedate,String incomecategory,String incomenote)
    {
       Double incomeamountdouble = Double.parseDouble(incomeamount);
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
       String newincomedate = dateFormat.format(incomedate);
          
        mim.AddNewIncome(incomename, incomeamountdouble,newincomedate, incomecategory, incomenote);
    }
    
    public void UpdateIncome(String id, String incomename, String incomeamount, java.util.Date incomedate, String incomecategory, String incomenote) 
    {
    Double incomeamountdouble = Double.parseDouble(incomeamount);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    String newincomedate = dateFormat.format(incomedate);
    mim.UpdateIncome(id, incomename, incomeamountdouble, newincomedate, incomecategory, incomenote);
    }
    
    public void LoadIncomeTable(VIncomeManagement vim)
    {
        mim.LoadIncomeTable(vim);
    }
    
    public void DeleteIncome(String ID)
    {
        mim.DeleteIncome(ID);
    }
    
    public void LoadUpdateDetails(VIncomeManagement vim,String id)
    {
        mim.LoadUpdateDetails(vim, id);
    }

}
