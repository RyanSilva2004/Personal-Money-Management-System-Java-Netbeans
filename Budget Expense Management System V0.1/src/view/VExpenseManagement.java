package view;
import java.util.Date;
import javax.swing.JPanel;
import control.CExpenseManagement;

public class VExpenseManagement extends javax.swing.JPanel {

    
    public VExpenseManagement()
    {
        initComponents();
        ClearErrorMessagesNewExpense();
        ClearErrorMessagesUpdateExpense();
        pnl_expense_newexpense.setVisible(false);
        pnl_expense_updateexpense.setVisible(false);
        LoadExpenseTable();
    }
    
    CExpenseManagement cem = new CExpenseManagement();
    public  String updateid;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btn_expense_newexpense = new javax.swing.JButton();
        pnl_expense_newexpense = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_newexpensename_error = new javax.swing.JLabel();
        lbl_newexpenseamount_error = new javax.swing.JLabel();
        lbl_newexpensecategory_error = new javax.swing.JLabel();
        lbl_newexpensedate_error = new javax.swing.JLabel();
        date_newexpense_date = new com.toedter.calendar.JDateChooser();
        cmb_newexpense_category = new javax.swing.JComboBox<>();
        txt_newexpense_amount = new javax.swing.JTextField();
        txt_newexpense_name = new javax.swing.JTextField();
        scrollpane_newincome_note = new javax.swing.JScrollPane();
        txt_newexpense_note = new javax.swing.JTextArea();
        btn_newexpense_add = new javax.swing.JButton();
        btn_newexpense_clear = new javax.swing.JButton();
        btn_newexpense_close = new javax.swing.JButton();
        pnl_expense_updateexpense = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_updateexpensename_error = new javax.swing.JLabel();
        lbl_updateexpenseamount_error = new javax.swing.JLabel();
        lbl_updateexpensecategory_error = new javax.swing.JLabel();
        lbl_updateexpensedate_error = new javax.swing.JLabel();
        cmb_updateexpense_category = new javax.swing.JComboBox<>();
        date_updateexpense_date = new com.toedter.calendar.JDateChooser();
        txt_updateexpense_amount = new javax.swing.JTextField();
        txt_updateexpense_name = new javax.swing.JTextField();
        scrollpane_newincome_note1 = new javax.swing.JScrollPane();
        txt_updateexpense_note = new javax.swing.JTextArea();
        btn_updateexpense_update = new javax.swing.JButton();
        btn_updateexpense_clear = new javax.swing.JButton();
        btn_updateexpense_close = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_expensedetials = new javax.swing.JTable();

        jLabel4.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Expense Managment");

