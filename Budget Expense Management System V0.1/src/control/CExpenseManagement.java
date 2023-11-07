package control;
import java.text.SimpleDateFormat;
import java.util.Date;
import view.VExpenseManagement;
import model.MExpenseManagement;

public class CExpenseManagement 
{
   MExpenseManagement mem = new MExpenseManagement();
   
   // New Expense Validations
public boolean ValidateNewExpenseName(String name, VExpenseManagement vem) {
    boolean isValid = true;
    vem.lbl_newexpensename_error.setVisible(false);
    if (name == null || name.isEmpty()) {
        vem.lbl_newexpensename_error.setVisible(true);
        vem.lbl_newexpensename_error.setText("Name cannot be blank");
        isValid = false;
    }

    return isValid;
}

public boolean ValidateNewExpenseDate(Date date, VExpenseManagement vem) {
    boolean isValid = true;
    vem.lbl_newexpensedate_error.setVisible(false);
    if (date == null) {
        vem.lbl_newexpensedate_error.setText("Date cannot be blank");
        vem.lbl_newexpensedate_error.setVisible(true);
        isValid = false;
    }

    Date today = new Date();
    int result = date.compareTo(today);

    if (result > 0) {
        vem.lbl_newexpensedate_error.setText("Date cannot be in the future");
        vem.lbl_newexpensedate_error.setVisible(true);
        isValid = false;
    }
    return isValid;
}

public boolean ValidateNewExpenseAmount(String amount, VExpenseManagement vem) {
    boolean isValid = true;
    vem.lbl_newexpenseamount_error.setVisible(false);
    if (amount == null || amount.isEmpty()) {
        vem.lbl_newexpenseamount_error.setText("Amount cannot be blank");
        vem.lbl_newexpenseamount_error.setVisible(true);
        isValid = false;
    }

    try {
        double value = Double.parseDouble(amount);
        if (value < 0) {
            vem.lbl_newexpenseamount_error.setText("Amount must be positive");
            vem.lbl_newexpenseamount_error.setVisible(true);
            isValid = false;
        }
    } catch (NumberFormatException e) {
        vem.lbl_newexpenseamount_error.setText("Amount must be a number");
        vem.lbl_newexpenseamount_error.setVisible(true);
        isValid = false;
    }

    return isValid;
}


// Update Expense Validations
public boolean ValidateUpdateExpenseName(String name, VExpenseManagement vem) {
    boolean isValid = true;
    vem.lbl_updateexpensename_error.setVisible(false);
    if (name == null || name.isEmpty()) {
        vem.lbl_updateexpensename_error.setVisible(true);
        vem.lbl_updateexpensename_error.setText("Name cannot be blank");
        isValid = false;
    }

    return isValid;
}

public boolean ValidateUpdateExpenseDate(Date date, VExpenseManagement vem) {
    boolean isValid = true;
    vem.lbl_updateexpensedate_error.setVisible(false);
    if (date == null) {
        vem.lbl_updateexpensedate_error.setText("Date cannot be blank");
        vem.lbl_updateexpensedate_error.setVisible(true);
        isValid = false;
    }

    Date today = new Date();
    int result = date.compareTo(today);

    if (result > 0) {
        vem.lbl_updateexpensedate_error.setText("Date cannot be in the future");
        vem.lbl_updateexpensedate_error.setVisible(true);
        isValid = false;
    }
    return isValid;
}

public boolean ValidateUpdateExpenseAmount(String amount, VExpenseManagement vem) {
    boolean isValid = true;
    vem.lbl_updateexpenseamount_error.setVisible(false);
    if (amount == null || amount.isEmpty()) {
        vem.lbl_updateexpenseamount_error.setText("Amount cannot be blank");
        vem.lbl_updateexpenseamount_error.setVisible(true);
        isValid = false;
    }

    try {
        double value = Double.parseDouble(amount);
        if (value < 0) {
            vem.lbl_updateexpenseamount_error.setText("Amount must be positive");
            vem.lbl_updateexpenseamount_error.setVisible(true);
            isValid = false;
        }
    } catch (NumberFormatException e) {
        vem.lbl_updateexpenseamount_error.setText("Amount must be a number");
        vem.lbl_updateexpenseamount_error.setVisible(true);
        isValid = false;
    }

    return isValid;
}

// Validating All
public boolean ValidateUpdateExpenseAll(String name, Date date, String amount, VExpenseManagement vem) {
    boolean isValid = true;
    // Validate the name field
    if (!ValidateUpdateExpenseName(name, vem)) {
        isValid = false;
    }
    // Validate the date field
    if (!ValidateUpdateExpenseDate(date, vem)) {
        isValid = false;
    }
    // Validate the amount field
    if (!ValidateUpdateExpenseAmount(amount, vem)) {
        isValid = false;
    }

    return isValid;
}

    public boolean ValidateNewExpenseAll(String name, Date date, String amount, VExpenseManagement vem) {
    boolean isValid = true;
    // Validate the name field
    if (!ValidateNewExpenseName(name, vem)) {
        isValid = false;
    }
    // Validate the date field
    if (!ValidateNewExpenseDate(date, vem)) {
        isValid = false;
    }
    // Validate the amount field
    if (!ValidateNewExpenseAmount(amount, vem)) {
        isValid = false;
    }

    return isValid;
    }

public void AddNewExpense(String expensename, String expenseamount, java.util.Date expensedate, String expensecategory, String expensenote)
{
    Double expenseamountdouble = Double.parseDouble(expenseamount);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    String newexpensedate = dateFormat.format(expensedate);
    mem.AddNewExpense(expensename, expenseamountdouble, newexpensedate, expensecategory, expensenote);
}

public void UpdateExpense(String id, String expensename, String expenseamount, java.util.Date expensedate, String expensecategory, String expensenote)
{    
    Double expenseamountdouble = Double.parseDouble(expenseamount);    
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    String newexpensedate = dateFormat.format(expensedate);
    mem.UpdateExpense(id, expensename, expenseamountdouble, newexpensedate, expensecategory, expensenote);
}

public void LoadExpenseTable(VExpenseManagement vem) {
    mem.LoadExpenseTable(vem);
}

public void DeleteExpense(String ID)
{
   mem.DeleteExpense(ID);
}

public void LoadUpdateDetails(VExpenseManagement vem, String id) 
{
    mem.LoadUpdateDetails(vem, id);
}

}
