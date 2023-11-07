package control;
import java.text.SimpleDateFormat;
import java.util.Date;
import view.VGoalManagement;
import model.MGoalManagement;

public class CGoalManagement 
{
    MGoalManagement mgm = new MGoalManagement();
    
    // Validate New Goal
    public boolean ValidateNewGoalName(String name, VGoalManagement vgm)
    {
        boolean isValid = true;
        vgm.lbl_newgoalname_error.setVisible(false);
        if (name == null || name.isEmpty())
        {
            vgm.lbl_newgoalname_error.setVisible(true);
            vgm.lbl_newgoalname_error.setText("Name cannot be blank");
            isValid = false;
        }
        return isValid;
    }
    public boolean ValidateNewGoalAmount(String amount, VGoalManagement vgm) {
    boolean isValid = true;
    vgm.lbl_newgoalamount_error.setVisible(false);
    if (amount == null || amount.isEmpty()) {
        vgm.lbl_newgoalamount_error.setText("Amount cannot be blank");
        vgm.lbl_newgoalamount_error.setVisible(true);
        isValid = false;
    }

    try {
        double value = Double.parseDouble(amount);
        if (value < 0) {
            vgm.lbl_newgoalamount_error.setText("Amount must be positive");
            vgm.lbl_newgoalamount_error.setVisible(true);
            isValid = false;
        }
    } catch (NumberFormatException e) {
        vgm.lbl_newgoalamount_error.setText("Amount must be a number");
        vgm.lbl_newgoalamount_error.setVisible(true);
        isValid = false;
    }

    return isValid;
}
    
    public boolean ValidateNewGoalDates(Date startDate, Date endDate, VGoalManagement vgm) {
    boolean isValid = true;
    vgm.lbl_newgoalstartdate_error.setVisible(false);
    if (startDate == null || endDate == null) {
        vgm.lbl_newgoalstartdate_error.setText("Start date and end date cannot be blank");
        vgm.lbl_newgoalstartdate_error.setVisible(true);
        isValid = false;
    } else if (endDate.before(startDate)) {
        vgm.lbl_newgoalstartdate_error.setText("End date cannot be before start date");
        vgm.lbl_newgoalstartdate_error.setVisible(true);
        isValid = false;
    }

    return isValid;
}

    public boolean ValidateNewGoalAll(String name, Date startDate, Date endDate, String amount, VGoalManagement vgm) {
    boolean isValid = true;
    // Validate the name field
    if (!ValidateNewGoalName(name, vgm)) {
        isValid = false;
    }
    // Validate the date fields
    if (!ValidateNewGoalDates(startDate, endDate, vgm)) {
        isValid = false;
    }
    // Validate the amount field
    if (!ValidateNewGoalAmount(amount, vgm)) {
        isValid = false;
    }

    return isValid;
}

    //Validate Update Goal
    
    public boolean ValidateUpdateGoalName(String name, VGoalManagement vgm)
{
    boolean isValid = true;
    vgm.lbl_updategoalname_error.setVisible(false);
    if (name == null || name.isEmpty())
    {
        vgm.lbl_updategoalname_error.setVisible(true);
        vgm.lbl_updategoalname_error.setText("Name cannot be blank");
        isValid = false;
    }
    return isValid;
}

    public boolean ValidateUpdateGoalAmount(String amount, VGoalManagement vgm) {
    boolean isValid = true;
    vgm.lbl_updategoalamount_error.setVisible(false);
    if (amount == null || amount.isEmpty()) {
        vgm.lbl_updategoalamount_error.setText("Amount cannot be blank");
        vgm.lbl_updategoalamount_error.setVisible(true);
        isValid = false;
    }

    try {
        double value = Double.parseDouble(amount);
        if (value < 0) {
            vgm.lbl_updategoalamount_error.setText("Amount must be positive");
            vgm.lbl_updategoalamount_error.setVisible(true);
            isValid = false;
        }
    } catch (NumberFormatException e) {
        vgm.lbl_updategoalamount_error.setText("Amount must be a number");
        vgm.lbl_updategoalamount_error.setVisible(true);
        isValid = false;
    }

    return isValid;
}

    public boolean ValidateUpdateGoalDates(Date startDate, Date endDate, VGoalManagement vgm) {
    boolean isValid = true;
    vgm.lbl_updategoalstartdate_error.setVisible(false);
    if (startDate == null || endDate == null) {
        vgm.lbl_updategoalstartdate_error.setText("Start date and end date cannot be blank");
        vgm.lbl_updategoalstartdate_error.setVisible(true);
        isValid = false;
    } else if (endDate.before(startDate)) {
        vgm.lbl_updategoalstartdate_error.setText("End date cannot be before start date");
        vgm.lbl_updategoalstartdate_error.setVisible(true);
        isValid = false;
    }

    return isValid;
}

    public boolean ValidateUpdateGoalAll(String name, Date startDate, Date endDate, String amount, VGoalManagement vgm) {
    boolean isValid = true;
    // Validate the name field
    if (!ValidateUpdateGoalName(name, vgm)) {
        isValid = false;
    }
    // Validate the date fields
    if (!ValidateUpdateGoalDates(startDate, endDate, vgm)) {
        isValid = false;
    }
    // Validate the amount field
    if (!ValidateUpdateGoalAmount(amount, vgm)) {
        isValid = false;
    }

    return isValid;
}
    
    public void LoadGoalTable(VGoalManagement vgm) {
    mgm.LoadGoalTable(vgm);
    }
    

    public void AddNewGoal(String goalname, String goalamount, java.util.Date goalstartdate, java.util.Date goalenddate, String goalcategory, String goalnote)
{
    Double goalamountdouble = Double.parseDouble(goalamount);
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    String newgoalstartdate = dateFormat.format(goalstartdate);
    String newgoalenddate = dateFormat.format(goalenddate);
    mgm.AddNewGoal(goalname, goalamountdouble, newgoalstartdate, newgoalenddate, goalcategory, goalnote);
}
    
    public void UpdateGoal(int id, String goalname, String goalamount, java.util.Date goalstartdate, java.util.Date goalenddate, String goalcategory, String goalnote)
{    
    Double goalamountdouble = Double.parseDouble(goalamount);    
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    String newgoalstartdate = dateFormat.format(goalstartdate);
    String newgoalenddate = dateFormat.format(goalenddate);
    mgm.UpdateGoal(id, goalname, goalamountdouble, newgoalstartdate, newgoalenddate, goalcategory, goalnote);
}

public void DeleteGoal(int ID)
{
   mgm.DeleteGoal(ID);
}

public void LoadUpdateDetails(VGoalManagement vgm, int id) 
{
    mgm.LoadUpdateDetails(vgm, id);
}


    
}
