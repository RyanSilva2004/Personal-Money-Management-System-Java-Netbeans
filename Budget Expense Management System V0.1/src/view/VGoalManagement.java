package view;
import control.CGoalManagement;

import java.util.Date;
import javax.swing.JPanel;

public class VGoalManagement extends javax.swing.JPanel {

    public VGoalManagement() 
    {
        initComponents();
        ClearNewGoalInputs();
        ClearUpdateGoalInputs();
        pnl_goal_newgoal.setVisible(false);
        pnl_goal_updategoal.setVisible(false);
        LoadGoalTable();
    }
    CGoalManagement cgm = new CGoalManagement();
    public  int updateid;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_goal_newgoal1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_newgoalname_error1 = new javax.swing.JLabel();
        lbl_newgoalamount_error1 = new javax.swing.JLabel();
        lbl_newgoalcategory_error1 = new javax.swing.JLabel();
        date_newgoal_startdate1 = new com.toedter.calendar.JDateChooser();
        cmb_newgoal_category1 = new javax.swing.JComboBox<>();
        txt_newgoal_amount1 = new javax.swing.JTextField();
        txt_newgoal_name1 = new javax.swing.JTextField();
        scrollpane_newincome_note1 = new javax.swing.JScrollPane();
        txt_newgoal_note1 = new javax.swing.JTextArea();
        btn_newgoal_add1 = new javax.swing.JButton();
        btn_newgoal_clear1 = new javax.swing.JButton();
        btn_newgoal_close1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        date_newgoal_enddate1 = new com.toedter.calendar.JDateChooser();
        lbl_newgoalstartdate_error1 = new javax.swing.JLabel();
        lbl_newgoalenddate_error1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_goal_newgoal = new javax.swing.JButton();
        pnl_goal_newgoal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_newgoalname_error = new javax.swing.JLabel();
        lbl_newgoalamount_error = new javax.swing.JLabel();
        lbl_newgoalcategory_error = new javax.swing.JLabel();
        date_newgoal_startdate = new com.toedter.calendar.JDateChooser();
        cmb_newgoal_category = new javax.swing.JComboBox<>();
        txt_newgoal_amount = new javax.swing.JTextField();
        txt_newgoal_name = new javax.swing.JTextField();
        scrollpane_newincome_note = new javax.swing.JScrollPane();
        txt_newgoal_note = new javax.swing.JTextArea();
        btn_newgoal_add = new javax.swing.JButton();
        btn_newgoal_clear = new javax.swing.JButton();
        btn_newgoal_close = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        date_newgoal_enddate = new com.toedter.calendar.JDateChooser();
        lbl_newgoalstartdate_error = new javax.swing.JLabel();
        lbl_newgoalenddate_error = new javax.swing.JLabel();
        pnl_goal_updategoal = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_updategoalname_error = new javax.swing.JLabel();
        lbl_updategoalamount_error = new javax.swing.JLabel();
        lbl_updategoalcategory_error = new javax.swing.JLabel();
        date_updategoal_startdate = new com.toedter.calendar.JDateChooser();
        cmb_updategoal_category = new javax.swing.JComboBox<>();
        txt_updategoal_amount = new javax.swing.JTextField();
        txt_updategoal_name = new javax.swing.JTextField();
        scrollpane_newincome_note2 = new javax.swing.JScrollPane();
        txt_updategoal_note = new javax.swing.JTextArea();
        btn_updategoal_add = new javax.swing.JButton();
        btn_updategoal_clear = new javax.swing.JButton();
        btn_updategoal_close = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        date_updategoal_enddate = new com.toedter.calendar.JDateChooser();
        lbl_updategoalstartdate_error = new javax.swing.JLabel();
        lbl_updategoalenddate_error = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_goaldetails = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();

