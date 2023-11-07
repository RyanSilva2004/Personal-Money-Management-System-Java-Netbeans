package view;

import control.CSignUp;
import java.awt.Image;
import java.io.File;
import java.util.Date;
import javax.swing.*;


public class VSignUp extends javax.swing.JFrame {

    public VSignUp() 
    {
        initComponents();
        clearErrorLabels();
    }
    
String FileName = null;
public ImageIcon ProfilePicture = null;
CSignUp csu = new CSignUp();
        
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_signup = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_fname_error = new javax.swing.JLabel();
        lbl_lname_error = new javax.swing.JLabel();
        lbl_email_error = new javax.swing.JLabel();
        lbl_dob_error = new javax.swing.JLabel();
        lbl_confirmpassword_error = new javax.swing.JLabel();
        lbl_password_error = new javax.swing.JLabel();
        pnl_design1 = new keeptoo.KGradientPanel();
        pnl_pfp = new javax.swing.JPanel();
        lbl_pfp = new javax.swing.JLabel();
        date_dob = new com.toedter.calendar.JDateChooser();
        txt_fname = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_comfirmpassword = new javax.swing.JPasswordField();
        txt_password = new javax.swing.JPasswordField();
        btn_close = new javax.swing.JButton();
        btn_signup = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        btn_uploadpfp = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 440));
        setMinimumSize(new java.awt.Dimension(650, 440));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(650, 440));

        pnl_signup.setBackground(new java.awt.Color(255, 255, 255));
        pnl_signup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("First Name");
        pnl_signup.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 93, 72, -1));

        jLabel2.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Profile Picture (Optional)");
        pnl_signup.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 88, -1, -1));

        jLabel3.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Last Name");
        pnl_signup.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 151, 72, -1));

        jLabel4.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sign Up");
        pnl_signup.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 23, -1, -1));

        jLabel5.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email");
        pnl_signup.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 209, 72, -1));

        jLabel6.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Date of Birth");
        pnl_signup.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 262, 86, -1));

        jLabel7.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Password");
        pnl_signup.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 327, 72, -1));

        jLabel10.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Comfirm Password");
        pnl_signup.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 298, -1, -1));

        lbl_fname_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_fname_error.setText("First Name Validation");
        pnl_signup.add(lbl_fname_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 124, -1, -1));

        lbl_lname_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_lname_error.setText("Last Name Validation");
        pnl_signup.add(lbl_lname_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 182, -1, -1));

        lbl_email_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_email_error.setText("Email Validation");
        pnl_signup.add(lbl_email_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 240, -1, -1));

        lbl_dob_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_dob_error.setText("Date Of Birth Validation");
        pnl_signup.add(lbl_dob_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 300, -1, -1));

        lbl_confirmpassword_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_confirmpassword_error.setText("Date Of Birth Validation");
        pnl_signup.add(lbl_confirmpassword_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 358, -1, -1));

        lbl_password_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_password_error.setText("Email Validation");
        pnl_signup.add(lbl_password_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 358, -1, -1));

        pnl_design1.setkEndColor(new java.awt.Color(0, 0, 102));
        pnl_design1.setkStartColor(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout pnl_design1Layout = new javax.swing.GroupLayout(pnl_design1);
        pnl_design1.setLayout(pnl_design1Layout);
        pnl_design1Layout.setHorizontalGroup(
            pnl_design1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnl_design1Layout.setVerticalGroup(
            pnl_design1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnl_signup.add(pnl_design1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 511));

        pnl_pfp.setMaximumSize(new java.awt.Dimension(140, 140));
        pnl_pfp.setMinimumSize(new java.awt.Dimension(140, 140));

        lbl_pfp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_pfp.setText("No Image");

        javax.swing.GroupLayout pnl_pfpLayout = new javax.swing.GroupLayout(pnl_pfp);
        pnl_pfp.setLayout(pnl_pfpLayout);
        pnl_pfpLayout.setHorizontalGroup(
            pnl_pfpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_pfp, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        pnl_pfpLayout.setVerticalGroup(
            pnl_pfpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_pfp, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        lbl_pfp.getAccessibleContext().setAccessibleDescription("");

        pnl_signup.add(pnl_pfp, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 118, -1, -1));

        date_dob.setDateFormatString("yyyy/MM/dd");
        pnl_signup.add(date_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 262, 180, 30));

        txt_fname.setFont(new java.awt.Font("Diodrum Cyrillic Medium", 0, 12)); // NOI18N
        txt_fname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_fname.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_fname.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_fname.setPreferredSize(new java.awt.Dimension(150, 30));
        txt_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_fnameKeyPressed(evt);
            }
        });
        pnl_signup.add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 88, 180, -1));

        txt_lname.setFont(new java.awt.Font("Diodrum Cyrillic Medium", 0, 12)); // NOI18N
        txt_lname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_lname.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_lname.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_lname.setPreferredSize(new java.awt.Dimension(150, 30));
        txt_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_lnameKeyPressed(evt);
            }
        });
        pnl_signup.add(txt_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 146, 180, -1));

        txt_email.setFont(new java.awt.Font("Diodrum Cyrillic Medium", 0, 12)); // NOI18N
        txt_email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_email.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_email.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_email.setPreferredSize(new java.awt.Dimension(150, 30));
        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_emailKeyPressed(evt);
            }
        });
        pnl_signup.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 204, 180, -1));

        txt_comfirmpassword.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_comfirmpassword.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_comfirmpassword.setPreferredSize(new java.awt.Dimension(150, 30));
        pnl_signup.add(txt_comfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 322, 180, -1));

        txt_password.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_password.setPreferredSize(new java.awt.Dimension(150, 30));
        pnl_signup.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 322, 180, -1));

        btn_close.setBackground(new java.awt.Color(204, 0, 0));
        btn_close.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("X");
        btn_close.setActionCommand("");
        btn_close.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_close.setBorderPainted(false);
        btn_close.setDefaultCapable(false);
        btn_close.setFocusPainted(false);
        btn_close.setFocusable(false);
        btn_close.setPreferredSize(new java.awt.Dimension(24, 24));
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        pnl_signup.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, -1));

        btn_signup.setBackground(new java.awt.Color(0, 0, 153));
        btn_signup.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_signup.setForeground(new java.awt.Color(255, 255, 255));
        btn_signup.setText("Sign Up");
        btn_signup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_signup.setBorderPainted(false);
        btn_signup.setFocusable(false);
        btn_signup.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        pnl_signup.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 90, 30));

        btn_remove.setBackground(new java.awt.Color(0, 0, 153));
        btn_remove.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_remove.setForeground(new java.awt.Color(255, 255, 255));
        btn_remove.setText("Remove");
        btn_remove.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_remove.setBorderPainted(false);
        btn_remove.setFocusable(false);
        btn_remove.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        pnl_signup.add(btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 154, 90, 30));

        btn_uploadpfp.setBackground(new java.awt.Color(0, 0, 153));
        btn_uploadpfp.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_uploadpfp.setForeground(new java.awt.Color(255, 255, 255));
        btn_uploadpfp.setText("Upload");
        btn_uploadpfp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_uploadpfp.setBorderPainted(false);
        btn_uploadpfp.setFocusable(false);
        btn_uploadpfp.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_uploadpfp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uploadpfpActionPerformed(evt);
            }
        });
        pnl_signup.add(btn_uploadpfp, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 118, 90, 30));

        btn_clear.setBackground(new java.awt.Color(0, 0, 153));
        btn_clear.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Clear");
        btn_clear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_clear.setBorderPainted(false);
        btn_clear.setFocusable(false);
        btn_clear.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        pnl_signup.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 90, 30));

        btn_back.setBackground(new java.awt.Color(0, 0, 153));
        btn_back.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_back.setBorderPainted(false);
        btn_back.setFocusable(false);
        btn_back.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        pnl_signup.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_signup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fnameKeyPressed

    }//GEN-LAST:event_txt_fnameKeyPressed

    private void txt_lnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lnameKeyPressed

    }//GEN-LAST:event_txt_lnameKeyPressed

    private void txt_emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyPressed

    }//GEN-LAST:event_txt_emailKeyPressed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        if(true == csu.validateAll(this))
        {
            csu.Account_SignUp(this);
        }
        else 
            {
                JOptionPane.showMessageDialog(null, "Input Error", "Sign Up Error", JOptionPane.WARNING_MESSAGE);
            }
        
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        lbl_pfp.setIcon(null);
        lbl_pfp.setText("No Image");
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_uploadpfpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uploadpfpActionPerformed
        
        ProfilePicture = csu.uploadFile();
        if( ProfilePicture!= null)            
        {
            lbl_pfp.setText("");
            lbl_pfp.setIcon(ProfilePicture);
        }
        
    }//GEN-LAST:event_btn_uploadpfpActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_fname.setText("");
        txt_lname.setText("");
        txt_password.setText("");
        txt_comfirmpassword.setText("");
        txt_email.setText("");
        clearErrorLabels();
        lbl_pfp.setIcon(null);
        lbl_pfp.setText("No Image");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        VSignIn vsi = new VSignIn();
        vsi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed

     
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_signup;
    private javax.swing.JButton btn_uploadpfp;
    public com.toedter.calendar.JDateChooser date_dob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel lbl_confirmpassword_error;
    public javax.swing.JLabel lbl_dob_error;
    public javax.swing.JLabel lbl_email_error;
    public javax.swing.JLabel lbl_fname_error;
    public javax.swing.JLabel lbl_lname_error;
    public javax.swing.JLabel lbl_password_error;
    public javax.swing.JLabel lbl_pfp;
    private keeptoo.KGradientPanel pnl_design1;
    private javax.swing.JPanel pnl_pfp;
    public javax.swing.JPanel pnl_signup;
    public javax.swing.JPasswordField txt_comfirmpassword;
    public javax.swing.JTextField txt_email;
    public javax.swing.JTextField txt_fname;
    public javax.swing.JTextField txt_lname;
    public javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables

    public void clearErrorLabels()
    {
        lbl_fname_error.setVisible(false);
        lbl_lname_error.setVisible(false);
        lbl_dob_error.setVisible(false);
        lbl_email_error.setVisible(false);
        lbl_password_error.setVisible(false);
        lbl_confirmpassword_error.setVisible(false);
    }
    

}