        btn_expense_newexpense.setBackground(new java.awt.Color(255, 153, 0));
        btn_expense_newexpense.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_expense_newexpense.setForeground(new java.awt.Color(255, 255, 255));
        btn_expense_newexpense.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-add-15.png"))); // NOI18N
        btn_expense_newexpense.setText("New Expense");
        btn_expense_newexpense.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_expense_newexpense.setBorderPainted(false);
        btn_expense_newexpense.setFocusable(false);
        btn_expense_newexpense.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_expense_newexpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expense_newexpenseActionPerformed(evt);
            }
        });

        pnl_expense_newexpense.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.lightGray));
        pnl_expense_newexpense.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Expense Name");
        pnl_expense_newexpense.add(jLabel1);
        jLabel1.setBounds(26, 29, 92, 18);

        jLabel2.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Expense  Amount");
        pnl_expense_newexpense.add(jLabel2);
        jLabel2.setBounds(26, 87, 120, 18);

        jLabel3.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Expense Category");
        pnl_expense_newexpense.add(jLabel3);
        jLabel3.setBounds(26, 145, 119, 18);

        jLabel5.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Expense  Date");
        pnl_expense_newexpense.add(jLabel5);
        jLabel5.setBounds(432, 29, 92, 18);

        jLabel6.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Expense  Note (Optional)");
        pnl_expense_newexpense.add(jLabel6);
        jLabel6.setBounds(432, 87, 170, 18);

        lbl_newexpensename_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newexpensename_error.setText("Income Name Error");
        pnl_expense_newexpense.add(lbl_newexpensename_error);
        lbl_newexpensename_error.setBounds(168, 60, 200, 16);

        lbl_newexpenseamount_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newexpenseamount_error.setText("Income Name Error");
        pnl_expense_newexpense.add(lbl_newexpenseamount_error);
        lbl_newexpenseamount_error.setBounds(168, 118, 200, 16);

        lbl_newexpensecategory_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newexpensecategory_error.setText("Income Name Error");
        pnl_expense_newexpense.add(lbl_newexpensecategory_error);
        lbl_newexpensecategory_error.setBounds(168, 176, 200, 16);

        lbl_newexpensedate_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newexpensedate_error.setText("Income Name Error");
        pnl_expense_newexpense.add(lbl_newexpensedate_error);
        lbl_newexpensedate_error.setBounds(530, 60, 210, 16);

        date_newexpense_date.setForeground(new java.awt.Color(102, 102, 102));
        date_newexpense_date.setDateFormatString("yyyy/MM/dd");
        date_newexpense_date.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        date_newexpense_date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_newexpense_datePropertyChange(evt);
            }
        });
        pnl_expense_newexpense.add(date_newexpense_date);
        date_newexpense_date.setBounds(530, 24, 210, 30);

        cmb_newexpense_category.setForeground(new java.awt.Color(102, 102, 102));
        cmb_newexpense_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Housing", "Utilities", "Food", "Transportation", "Healthcare", "Entertainment", "Other" }));
        cmb_newexpense_category.setMaximumSize(new java.awt.Dimension(200, 30));
        cmb_newexpense_category.setMinimumSize(new java.awt.Dimension(200, 30));
        cmb_newexpense_category.setPreferredSize(new java.awt.Dimension(200, 30));
        cmb_newexpense_category.setRequestFocusEnabled(false);
        pnl_expense_newexpense.add(cmb_newexpense_category);
        cmb_newexpense_category.setBounds(168, 140, 200, 30);

        txt_newexpense_amount.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        txt_newexpense_amount.setForeground(new java.awt.Color(102, 102, 102));
        txt_newexpense_amount.setMaximumSize(new java.awt.Dimension(200, 30));
        txt_newexpense_amount.setMinimumSize(new java.awt.Dimension(200, 30));
        txt_newexpense_amount.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_newexpense_amount.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_newexpense_amountInputMethodTextChanged(evt);
            }
        });
        txt_newexpense_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_newexpense_amountKeyReleased(evt);
            }
        });
        pnl_expense_newexpense.add(txt_newexpense_amount);
        txt_newexpense_amount.setBounds(168, 82, 200, 30);

        txt_newexpense_name.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        txt_newexpense_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_newexpense_name.setMaximumSize(new java.awt.Dimension(200, 30));
        txt_newexpense_name.setMinimumSize(new java.awt.Dimension(200, 30));
        txt_newexpense_name.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_newexpense_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_newexpense_nameActionPerformed(evt);
            }
        });
        txt_newexpense_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_newexpense_nameKeyReleased(evt);
            }
        });
        pnl_expense_newexpense.add(txt_newexpense_name);
        txt_newexpense_name.setBounds(168, 24, 200, 30);

        txt_newexpense_note.setColumns(20);
        txt_newexpense_note.setForeground(new java.awt.Color(102, 102, 102));
        txt_newexpense_note.setRows(5);
        scrollpane_newincome_note.setViewportView(txt_newexpense_note);

        pnl_expense_newexpense.add(scrollpane_newincome_note);
        scrollpane_newincome_note.setBounds(432, 118, 308, 74);

        btn_newexpense_add.setBackground(new java.awt.Color(0, 0, 153));
        btn_newexpense_add.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_newexpense_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_newexpense_add.setText("Add");
        btn_newexpense_add.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_newexpense_add.setBorderPainted(false);
        btn_newexpense_add.setFocusable(false);
        btn_newexpense_add.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_newexpense_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newexpense_addActionPerformed(evt);
            }
        });
        pnl_expense_newexpense.add(btn_newexpense_add);
        btn_newexpense_add.setBounds(446, 210, 90, 30);

        btn_newexpense_clear.setBackground(new java.awt.Color(0, 0, 153));
        btn_newexpense_clear.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_newexpense_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_newexpense_clear.setText("Clear");
        btn_newexpense_clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_newexpense_clear.setBorderPainted(false);
        btn_newexpense_clear.setFocusable(false);
        btn_newexpense_clear.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_newexpense_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newexpense_clearActionPerformed(evt);
            }
        });
        pnl_expense_newexpense.add(btn_newexpense_clear);
        btn_newexpense_clear.setBounds(548, 210, 90, 30);

        btn_newexpense_close.setBackground(new java.awt.Color(153, 0, 0));
        btn_newexpense_close.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_newexpense_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_newexpense_close.setText("Close");
        btn_newexpense_close.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_newexpense_close.setBorderPainted(false);
        btn_newexpense_close.setFocusable(false);
        btn_newexpense_close.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_newexpense_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newexpense_closeActionPerformed(evt);
            }
        });
        pnl_expense_newexpense.add(btn_newexpense_close);
        btn_newexpense_close.setBounds(650, 210, 90, 30);

        pnl_expense_updateexpense.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.lightGray));
        pnl_expense_updateexpense.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Expense Name");
        pnl_expense_updateexpense.add(jLabel7);
        jLabel7.setBounds(26, 29, 92, 18);

        jLabel8.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Expense Amount");
        pnl_expense_updateexpense.add(jLabel8);
        jLabel8.setBounds(26, 87, 110, 18);

        jLabel10.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Expense Date");
        pnl_expense_updateexpense.add(jLabel10);
        jLabel10.setBounds(432, 29, 92, 18);

        jLabel11.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Expense Note");
        pnl_expense_updateexpense.add(jLabel11);
        jLabel11.setBounds(432, 87, 92, 18);

        lbl_updateexpensename_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_updateexpensename_error.setText("Income Name Error");
        pnl_expense_updateexpense.add(lbl_updateexpensename_error);
        lbl_updateexpensename_error.setBounds(168, 60, 200, 16);

        lbl_updateexpenseamount_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_updateexpenseamount_error.setText("Income Name Error");
        pnl_expense_updateexpense.add(lbl_updateexpenseamount_error);
        lbl_updateexpenseamount_error.setBounds(168, 118, 200, 16);

        lbl_updateexpensecategory_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_updateexpensecategory_error.setText("Income Name Error");
        pnl_expense_updateexpense.add(lbl_updateexpensecategory_error);
        lbl_updateexpensecategory_error.setBounds(168, 176, 200, 16);

        lbl_updateexpensedate_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_updateexpensedate_error.setText("Income Name Error");
        pnl_expense_updateexpense.add(lbl_updateexpensedate_error);
        lbl_updateexpensedate_error.setBounds(530, 60, 210, 16);

        cmb_updateexpense_category.setForeground(new java.awt.Color(102, 102, 102));
        cmb_updateexpense_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Housing", "Utilities", "Food", "Transportation", "Healthcare", "Entertainment", "Other" }));
        cmb_updateexpense_category.setMaximumSize(new java.awt.Dimension(200, 30));
        cmb_updateexpense_category.setMinimumSize(new java.awt.Dimension(200, 30));
        cmb_updateexpense_category.setPreferredSize(new java.awt.Dimension(200, 30));
        cmb_updateexpense_category.setRequestFocusEnabled(false);
        pnl_expense_updateexpense.add(cmb_updateexpense_category);
        cmb_updateexpense_category.setBounds(168, 140, 200, 30);

        date_updateexpense_date.setForeground(new java.awt.Color(102, 102, 102));
        date_updateexpense_date.setDateFormatString("yyyy/MM/dd");
        date_updateexpense_date.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        date_updateexpense_date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_updateexpense_datePropertyChange(evt);
            }
        });
        pnl_expense_updateexpense.add(date_updateexpense_date);
        date_updateexpense_date.setBounds(530, 24, 210, 30);

        txt_updateexpense_amount.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        txt_updateexpense_amount.setForeground(new java.awt.Color(102, 102, 102));
        txt_updateexpense_amount.setMaximumSize(new java.awt.Dimension(200, 30));
        txt_updateexpense_amount.setMinimumSize(new java.awt.Dimension(200, 30));
        txt_updateexpense_amount.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_updateexpense_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_updateexpense_amountKeyReleased(evt);
            }
        });
        pnl_expense_updateexpense.add(txt_updateexpense_amount);
        txt_updateexpense_amount.setBounds(168, 82, 200, 30);

        txt_updateexpense_name.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        txt_updateexpense_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_updateexpense_name.setMaximumSize(new java.awt.Dimension(200, 30));
        txt_updateexpense_name.setMinimumSize(new java.awt.Dimension(200, 30));
        txt_updateexpense_name.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_updateexpense_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_updateexpense_nameKeyReleased(evt);
            }
        });
        pnl_expense_updateexpense.add(txt_updateexpense_name);
        txt_updateexpense_name.setBounds(168, 24, 200, 30);

        txt_updateexpense_note.setColumns(20);
        txt_updateexpense_note.setForeground(new java.awt.Color(102, 102, 102));
        txt_updateexpense_note.setRows(5);
        scrollpane_newincome_note1.setViewportView(txt_updateexpense_note);

        pnl_expense_updateexpense.add(scrollpane_newincome_note1);
        scrollpane_newincome_note1.setBounds(432, 118, 308, 74);

        btn_updateexpense_update.setBackground(new java.awt.Color(204, 153, 0));
        btn_updateexpense_update.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_updateexpense_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_updateexpense_update.setText("Update");
        btn_updateexpense_update.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_updateexpense_update.setBorderPainted(false);
        btn_updateexpense_update.setFocusable(false);
        btn_updateexpense_update.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_updateexpense_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateexpense_updateActionPerformed(evt);
            }
        });
        pnl_expense_updateexpense.add(btn_updateexpense_update);
        btn_updateexpense_update.setBounds(446, 210, 90, 30);

        btn_updateexpense_clear.setBackground(new java.awt.Color(0, 0, 153));
        btn_updateexpense_clear.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_updateexpense_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_updateexpense_clear.setText("Clear");
        btn_updateexpense_clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_updateexpense_clear.setBorderPainted(false);
        btn_updateexpense_clear.setFocusable(false);
        btn_updateexpense_clear.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_updateexpense_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateexpense_clearActionPerformed(evt);
            }
        });
        pnl_expense_updateexpense.add(btn_updateexpense_clear);
        btn_updateexpense_clear.setBounds(548, 210, 90, 30);

        btn_updateexpense_close.setBackground(new java.awt.Color(153, 0, 0));
        btn_updateexpense_close.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_updateexpense_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_updateexpense_close.setText("Close");
        btn_updateexpense_close.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_updateexpense_close.setBorderPainted(false);
        btn_updateexpense_close.setFocusable(false);
        btn_updateexpense_close.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_updateexpense_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateexpense_closeActionPerformed(evt);
            }
        });
        pnl_expense_updateexpense.add(btn_updateexpense_close);
        btn_updateexpense_close.setBounds(650, 210, 90, 30);

        jLabel12.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Expense Category");
        pnl_expense_updateexpense.add(jLabel12);
        jLabel12.setBounds(26, 145, 119, 18);

        table_expensedetials.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        table_expensedetials.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Expense Date", "Expense Name", "Expense Category", "Expense Amount", "Expense Note", "Actions"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_expensedetials.setRowHeight(50);
        jScrollPane1.setViewportView(table_expensedetials);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel4)
                        .addGap(314, 314, 314))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnl_expense_updateexpense, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_expense_newexpense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_expense_newexpense, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_expense_newexpense, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_expense_newexpense, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_expense_updateexpense, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_expense_newexpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expense_newexpenseActionPerformed
        OpenInputPanels(pnl_expense_newexpense);
    }//GEN-LAST:event_btn_expense_newexpenseActionPerformed

    private void date_newexpense_datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_newexpense_datePropertyChange

        if(true == pnl_expense_newexpense.isVisible())
        {
            cem.ValidateNewExpenseDate(date_newexpense_date.getDate(), this);
        }
    }//GEN-LAST:event_date_newexpense_datePropertyChange

    private void txt_newexpense_amountInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_newexpense_amountInputMethodTextChanged

    }//GEN-LAST:event_txt_newexpense_amountInputMethodTextChanged

    private void txt_newexpense_amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_newexpense_amountKeyReleased
        cem.ValidateNewExpenseAmount(txt_newexpense_amount.getText(), this);
    }//GEN-LAST:event_txt_newexpense_amountKeyReleased

    private void txt_newexpense_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_newexpense_nameActionPerformed

    }//GEN-LAST:event_txt_newexpense_nameActionPerformed

    private void txt_newexpense_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_newexpense_nameKeyReleased
        cem.ValidateNewExpenseName(txt_newexpense_name.getText(),this);
    }//GEN-LAST:event_txt_newexpense_nameKeyReleased

    private void btn_newexpense_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newexpense_addActionPerformed
        if(true == cem.ValidateNewExpenseAll(txt_newexpense_name.getText(),date_newexpense_date.getDate(),txt_newexpense_amount.getText(),this))
        {
            String incomename = txt_newexpense_name.getText();
            String incomeamount = txt_newexpense_amount.getText();
            String incomecategory = cmb_newexpense_category.getSelectedItem().toString();
            String incomenote = txt_newexpense_note.getText();

            cem.AddNewExpense(incomename, incomeamount,date_newexpense_date.getDate(), incomecategory, incomenote);
            ClearNewExpenseInputs();
            LoadExpenseTable();
        }
    }//GEN-LAST:event_btn_newexpense_addActionPerformed

    private void btn_newexpense_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newexpense_clearActionPerformed
        ClearNewExpenseInputs();
    }//GEN-LAST:event_btn_newexpense_clearActionPerformed

    private void btn_newexpense_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newexpense_closeActionPerformed
        pnl_expense_newexpense.setVisible(false);
    }//GEN-LAST:event_btn_newexpense_closeActionPerformed

    private void date_updateexpense_datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_updateexpense_datePropertyChange
        if(true == pnl_expense_updateexpense.isVisible())
        {
            cem.ValidateUpdateExpenseDate(date_updateexpense_date.getDate(), this);
        }
    }//GEN-LAST:event_date_updateexpense_datePropertyChange

    private void txt_updateexpense_amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_updateexpense_amountKeyReleased
        cem.ValidateUpdateExpenseAmount(txt_updateexpense_amount.getText(), this);
    }//GEN-LAST:event_txt_updateexpense_amountKeyReleased

    private void txt_updateexpense_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_updateexpense_nameKeyReleased
        cem.ValidateUpdateExpenseName(txt_updateexpense_name.getText(),this);
    }//GEN-LAST:event_txt_updateexpense_nameKeyReleased

    private void btn_updateexpense_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateexpense_updateActionPerformed
        if(true == cem.ValidateNewExpenseAll(txt_updateexpense_name.getText(),date_updateexpense_date.getDate(),txt_updateexpense_amount.getText(),this))
        {
            String incomename = txt_updateexpense_name.getText();
            String incomeamount = txt_updateexpense_amount.getText();
            String incomecategory = cmb_updateexpense_category.getSelectedItem().toString();
            String incomenote = txt_updateexpense_note.getText();

            cem.UpdateExpense(updateid,incomename, incomeamount,date_updateexpense_date.getDate(), incomecategory, incomenote);
            ClearNewExpenseInputs();
            LoadExpenseTable();
        }
    }//GEN-LAST:event_btn_updateexpense_updateActionPerformed

    private void btn_updateexpense_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateexpense_clearActionPerformed
        ClearNewUpdateInputs();
    }//GEN-LAST:event_btn_updateexpense_clearActionPerformed

    private void btn_updateexpense_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateexpense_closeActionPerformed

        pnl_expense_updateexpense.setVisible(false);
    }//GEN-LAST:event_btn_updateexpense_closeActionPerformed

    
    
       void ClearErrorMessagesNewExpense () 
    {
        lbl_newexpensecategory_error.setVisible (false);
        lbl_newexpensedate_error.setVisible (false);
        lbl_newexpensename_error.setVisible (false);
        lbl_newexpenseamount_error.setVisible (false);
    }
    
    void ClearErrorMessagesUpdateExpense () 
    {
        lbl_updateexpensecategory_error.setVisible (false);
        lbl_updateexpensedate_error.setVisible (false);
        lbl_updateexpensename_error.setVisible (false);
        lbl_updateexpenseamount_error.setVisible (false);
    }
    
    void ClearNewExpenseInputs()
    {
        ClearErrorMessagesNewExpense ();
        txt_newexpense_amount.setText ("");
        txt_newexpense_name.setText ("");
        txt_newexpense_note.setText ("");
        cmb_newexpense_category.setSelectedIndex(0);
        Date date = new Date ();
        date_newexpense_date.setDate(date);
    }
    
    void ClearNewUpdateInputs()
    {
        ClearErrorMessagesUpdateExpense () ;
        txt_updateexpense_amount.setText ("");
        txt_updateexpense_name.setText ("");
        txt_updateexpense_note.setText ("");
        cmb_updateexpense_category.setSelectedIndex(0);
        Date date = new Date ();
        date_updateexpense_date.setDate(date);
    }
    
    public void OpenInputPanels(JPanel pnl)
    {
        ClearNewExpenseInputs();
        ClearNewUpdateInputs();
        pnl_expense_newexpense.setVisible(false);
        pnl_expense_updateexpense.setVisible(false);
        
        pnl.setVisible(true);
    }
    
    public void LoadExpenseTable()
    {
        cem.LoadExpenseTable(this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_expense_newexpense;
    private javax.swing.JButton btn_newexpense_add;
    private javax.swing.JButton btn_newexpense_clear;
    private javax.swing.JButton btn_newexpense_close;
    private javax.swing.JButton btn_updateexpense_clear;
    private javax.swing.JButton btn_updateexpense_close;
    private javax.swing.JButton btn_updateexpense_update;
    private javax.swing.JComboBox<String> cmb_newexpense_category;
    public javax.swing.JComboBox<String> cmb_updateexpense_category;
    private com.toedter.calendar.JDateChooser date_newexpense_date;
    public com.toedter.calendar.JDateChooser date_updateexpense_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbl_newexpenseamount_error;
    public javax.swing.JLabel lbl_newexpensecategory_error;
    public javax.swing.JLabel lbl_newexpensedate_error;
    public javax.swing.JLabel lbl_newexpensename_error;
    public javax.swing.JLabel lbl_updateexpenseamount_error;
    public javax.swing.JLabel lbl_updateexpensecategory_error;
    public javax.swing.JLabel lbl_updateexpensedate_error;
    public javax.swing.JLabel lbl_updateexpensename_error;
    private javax.swing.JPanel pnl_expense_newexpense;
    public javax.swing.JPanel pnl_expense_updateexpense;
    private javax.swing.JScrollPane scrollpane_newincome_note;
    private javax.swing.JScrollPane scrollpane_newincome_note1;
    public javax.swing.JTable table_expensedetials;
    private javax.swing.JTextField txt_newexpense_amount;
    private javax.swing.JTextField txt_newexpense_name;
    private javax.swing.JTextArea txt_newexpense_note;
    public javax.swing.JTextField txt_updateexpense_amount;
    public javax.swing.JTextField txt_updateexpense_name;
    public javax.swing.JTextArea txt_updateexpense_note;
    // End of variables declaration//GEN-END:variables
}