        pnl_goal_newgoal1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.lightGray));

        jLabel8.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Goal Name");

        jLabel9.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Goal Amount");

        jLabel10.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Goal Category");

        jLabel11.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Start  Date");

        jLabel12.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Additional Note");

        lbl_newgoalname_error1.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newgoalname_error1.setText("Income Name Error");

        lbl_newgoalamount_error1.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newgoalamount_error1.setText("Income Name Error");

        lbl_newgoalcategory_error1.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newgoalcategory_error1.setText("Income Name Error");

        date_newgoal_startdate1.setForeground(new java.awt.Color(102, 102, 102));
        date_newgoal_startdate1.setDateFormatString("yyyy/MM/dd");
        date_newgoal_startdate1.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        date_newgoal_startdate1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_newgoal_startdate1PropertyChange(evt);
            }
        });

        cmb_newgoal_category1.setForeground(new java.awt.Color(102, 102, 102));
        cmb_newgoal_category1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Expense Goal", "Income Goal" }));
        cmb_newgoal_category1.setMaximumSize(new java.awt.Dimension(200, 30));
        cmb_newgoal_category1.setMinimumSize(new java.awt.Dimension(200, 30));
        cmb_newgoal_category1.setPreferredSize(new java.awt.Dimension(200, 30));
        cmb_newgoal_category1.setRequestFocusEnabled(false);

        txt_newgoal_amount1.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        txt_newgoal_amount1.setForeground(new java.awt.Color(102, 102, 102));
        txt_newgoal_amount1.setMaximumSize(new java.awt.Dimension(200, 30));
        txt_newgoal_amount1.setMinimumSize(new java.awt.Dimension(200, 30));
        txt_newgoal_amount1.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_newgoal_amount1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_newgoal_amount1InputMethodTextChanged(evt);
            }
        });
        txt_newgoal_amount1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_newgoal_amount1KeyReleased(evt);
            }
        });

        txt_newgoal_name1.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        txt_newgoal_name1.setForeground(new java.awt.Color(102, 102, 102));
        txt_newgoal_name1.setMaximumSize(new java.awt.Dimension(200, 30));
        txt_newgoal_name1.setMinimumSize(new java.awt.Dimension(200, 30));
        txt_newgoal_name1.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_newgoal_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_newgoal_name1ActionPerformed(evt);
            }
        });
        txt_newgoal_name1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_newgoal_name1KeyReleased(evt);
            }
        });

        txt_newgoal_note1.setColumns(20);
        txt_newgoal_note1.setForeground(new java.awt.Color(102, 102, 102));
        txt_newgoal_note1.setRows(5);
        scrollpane_newincome_note1.setViewportView(txt_newgoal_note1);

        btn_newgoal_add1.setBackground(new java.awt.Color(0, 0, 153));
        btn_newgoal_add1.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_newgoal_add1.setForeground(new java.awt.Color(255, 255, 255));
        btn_newgoal_add1.setText("Add");
        btn_newgoal_add1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_newgoal_add1.setBorderPainted(false);
        btn_newgoal_add1.setFocusable(false);
        btn_newgoal_add1.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_newgoal_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newgoal_add1ActionPerformed(evt);
            }
        });

        btn_newgoal_clear1.setBackground(new java.awt.Color(0, 0, 153));
        btn_newgoal_clear1.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_newgoal_clear1.setForeground(new java.awt.Color(255, 255, 255));
        btn_newgoal_clear1.setText("Clear");
        btn_newgoal_clear1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_newgoal_clear1.setBorderPainted(false);
        btn_newgoal_clear1.setFocusable(false);
        btn_newgoal_clear1.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_newgoal_clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newgoal_clear1ActionPerformed(evt);
            }
        });

        btn_newgoal_close1.setBackground(new java.awt.Color(153, 0, 0));
        btn_newgoal_close1.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_newgoal_close1.setForeground(new java.awt.Color(255, 255, 255));
        btn_newgoal_close1.setText("Close");
        btn_newgoal_close1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_newgoal_close1.setBorderPainted(false);
        btn_newgoal_close1.setFocusable(false);
        btn_newgoal_close1.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_newgoal_close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newgoal_close1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("End  Date");

        date_newgoal_enddate1.setForeground(new java.awt.Color(102, 102, 102));
        date_newgoal_enddate1.setDateFormatString("yyyy/MM/dd");
        date_newgoal_enddate1.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        date_newgoal_enddate1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_newgoal_enddate1PropertyChange(evt);
            }
        });

        lbl_newgoalstartdate_error1.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newgoalstartdate_error1.setText("Income Name Error");

        lbl_newgoalenddate_error1.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newgoalenddate_error1.setText("Income Name Error");

        javax.swing.GroupLayout pnl_goal_newgoal1Layout = new javax.swing.GroupLayout(pnl_goal_newgoal1);
        pnl_goal_newgoal1.setLayout(pnl_goal_newgoal1Layout);
        pnl_goal_newgoal1Layout.setHorizontalGroup(
            pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(btn_newgoal_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn_newgoal_clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn_newgoal_close1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                                .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                                            .addGap(142, 142, 142)
                                            .addComponent(lbl_newgoalcategory_error1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                                                    .addGap(23, 23, 23)
                                                    .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cmb_newgoal_category1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl_newgoalamount_error1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(0, 0, Short.MAX_VALUE)))))
                                    .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(381, 381, 381)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_newgoalenddate_error1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scrollpane_newincome_note1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(txt_newgoal_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                                        .addGap(142, 142, 142)
                                        .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_newgoalname_error1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_newgoal_amount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(64, 64, 64)
                                .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(date_newgoal_enddate1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(date_newgoal_startdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_newgoalstartdate_error1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_goal_newgoal1Layout.setVerticalGroup(
            pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_newgoal_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_newgoal_startdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))))
                .addGap(6, 6, 6)
                .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                        .addComponent(lbl_newgoalname_error1)
                        .addGap(6, 6, 6)
                        .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_newgoal_amount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_goal_newgoal1Layout.createSequentialGroup()
                        .addComponent(lbl_newgoalstartdate_error1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_newgoal_enddate1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel13)))
                        .addGap(4, 4, 4)))
                .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbl_newgoalamount_error1))
                    .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbl_newgoalenddate_error1)))
                .addGap(5, 5, 5)
                .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_goal_newgoal1Layout.createSequentialGroup()
                        .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmb_newgoal_category1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_newgoalcategory_error1))
                    .addComponent(scrollpane_newincome_note1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_goal_newgoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_newgoal_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_newgoal_clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_newgoal_close1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(788, 600));
        setMinimumSize(new java.awt.Dimension(788, 600));

        jLabel4.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Goal Management");

        btn_goal_newgoal.setBackground(new java.awt.Color(255, 153, 0));
        btn_goal_newgoal.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_goal_newgoal.setForeground(new java.awt.Color(255, 255, 255));
        btn_goal_newgoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-add-15.png"))); // NOI18N
        btn_goal_newgoal.setText("New Goal");
        btn_goal_newgoal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_goal_newgoal.setBorderPainted(false);
        btn_goal_newgoal.setFocusable(false);
        btn_goal_newgoal.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_goal_newgoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goal_newgoalActionPerformed(evt);
            }
        });

        pnl_goal_newgoal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.lightGray));

        jLabel1.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Goal Name");

        jLabel2.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Goal Amount");

        jLabel3.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Goal Category");

        jLabel5.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Start  Date");

        jLabel6.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Additional Note");

        lbl_newgoalname_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newgoalname_error.setText("Income Name Error");

        lbl_newgoalamount_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newgoalamount_error.setText("Income Name Error");

        lbl_newgoalcategory_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newgoalcategory_error.setText("Income Name Error");

        date_newgoal_startdate.setForeground(new java.awt.Color(102, 102, 102));
        date_newgoal_startdate.setDateFormatString("yyyy/MM/dd");
        date_newgoal_startdate.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        date_newgoal_startdate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_newgoal_startdatePropertyChange(evt);
            }
        });

        cmb_newgoal_category.setForeground(new java.awt.Color(102, 102, 102));
        cmb_newgoal_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Expense Goal", "Income Goal" }));
        cmb_newgoal_category.setMaximumSize(new java.awt.Dimension(200, 30));
        cmb_newgoal_category.setMinimumSize(new java.awt.Dimension(200, 30));
        cmb_newgoal_category.setPreferredSize(new java.awt.Dimension(200, 30));
        cmb_newgoal_category.setRequestFocusEnabled(false);

        txt_newgoal_amount.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        txt_newgoal_amount.setForeground(new java.awt.Color(102, 102, 102));
        txt_newgoal_amount.setMaximumSize(new java.awt.Dimension(200, 30));
        txt_newgoal_amount.setMinimumSize(new java.awt.Dimension(200, 30));
        txt_newgoal_amount.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_newgoal_amount.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_newgoal_amountInputMethodTextChanged(evt);
            }
        });
        txt_newgoal_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_newgoal_amountKeyReleased(evt);
            }
        });

        txt_newgoal_name.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        txt_newgoal_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_newgoal_name.setMaximumSize(new java.awt.Dimension(200, 30));
        txt_newgoal_name.setMinimumSize(new java.awt.Dimension(200, 30));
        txt_newgoal_name.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_newgoal_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_newgoal_nameActionPerformed(evt);
            }
        });
        txt_newgoal_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_newgoal_nameKeyReleased(evt);
            }
        });

        txt_newgoal_note.setColumns(20);
        txt_newgoal_note.setForeground(new java.awt.Color(102, 102, 102));
        txt_newgoal_note.setRows(5);
        scrollpane_newincome_note.setViewportView(txt_newgoal_note);

        btn_newgoal_add.setBackground(new java.awt.Color(0, 0, 153));
        btn_newgoal_add.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_newgoal_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_newgoal_add.setText("Add");
        btn_newgoal_add.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_newgoal_add.setBorderPainted(false);
        btn_newgoal_add.setFocusable(false);
        btn_newgoal_add.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_newgoal_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newgoal_addActionPerformed(evt);
            }
        });

        btn_newgoal_clear.setBackground(new java.awt.Color(0, 0, 153));
        btn_newgoal_clear.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_newgoal_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_newgoal_clear.setText("Clear");
        btn_newgoal_clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_newgoal_clear.setBorderPainted(false);
        btn_newgoal_clear.setFocusable(false);
        btn_newgoal_clear.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_newgoal_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newgoal_clearActionPerformed(evt);
            }
        });

        btn_newgoal_close.setBackground(new java.awt.Color(153, 0, 0));
        btn_newgoal_close.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_newgoal_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_newgoal_close.setText("Close");
        btn_newgoal_close.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_newgoal_close.setBorderPainted(false);
        btn_newgoal_close.setFocusable(false);
        btn_newgoal_close.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_newgoal_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newgoal_closeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("End  Date");

        date_newgoal_enddate.setForeground(new java.awt.Color(102, 102, 102));
        date_newgoal_enddate.setDateFormatString("yyyy/MM/dd");
        date_newgoal_enddate.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        date_newgoal_enddate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_newgoal_enddatePropertyChange(evt);
            }
        });

        lbl_newgoalstartdate_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newgoalstartdate_error.setText("Income Name Error");

        lbl_newgoalenddate_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_newgoalenddate_error.setText("Income Name Error");

        javax.swing.GroupLayout pnl_goal_newgoalLayout = new javax.swing.GroupLayout(pnl_goal_newgoal);
        pnl_goal_newgoal.setLayout(pnl_goal_newgoalLayout);
        pnl_goal_newgoalLayout.setHorizontalGroup(
            pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addComponent(btn_newgoal_add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_newgoal_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_newgoal_close, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                        .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                                    .addGap(142, 142, 142)
                                    .addComponent(lbl_newgoalcategory_error, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cmb_newgoal_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl_newgoalamount_error, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(381, 381, 381)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_newgoalenddate_error, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollpane_newincome_note, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txt_newgoal_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_newgoalname_error, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_newgoal_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(64, 64, 64)
                        .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(date_newgoal_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date_newgoal_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_newgoalstartdate_error, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        pnl_goal_newgoalLayout.setVerticalGroup(
            pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_newgoal_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_newgoal_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))))
                .addGap(6, 6, 6)
                .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                        .addComponent(lbl_newgoalname_error)
                        .addGap(6, 6, 6)
                        .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_newgoal_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_goal_newgoalLayout.createSequentialGroup()
                        .addComponent(lbl_newgoalstartdate_error)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_newgoal_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel7)))
                        .addGap(4, 4, 4)))
                .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbl_newgoalamount_error))
                    .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbl_newgoalenddate_error)))
                .addGap(5, 5, 5)
                .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_goal_newgoalLayout.createSequentialGroup()
                        .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmb_newgoal_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_newgoalcategory_error))
                    .addComponent(scrollpane_newincome_note, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_goal_newgoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_newgoal_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_newgoal_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_newgoal_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnl_goal_updategoal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.lightGray));

        jLabel14.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Goal Name");

        jLabel15.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Goal Amount");

        jLabel16.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Goal Category");

        jLabel17.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Start  Date");

        jLabel18.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Additional Note");

        lbl_updategoalname_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_updategoalname_error.setText("Income Name Error");

        lbl_updategoalamount_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_updategoalamount_error.setText("Income Name Error");

        lbl_updategoalcategory_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_updategoalcategory_error.setText("Income Name Error");

        date_updategoal_startdate.setForeground(new java.awt.Color(102, 102, 102));
        date_updategoal_startdate.setDateFormatString("yyyy/MM/dd");
        date_updategoal_startdate.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        date_updategoal_startdate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_updategoal_startdatePropertyChange(evt);
            }
        });

        cmb_updategoal_category.setForeground(new java.awt.Color(102, 102, 102));
        cmb_updategoal_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Expense Goal", "Income Goal" }));
        cmb_updategoal_category.setMaximumSize(new java.awt.Dimension(200, 30));
        cmb_updategoal_category.setMinimumSize(new java.awt.Dimension(200, 30));
        cmb_updategoal_category.setPreferredSize(new java.awt.Dimension(200, 30));
        cmb_updategoal_category.setRequestFocusEnabled(false);

        txt_updategoal_amount.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        txt_updategoal_amount.setForeground(new java.awt.Color(102, 102, 102));
        txt_updategoal_amount.setMaximumSize(new java.awt.Dimension(200, 30));
        txt_updategoal_amount.setMinimumSize(new java.awt.Dimension(200, 30));
        txt_updategoal_amount.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_updategoal_amount.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_updategoal_amountInputMethodTextChanged(evt);
            }
        });
        txt_updategoal_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_updategoal_amountKeyReleased(evt);
            }
        });

        txt_updategoal_name.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        txt_updategoal_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_updategoal_name.setMaximumSize(new java.awt.Dimension(200, 30));
        txt_updategoal_name.setMinimumSize(new java.awt.Dimension(200, 30));
        txt_updategoal_name.setPreferredSize(new java.awt.Dimension(200, 30));
        txt_updategoal_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_updategoal_nameActionPerformed(evt);
            }
        });
        txt_updategoal_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_updategoal_nameKeyReleased(evt);
            }
        });

        txt_updategoal_note.setColumns(20);
        txt_updategoal_note.setForeground(new java.awt.Color(102, 102, 102));
        txt_updategoal_note.setRows(5);
        scrollpane_newincome_note2.setViewportView(txt_updategoal_note);

        btn_updategoal_add.setBackground(new java.awt.Color(255, 204, 0));
        btn_updategoal_add.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_updategoal_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_updategoal_add.setText("Update");
        btn_updategoal_add.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_updategoal_add.setBorderPainted(false);
        btn_updategoal_add.setFocusable(false);
        btn_updategoal_add.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_updategoal_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updategoal_addActionPerformed(evt);
            }
        });

        btn_updategoal_clear.setBackground(new java.awt.Color(0, 0, 153));
        btn_updategoal_clear.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_updategoal_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_updategoal_clear.setText("Clear");
        btn_updategoal_clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_updategoal_clear.setBorderPainted(false);
        btn_updategoal_clear.setFocusable(false);
        btn_updategoal_clear.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_updategoal_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updategoal_clearActionPerformed(evt);
            }
        });

        btn_updategoal_close.setBackground(new java.awt.Color(153, 0, 0));
        btn_updategoal_close.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_updategoal_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_updategoal_close.setText("Close");
        btn_updategoal_close.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_updategoal_close.setBorderPainted(false);
        btn_updategoal_close.setFocusable(false);
        btn_updategoal_close.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_updategoal_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updategoal_closeActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("End  Date");

        date_updategoal_enddate.setForeground(new java.awt.Color(102, 102, 102));
        date_updategoal_enddate.setDateFormatString("yyyy/MM/dd");
        date_updategoal_enddate.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        date_updategoal_enddate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_updategoal_enddatePropertyChange(evt);
            }
        });

        lbl_updategoalstartdate_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_updategoalstartdate_error.setText("Income Name Error");

        lbl_updategoalenddate_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_updategoalenddate_error.setText("Income Name Error");

        javax.swing.GroupLayout pnl_goal_updategoalLayout = new javax.swing.GroupLayout(pnl_goal_updategoal);
        pnl_goal_updategoal.setLayout(pnl_goal_updategoalLayout);
        pnl_goal_updategoalLayout.setHorizontalGroup(
            pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addComponent(btn_updategoal_add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_updategoal_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_updategoal_close, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                        .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                                    .addGap(142, 142, 142)
                                    .addComponent(lbl_updategoalcategory_error, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cmb_updategoal_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl_updategoalamount_error, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(381, 381, 381)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_updategoalenddate_error, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollpane_newincome_note2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txt_updategoal_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_updategoalname_error, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_updategoal_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(64, 64, 64)
                        .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(date_updategoal_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date_updategoal_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_updategoalstartdate_error, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        pnl_goal_updategoalLayout.setVerticalGroup(
            pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_updategoal_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_updategoal_startdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17))))
                .addGap(6, 6, 6)
                .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                        .addComponent(lbl_updategoalname_error)
                        .addGap(6, 6, 6)
                        .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_updategoal_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_goal_updategoalLayout.createSequentialGroup()
                        .addComponent(lbl_updategoalstartdate_error)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_updategoal_enddate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel19)))
                        .addGap(4, 4, 4)))
                .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbl_updategoalamount_error))
                    .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbl_updategoalenddate_error)))
                .addGap(5, 5, 5)
                .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_goal_updategoalLayout.createSequentialGroup()
                        .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmb_updategoal_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_updategoalcategory_error))
                    .addComponent(scrollpane_newincome_note2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_goal_updategoalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_updategoal_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_updategoal_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_updategoal_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        table_goaldetails.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 12)); // NOI18N
        table_goaldetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Goal Name", "Goal Start Date", "Goal End Date", "Goal Target", "Goal Category", "Goal Current Income", "Goal Status", "Actions"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_goaldetails.setAutoscrolls(false);
        table_goaldetails.setPreferredSize(new java.awt.Dimension(760, 200));
        table_goaldetails.setRowHeight(50);
        table_goaldetails.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_goaldetails.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                table_goaldetailsPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(table_goaldetails);

        jLabel20.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Income & Expense Goals");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel4)
                .addContainerGap(306, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_goal_newgoal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnl_goal_newgoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnl_goal_updategoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(611, 611, 611))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(btn_goal_newgoal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(pnl_goal_newgoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(pnl_goal_updategoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_goal_newgoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goal_newgoalActionPerformed
        OpenInputPanels(pnl_goal_newgoal);
    }//GEN-LAST:event_btn_goal_newgoalActionPerformed

    private void date_newgoal_startdatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_newgoal_startdatePropertyChange

    }//GEN-LAST:event_date_newgoal_startdatePropertyChange

    private void txt_newgoal_amountInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_newgoal_amountInputMethodTextChanged

    }//GEN-LAST:event_txt_newgoal_amountInputMethodTextChanged

    private void txt_newgoal_amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_newgoal_amountKeyReleased
        cgm.ValidateNewGoalAmount(txt_newgoal_amount.getText(), this);
    }//GEN-LAST:event_txt_newgoal_amountKeyReleased

    private void txt_newgoal_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_newgoal_nameActionPerformed

    }//GEN-LAST:event_txt_newgoal_nameActionPerformed

    private void txt_newgoal_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_newgoal_nameKeyReleased
        cgm.ValidateNewGoalName(txt_newgoal_name.getText(), this);
    }//GEN-LAST:event_txt_newgoal_nameKeyReleased

    private void btn_newgoal_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newgoal_addActionPerformed
        if(true == cgm.ValidateNewGoalAll(txt_newgoal_name.getText(), date_newgoal_startdate.getDate(), date_newgoal_enddate.getDate(), txt_newgoal_amount.getText(), this))
{
    String goalname = txt_newgoal_name.getText();
    String goalamount = txt_newgoal_amount.getText();
    String goalcategory = cmb_newgoal_category.getSelectedItem().toString();
    String goalnote = txt_newgoal_note.getText();

    cgm.AddNewGoal(goalname, goalamount, date_newgoal_startdate.getDate(), date_newgoal_enddate.getDate(), goalcategory, goalnote);
    ClearNewGoalInputs();
    LoadGoalTable();
}

    }//GEN-LAST:event_btn_newgoal_addActionPerformed

    private void btn_newgoal_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newgoal_clearActionPerformed
        ClearNewGoalInputs();
    }//GEN-LAST:event_btn_newgoal_clearActionPerformed

    private void btn_newgoal_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newgoal_closeActionPerformed
        pnl_goal_newgoal.setVisible(false);
    }//GEN-LAST:event_btn_newgoal_closeActionPerformed

    private void date_newgoal_enddatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_newgoal_enddatePropertyChange
        cgm.ValidateNewGoalDates(date_newgoal_startdate.getDate(),date_newgoal_enddate.getDate(), this);
    }//GEN-LAST:event_date_newgoal_enddatePropertyChange

    private void date_newgoal_startdate1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_newgoal_startdate1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_date_newgoal_startdate1PropertyChange

    private void txt_newgoal_amount1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_newgoal_amount1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_newgoal_amount1InputMethodTextChanged

    private void txt_newgoal_amount1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_newgoal_amount1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_newgoal_amount1KeyReleased

    private void txt_newgoal_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_newgoal_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_newgoal_name1ActionPerformed

    private void txt_newgoal_name1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_newgoal_name1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_newgoal_name1KeyReleased

    private void btn_newgoal_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newgoal_add1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_newgoal_add1ActionPerformed

    private void btn_newgoal_clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newgoal_clear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_newgoal_clear1ActionPerformed

    private void btn_newgoal_close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newgoal_close1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_newgoal_close1ActionPerformed

    private void date_newgoal_enddate1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_newgoal_enddate1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_date_newgoal_enddate1PropertyChange

    private void date_updategoal_startdatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_updategoal_startdatePropertyChange
        cgm.ValidateUpdateGoalDates(date_updategoal_startdate.getDate(),date_updategoal_enddate.getDate(), this);
    }//GEN-LAST:event_date_updategoal_startdatePropertyChange

    private void txt_updategoal_amountInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_updategoal_amountInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_updategoal_amountInputMethodTextChanged

    private void txt_updategoal_amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_updategoal_amountKeyReleased
        cgm.ValidateUpdateGoalAmount(txt_updategoal_amount.getText(), this);
    }//GEN-LAST:event_txt_updategoal_amountKeyReleased

    private void txt_updategoal_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_updategoal_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_updategoal_nameActionPerformed

    private void txt_updategoal_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_updategoal_nameKeyReleased
        cgm.ValidateUpdateGoalName(txt_updategoal_name.getText(), this);
    }//GEN-LAST:event_txt_updategoal_nameKeyReleased

    private void btn_updategoal_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updategoal_addActionPerformed
        if(true == cgm.ValidateUpdateGoalAll(txt_updategoal_name.getText(), date_updategoal_startdate.getDate(), date_updategoal_enddate.getDate(), txt_updategoal_amount.getText(), this))
{
    String goalname = txt_updategoal_name.getText();
    String goalamount = txt_updategoal_amount.getText();
    String goalcategory = cmb_updategoal_category.getSelectedItem().toString();
    String goalnote = txt_updategoal_note.getText();

    cgm.UpdateGoal(updateid,goalname, goalamount, date_updategoal_startdate.getDate(), date_updategoal_enddate.getDate(), goalcategory, goalnote);
    ClearUpdateGoalInputs();
    LoadGoalTable();
}

    }//GEN-LAST:event_btn_updategoal_addActionPerformed

    private void btn_updategoal_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updategoal_clearActionPerformed
        ClearUpdateGoalInputs();
    }//GEN-LAST:event_btn_updategoal_clearActionPerformed

    private void btn_updategoal_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updategoal_closeActionPerformed
        pnl_goal_updategoal.setVisible(false);
    }//GEN-LAST:event_btn_updategoal_closeActionPerformed

    private void date_updategoal_enddatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_updategoal_enddatePropertyChange
        cgm.ValidateUpdateGoalDates(date_updategoal_startdate.getDate(),date_newgoal_enddate.getDate(), this);
    }//GEN-LAST:event_date_updategoal_enddatePropertyChange

    private void table_goaldetailsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_table_goaldetailsPropertyChange

    }//GEN-LAST:event_table_goaldetailsPropertyChange
    
    public void ClearNewGoalInputs()
    {
        ClearNewGoalErrors();
        txt_newgoal_name.setText("");
        txt_newgoal_amount.setText("");
        txt_newgoal_note.setText("");
        Date date = new Date ();
        date_newgoal_enddate.setDate(date);
        date_newgoal_startdate.setDate(date);
    }
    
    public void ClearNewGoalErrors()
    {
        lbl_newgoalamount_error.setVisible(false);
        lbl_newgoalcategory_error.setVisible(false);
        lbl_newgoalname_error.setVisible(false);
        lbl_newgoalstartdate_error.setVisible(false);
        lbl_newgoalenddate_error.setVisible(false);
    }
    
    public void ClearUpdateGoalInputs()
{
    ClearUpdateGoalErrors();
    txt_updategoal_name.setText("");
    txt_updategoal_amount.setText("");
    txt_updategoal_note.setText("");
    Date date = new Date ();
    date_updategoal_enddate.setDate(date);
    date_updategoal_startdate.setDate(date);
}

