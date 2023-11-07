package view;

import java.util.Date;
import javax.swing.JPanel;
import control.CIncomeManagement;

public class VIncomeManagement extends javax.swing.JPanel {

    public VIncomeManagement() {
        initComponents();       
        ClearErrorMessagesNewIncome();
        ClearErrorMessagesUpdateIncome();
        pnl_income_newincome.setVisible(false);
        pnl_income_updateincome.setVisible(false);
        LoadIncomeTable();        
    }
    
    CIncomeManagement cim = new CIncomeManagement();
    public  String updateid;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btn_income_newincome = new javax.swing.JButton();
        pnl_income_newincome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_newincomename_error = new javax.swing.JLabel();
        lbl_newincomeamount_error = new javax.swing.JLabel();
        lbl_newincomecategory_error = new javax.swing.JLabel();
        lbl_newincomedate_error = new javax.swing.JLabel();
        date_newnicome_date = new com.toedter.calendar.JDateChooser();
        cmb_newincome_category = new javax.swing.JComboBox<>();
        txt_newincome_amount = new javax.swing.JTextField();
        txt_newincome_name = new javax.swing.JTextField();
        scrollpane_newincome_note = new javax.swing.JScrollPane();
        txt_newincome_note = new javax.swing.JTextArea();
        btn_newincome_add = new javax.swing.JButton();
        btn_newincome_clear = new javax.swing.JButton();
        btn_newincome_close = new javax.swing.JButton();
        pnl_income_updateincome = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_updateincomename_error = new javax.swing.JLabel();
        lbl_updateincomeamount_error = new javax.swing.JLabel();
        lbl_updateincomecategory_error = new javax.swing.JLabel();
        lbl_updateincomedate_error = new javax.swing.JLabel();
        cmb_updateincome_category = new javax.swing.JComboBox<>();
        date_updateincome_date = new com.toedter.calendar.JDateChooser();
        txt_updateincome_amount = new javax.swing.JTextField();
        txt_updateincome_name = new javax.swing.JTextField();
        scrollpane_newincome_note1 = new javax.swing.JScrollPane();
        txt_updateincome_note = new javax.swing.JTextArea();
        btn_updateincome_update = new javax.swing.JButton();
        btn_updateincome_clear = new javax.swing.JButton();
        btn_updateincome_close = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_incomedetials = new javax.swing.JTable();

        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(788, 600));
        setMinimumSize(new java.awt.Dimension(788, 600));
        setPreferredSize(new java.awt.Dimension(788, 600));

        jLabel4.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Income Managment");

        btn_income_newincome.setBackground(new java.awt.Color(0, 0, 153));
        btn_income_newincome.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_income_newincome.setForeground(new java.awt.Color(255, 255, 255));
        btn_income_newincome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-add-15.png"))); // NOI18N
        btn_income_newincome.setText("New Income");
        btn_income_newincome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_income_newincome.setBorderPainted(false);
        btn_income_newincome.setFocusable(false);
        btn_income_newincome.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_income_newincome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_income_newincomeActionPerformed(evt);
            }
        });

        pnl_income_newincome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.lightGray));
        pnl_income_newincome.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Income Name");
        pnl_income_newincome.add(jLabel1);
        jLabel1.setBounds(26, 29, 92, 18);

        jLabel2.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Income Amount");
        pnl_income_newincome.add(jLabel2);
        jLabel2.setBounds(26, 87, 104, 18);

        jLabel3.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Income Category");
        pnl_income_newincome.add(jLabel3);
        jLabel3.setBounds(26, 145, 119, 18);

        jLabel5.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Income Date");
        pnl_income_newincome.add(jLabel5);
        jLabel5.setBounds(432, 29, 92, 18);

        jLabel6.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Income Note (Optional)");
        pnl_income_newincome.add(jLabel6);
        jLabel6.setBounds(432, 87, 170, 18);

        lbl_newincomename_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newincomename_error.setText("Income Name Error");
        pnl_income_newincome.add(lbl_newincomename_error);
        lbl_newincomename_error.setBounds(168, 60, 200, 16);

        lbl_newincomeamount_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newincomeamount_error.setText("Income Name Error");
        pnl_income_newincome.add(lbl_newincomeamount_error);
        lbl_newincomeamount_error.setBounds(168, 118, 200, 16);

        lbl_newincomecategory_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newincomecategory_error.setText("Income Name Error");
        pnl_income_newincome.add(lbl_newincomecategory_error);
        lbl_newincomecategory_error.setBounds(168, 176, 200, 16);

        lbl_newincomedate_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newincomedate_error.setText("Income Name Error");
        pnl_income_newincome.add(lbl_newincomedate_error);
        lbl_newincomedate_error.setBounds(530, 60, 210, 16);

        date_newnicome_date.setForeground(new java.awt.Color(102, 102, 102));
        date_newnicome_date.setDateFormatString("yyyy/MM/dd");
        date_newnicome_date.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        date_newnicome_date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_newnicome_datePropertyChange(evt);
            }
        });
        pnl_income_newincome.add(date_newnicome_date);
        date_newnicome_date.setBounds(530, 24, 210, 30);

        cmb_newincome_category.setForeground(new java.awt.Color(102, 102, 102));
        cmb_newincome_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salary", "Passive", "Portofolio ", "Buisness ", "Other" }));
        cmb_newincome_category.setMaximumSize(new java.awt.Dimension(200, 30));
        cmb_newincome_category.setMinimumSize(new java.awt.Dimension(200, 30));
        cmb_newincome_category.setPreferredSize(new java.awt.Dimension(200, 30));
        cmb_newincome_category.setRequestFocusEnabled(false);
        pnl_income_newincome.add(cmb_newincome_category);
        cmb_newincome_category.setBounds(168, 140, 200, 30);

        txt_newincome_amount.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        txt_newincome_amount.setForeground(new java.awt.Color(102, 102, 102));
        txt_newincome_amount.setMaximumSize(new java.awt.Dimension(200, 30));
        txt_newincome_amount.setMinimumSize(new java.awt.Dimension(200, 30));
        txt_newincome_amount.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_newincome_amount.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_newincome_amountInputMethodTextChanged(evt);
            }
        });
        txt_newincome_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_newincome_amountKeyReleased(evt);
            }
        });
        pnl_income_newincome.add(txt_newincome_amount);
        txt_newincome_amount.setBounds(168, 82, 200, 30);

        txt_newincome_name.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        txt_newincome_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_newincome_name.setMaximumSize(new java.awt.Dimension(200, 30));
        txt_newincome_name.setMinimumSize(new java.awt.Dimension(200, 30));
        txt_newincome_name.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_newincome_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_newincome_nameActionPerformed(evt);
            }
        });
        txt_newincome_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_newincome_nameKeyReleased(evt);
            }
        });
        pnl_income_newincome.add(txt_newincome_name);
        txt_newincome_name.setBounds(168, 24, 200, 30);

        txt_newincome_note.setColumns(20);
        txt_newincome_note.setForeground(new java.awt.Color(102, 102, 102));
        txt_newincome_note.setRows(5);
        scrollpane_newincome_note.setViewportView(txt_newincome_note);

        pnl_income_newincome.add(scrollpane_newincome_note);
        scrollpane_newincome_note.setBounds(432, 118, 308, 74);

        btn_newincome_add.setBackground(new java.awt.Color(0, 0, 153));
        btn_newincome_add.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_newincome_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_newincome_add.setText("Add");
        btn_newincome_add.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_newincome_add.setBorderPainted(false);
        btn_newincome_add.setFocusable(false);
        btn_newincome_add.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_newincome_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newincome_addActionPerformed(evt);
            }
        });
        pnl_income_newincome.add(btn_newincome_add);
        btn_newincome_add.setBounds(446, 210, 90, 30);

        btn_newincome_clear.setBackground(new java.awt.Color(0, 0, 153));
        btn_newincome_clear.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_newincome_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_newincome_clear.setText("Clear");
        btn_newincome_clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_newincome_clear.setBorderPainted(false);
        btn_newincome_clear.setFocusable(false);
        btn_newincome_clear.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_newincome_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newincome_clearActionPerformed(evt);
            }
        });
        pnl_income_newincome.add(btn_newincome_clear);
        btn_newincome_clear.setBounds(548, 210, 90, 30);

        btn_newincome_close.setBackground(new java.awt.Color(153, 0, 0));
        btn_newincome_close.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_newincome_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_newincome_close.setText("Close");
        btn_newincome_close.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_newincome_close.setBorderPainted(false);
        btn_newincome_close.setFocusable(false);
        btn_newincome_close.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_newincome_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newincome_closeActionPerformed(evt);
            }
        });
        pnl_income_newincome.add(btn_newincome_close);
        btn_newincome_close.setBounds(650, 210, 90, 30);

        pnl_income_updateincome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.lightGray));
        pnl_income_updateincome.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Income Name");
        pnl_income_updateincome.add(jLabel7);
        jLabel7.setBounds(26, 29, 92, 18);

        jLabel8.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Income Amount");
        pnl_income_updateincome.add(jLabel8);
        jLabel8.setBounds(26, 87, 104, 18);

        jLabel10.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Income Date");
        pnl_income_updateincome.add(jLabel10);
        jLabel10.setBounds(432, 29, 92, 18);

        jLabel11.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Income Note");
        pnl_income_updateincome.add(jLabel11);
        jLabel11.setBounds(432, 87, 92, 18);

        lbl_updateincomename_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_updateincomename_error.setText("Income Name Error");
        pnl_income_updateincome.add(lbl_updateincomename_error);
        lbl_updateincomename_error.setBounds(168, 60, 200, 16);

        lbl_updateincomeamount_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_updateincomeamount_error.setText("Income Name Error");
        pnl_income_updateincome.add(lbl_updateincomeamount_error);
        lbl_updateincomeamount_error.setBounds(168, 118, 200, 16);

        lbl_updateincomecategory_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_updateincomecategory_error.setText("Income Name Error");
        pnl_income_updateincome.add(lbl_updateincomecategory_error);
        lbl_updateincomecategory_error.setBounds(168, 176, 200, 16);

        lbl_updateincomedate_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_updateincomedate_error.setText("Income Name Error");
        pnl_income_updateincome.add(lbl_updateincomedate_error);
        lbl_updateincomedate_error.setBounds(530, 60, 210, 16);

        cmb_updateincome_category.setForeground(new java.awt.Color(102, 102, 102));
        cmb_updateincome_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salary", "Passive", "Portofolio ", "Buisness ", "Other" }));
        cmb_updateincome_category.setMaximumSize(new java.awt.Dimension(200, 30));
        cmb_updateincome_category.setMinimumSize(new java.awt.Dimension(200, 30));
        cmb_updateincome_category.setPreferredSize(new java.awt.Dimension(200, 30));
        cmb_updateincome_category.setRequestFocusEnabled(false);
        pnl_income_updateincome.add(cmb_updateincome_category);
        cmb_updateincome_category.setBounds(168, 140, 200, 30);

        date_updateincome_date.setForeground(new java.awt.Color(102, 102, 102));
        date_updateincome_date.setDateFormatString("yyyy/MM/dd");
        date_updateincome_date.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        date_updateincome_date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_updateincome_datePropertyChange(evt);
            }
        });
        pnl_income_updateincome.add(date_updateincome_date);
        date_updateincome_date.setBounds(530, 24, 210, 30);

        txt_updateincome_amount.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        txt_updateincome_amount.setForeground(new java.awt.Color(102, 102, 102));
        txt_updateincome_amount.setMaximumSize(new java.awt.Dimension(200, 30));
        txt_updateincome_amount.setMinimumSize(new java.awt.Dimension(200, 30));
        txt_updateincome_amount.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_updateincome_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_updateincome_amountKeyReleased(evt);
            }
        });
        pnl_income_updateincome.add(txt_updateincome_amount);
        txt_updateincome_amount.setBounds(168, 82, 200, 30);

        txt_updateincome_name.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        txt_updateincome_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_updateincome_name.setMaximumSize(new java.awt.Dimension(200, 30));
        txt_updateincome_name.setMinimumSize(new java.awt.Dimension(200, 30));
        txt_updateincome_name.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_updateincome_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_updateincome_nameKeyReleased(evt);
            }
        });
        pnl_income_updateincome.add(txt_updateincome_name);
        txt_updateincome_name.setBounds(168, 24, 200, 30);

        txt_updateincome_note.setColumns(20);
        txt_updateincome_note.setForeground(new java.awt.Color(102, 102, 102));
        txt_updateincome_note.setRows(5);
        scrollpane_newincome_note1.setViewportView(txt_updateincome_note);

        pnl_income_updateincome.add(scrollpane_newincome_note1);
        scrollpane_newincome_note1.setBounds(432, 118, 308, 74);

        btn_updateincome_update.setBackground(new java.awt.Color(204, 153, 0));
        btn_updateincome_update.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_updateincome_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_updateincome_update.setText("Update");
        btn_updateincome_update.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_updateincome_update.setBorderPainted(false);
        btn_updateincome_update.setFocusable(false);
        btn_updateincome_update.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_updateincome_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateincome_updateActionPerformed(evt);
            }
        });
        pnl_income_updateincome.add(btn_updateincome_update);
        btn_updateincome_update.setBounds(446, 210, 90, 30);

        btn_updateincome_clear.setBackground(new java.awt.Color(0, 0, 153));
        btn_updateincome_clear.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_updateincome_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_updateincome_clear.setText("Clear");
        btn_updateincome_clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_updateincome_clear.setBorderPainted(false);
        btn_updateincome_clear.setFocusable(false);
        btn_updateincome_clear.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_updateincome_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateincome_clearActionPerformed(evt);
            }
        });
        pnl_income_updateincome.add(btn_updateincome_clear);
        btn_updateincome_clear.setBounds(548, 210, 90, 30);

        btn_updateincome_close.setBackground(new java.awt.Color(153, 0, 0));
        btn_updateincome_close.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_updateincome_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_updateincome_close.setText("Close");
        btn_updateincome_close.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_updateincome_close.setBorderPainted(false);
        btn_updateincome_close.setFocusable(false);
        btn_updateincome_close.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_updateincome_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateincome_closeActionPerformed(evt);
            }
        });
        pnl_income_updateincome.add(btn_updateincome_close);
        btn_updateincome_close.setBounds(650, 210, 90, 30);

        jLabel12.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Income Category");
        pnl_income_updateincome.add(jLabel12);
        jLabel12.setBounds(26, 145, 119, 18);

        table_incomedetials.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        table_incomedetials.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Income Date", "Income Name", "Income Category", "Income Amount", "Income Note", "Actions"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_incomedetials.setRowHeight(50);
        jScrollPane1.setViewportView(table_incomedetials);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                    .addComponent(pnl_income_updateincome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_income_newincome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_income_newincome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_income_newincome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_income_newincome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_income_updateincome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btn_income_newincomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_income_newincomeActionPerformed
        OpenInputPanels(pnl_income_newincome);
    }//GEN-LAST:event_btn_income_newincomeActionPerformed

    private void btn_newincome_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newincome_addActionPerformed
        if(true == cim.ValidateNewIncomeAll(txt_newincome_name.getText(),date_newnicome_date.getDate(),txt_newincome_amount.getText(),this))
        {
            String incomename = txt_newincome_name.getText();
            String incomeamount = txt_newincome_amount.getText();
            String incomecategory = cmb_newincome_category.getSelectedItem().toString();
            String incomenote = txt_newincome_note.getText();
            
            cim.AddNewIncome(incomename, incomeamount,date_newnicome_date.getDate(), incomecategory, incomenote);
            ClearNewIncomeInputs();
            LoadIncomeTable();
        }
    }//GEN-LAST:event_btn_newincome_addActionPerformed

    private void btn_newincome_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newincome_clearActionPerformed
         ClearNewIncomeInputs();
    }//GEN-LAST:event_btn_newincome_clearActionPerformed

    private void btn_newincome_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newincome_closeActionPerformed
        pnl_income_newincome.setVisible(false);
    }//GEN-LAST:event_btn_newincome_closeActionPerformed

    private void btn_updateincome_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateincome_updateActionPerformed
        if(true == cim.ValidateUpdateIncomeAll(txt_updateincome_name.getText(),date_updateincome_date.getDate(),txt_updateincome_amount.getText(),this))
        {
            String incomename = txt_updateincome_name.getText();
            String incomeamount = txt_updateincome_amount.getText();
            String incomecategory = cmb_updateincome_category.getSelectedItem().toString();
            String incomenote = txt_updateincome_note.getText();
            
            cim.UpdateIncome(updateid,incomename, incomeamount,date_updateincome_date.getDate(), incomecategory, incomenote);
            ClearNewIncomeInputs();
            LoadIncomeTable();
        }
    }//GEN-LAST:event_btn_updateincome_updateActionPerformed

    private void btn_updateincome_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateincome_clearActionPerformed
        ClearNewUpdateInputs();
    }//GEN-LAST:event_btn_updateincome_clearActionPerformed

    private void btn_updateincome_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateincome_closeActionPerformed
        
        pnl_income_updateincome.setVisible(false);
    }//GEN-LAST:event_btn_updateincome_closeActionPerformed

    private void txt_newincome_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_newincome_nameKeyReleased
        cim.ValidateNewIncomeName(txt_newincome_name.getText(),this);
    }//GEN-LAST:event_txt_newincome_nameKeyReleased

    private void txt_newincome_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_newincome_nameActionPerformed
        
    }//GEN-LAST:event_txt_newincome_nameActionPerformed

    private void txt_newincome_amountInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_newincome_amountInputMethodTextChanged
        
    }//GEN-LAST:event_txt_newincome_amountInputMethodTextChanged

    private void txt_newincome_amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_newincome_amountKeyReleased
        cim.ValidateNewIncomeAmount(txt_newincome_amount.getText(), this);
    }//GEN-LAST:event_txt_newincome_amountKeyReleased

    private void date_newnicome_datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_newnicome_datePropertyChange
        
        if(true == pnl_income_newincome.isVisible())
        {
            cim.ValidateNewIncomeDate(date_newnicome_date.getDate(), this);
        }       
    }//GEN-LAST:event_date_newnicome_datePropertyChange

    private void txt_updateincome_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_updateincome_nameKeyReleased
        cim.ValidateUpdateIncomeName(txt_updateincome_name.getText(),this);
    }//GEN-LAST:event_txt_updateincome_nameKeyReleased

    private void txt_updateincome_amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_updateincome_amountKeyReleased
        cim.ValidateUpdateIncomeAmount(txt_updateincome_amount.getText(), this);
    }//GEN-LAST:event_txt_updateincome_amountKeyReleased

    private void date_updateincome_datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_updateincome_datePropertyChange
        if(true == pnl_income_updateincome.isVisible())
        {
            cim.ValidateUpdateIncomeDate(date_updateincome_date.getDate(), this);
        }
    }//GEN-LAST:event_date_updateincome_datePropertyChange
    
    

    
    void ClearErrorMessagesNewIncome () 
    {
        lbl_newincomecategory_error.setVisible (false);
        lbl_newincomedate_error.setVisible (false);
        lbl_newincomename_error.setVisible (false);
        lbl_newincomeamount_error.setVisible (false);
    }
    
    void ClearErrorMessagesUpdateIncome () 
    {
        lbl_updateincomecategory_error.setVisible (false);
        lbl_updateincomedate_error.setVisible (false);
        lbl_updateincomename_error.setVisible (false);
        lbl_updateincomeamount_error.setVisible (false);
    }
    
    void ClearNewIncomeInputs()
    {
        ClearErrorMessagesNewIncome ();
        txt_newincome_amount.setText ("");
        txt_newincome_name.setText ("");
        txt_newincome_note.setText ("");
        cmb_newincome_category.setSelectedIndex(0);
        Date date = new Date ();
        date_newnicome_date.setDate(date);
    }
    
    void ClearNewUpdateInputs()
    {
        ClearErrorMessagesUpdateIncome () ;
        txt_updateincome_amount.setText ("");
        txt_updateincome_name.setText ("");
        txt_updateincome_note.setText ("");
        cmb_updateincome_category.setSelectedIndex(0);
        Date date = new Date ();
        date_updateincome_date.setDate(date);
    }
    
    public void OpenInputPanels(JPanel pnl)
    {
        ClearNewIncomeInputs();
        ClearNewUpdateInputs();
        pnl_income_newincome.setVisible(false);
        pnl_income_updateincome.setVisible(false);
        
        pnl.setVisible(true);
    }
    
    public void LoadIncomeTable()
    {
        cim.LoadIncomeTable(this);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_income_newincome;
    private javax.swing.JButton btn_newincome_add;
    private javax.swing.JButton btn_newincome_clear;
    private javax.swing.JButton btn_newincome_close;
    private javax.swing.JButton btn_updateincome_clear;
    private javax.swing.JButton btn_updateincome_close;
    private javax.swing.JButton btn_updateincome_update;
    private javax.swing.JComboBox<String> cmb_newincome_category;
    public javax.swing.JComboBox<String> cmb_updateincome_category;
    private com.toedter.calendar.JDateChooser date_newnicome_date;
    public com.toedter.calendar.JDateChooser date_updateincome_date;
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
    public javax.swing.JLabel lbl_newincomeamount_error;
    public javax.swing.JLabel lbl_newincomecategory_error;
    public javax.swing.JLabel lbl_newincomedate_error;
    public javax.swing.JLabel lbl_newincomename_error;
    public javax.swing.JLabel lbl_updateincomeamount_error;
    public javax.swing.JLabel lbl_updateincomecategory_error;
    public javax.swing.JLabel lbl_updateincomedate_error;
    public javax.swing.JLabel lbl_updateincomename_error;
    private javax.swing.JPanel pnl_income_newincome;
    public javax.swing.JPanel pnl_income_updateincome;
    private javax.swing.JScrollPane scrollpane_newincome_note;
    private javax.swing.JScrollPane scrollpane_newincome_note1;
    public javax.swing.JTable table_incomedetials;
    private javax.swing.JTextField txt_newincome_amount;
    private javax.swing.JTextField txt_newincome_name;
    private javax.swing.JTextArea txt_newincome_note;
    public javax.swing.JTextField txt_updateincome_amount;
    public javax.swing.JTextField txt_updateincome_name;
    public javax.swing.JTextArea txt_updateincome_note;
    // End of variables declaration//GEN-END:variables
}