public void ClearUpdateGoalErrors()
{
    lbl_updategoalamount_error.setVisible(false);
    lbl_updategoalcategory_error.setVisible(false);
    lbl_updategoalname_error.setVisible(false);
    lbl_updategoalstartdate_error.setVisible(false);
    lbl_updategoalenddate_error.setVisible(false);
}

    
     public void OpenInputPanels(JPanel pnl)
    {
        ClearNewGoalInputs();
        ClearUpdateGoalInputs();
        pnl_goal_newgoal.setVisible(false);
        pnl_goal_updategoal.setVisible(false);
        
        pnl.setVisible(true);
    }

     public void LoadGoalTable()
    {
        cgm.LoadGoalTable(this);   
    }
     


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_goal_newgoal;
    private javax.swing.JButton btn_newgoal_add;
    private javax.swing.JButton btn_newgoal_add1;
    private javax.swing.JButton btn_newgoal_clear;
    private javax.swing.JButton btn_newgoal_clear1;
    private javax.swing.JButton btn_newgoal_close;
    private javax.swing.JButton btn_newgoal_close1;
    private javax.swing.JButton btn_updategoal_add;
    private javax.swing.JButton btn_updategoal_clear;
    private javax.swing.JButton btn_updategoal_close;
    private javax.swing.JComboBox<String> cmb_newgoal_category;
    private javax.swing.JComboBox<String> cmb_newgoal_category1;
    public javax.swing.JComboBox<String> cmb_updategoal_category;
    private com.toedter.calendar.JDateChooser date_newgoal_enddate;
    private com.toedter.calendar.JDateChooser date_newgoal_enddate1;
    private com.toedter.calendar.JDateChooser date_newgoal_startdate;
    private com.toedter.calendar.JDateChooser date_newgoal_startdate1;
    public com.toedter.calendar.JDateChooser date_updategoal_enddate;
    public com.toedter.calendar.JDateChooser date_updategoal_startdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbl_newgoalamount_error;
    public javax.swing.JLabel lbl_newgoalamount_error1;
    public javax.swing.JLabel lbl_newgoalcategory_error;
    public javax.swing.JLabel lbl_newgoalcategory_error1;
    public javax.swing.JLabel lbl_newgoalenddate_error;
    public javax.swing.JLabel lbl_newgoalenddate_error1;
    public javax.swing.JLabel lbl_newgoalname_error;
    public javax.swing.JLabel lbl_newgoalname_error1;
    public javax.swing.JLabel lbl_newgoalstartdate_error;
    public javax.swing.JLabel lbl_newgoalstartdate_error1;
    public javax.swing.JLabel lbl_updategoalamount_error;
    public javax.swing.JLabel lbl_updategoalcategory_error;
    public javax.swing.JLabel lbl_updategoalenddate_error;
    public javax.swing.JLabel lbl_updategoalname_error;
    public javax.swing.JLabel lbl_updategoalstartdate_error;
    public javax.swing.JPanel pnl_goal_newgoal;
    private javax.swing.JPanel pnl_goal_newgoal1;
    public javax.swing.JPanel pnl_goal_updategoal;
    private javax.swing.JScrollPane scrollpane_newincome_note;
    private javax.swing.JScrollPane scrollpane_newincome_note1;
    private javax.swing.JScrollPane scrollpane_newincome_note2;
    public javax.swing.JTable table_goaldetails;
    private javax.swing.JTextField txt_newgoal_amount;
    private javax.swing.JTextField txt_newgoal_amount1;
    private javax.swing.JTextField txt_newgoal_name;
    private javax.swing.JTextField txt_newgoal_name1;
    private javax.swing.JTextArea txt_newgoal_note;
    private javax.swing.JTextArea txt_newgoal_note1;
    public javax.swing.JTextField txt_updategoal_amount;
    public javax.swing.JTextField txt_updategoal_name;
    public javax.swing.JTextArea txt_updategoal_note;
    // End of variables declaration//GEN-END:variables
}
