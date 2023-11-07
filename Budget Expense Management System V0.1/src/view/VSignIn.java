package view;
import control.CSignIn;

public class VSignIn extends javax.swing.JFrame {

    public VSignIn() 
    {
        initComponents();
        lbl_email_error.setVisible(false);
        lbl_password_error.setVisible(false);        
    }
    
            CSignIn csi = new CSignIn();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnl_signin = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_email_error = new javax.swing.JLabel();
        lbl_password_error = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_email1 = new javax.swing.JTextField();
        btn_signin = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        btn_signup = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Sign In");

        jLabel2.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 18)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 18)); // NOI18N
        jLabel3.setText("Email ");

        txt_email.setText("example123@email.com");

        jPasswordField1.setText("jPasswordField1");

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign In");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setMaximizedBounds(new java.awt.Rectangle(650, 350, 350, 350));
        setMaximumSize(new java.awt.Dimension(650, 350));
        setMinimumSize(new java.awt.Dimension(650, 350));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 0, 51));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 204));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-wallet-100.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Diodrum Cyrillic Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Smart Pocket");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        getContentPane().add(kGradientPanel2);
        kGradientPanel2.setBounds(0, 0, 300, 350);

        pnl_signin.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sign In");

        jLabel5.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email ");

        lbl_email_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_email_error.setText("Email Validation");

        lbl_password_error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_password_error.setText("Password Validation");

        txt_password.setFont(new java.awt.Font("Diodrum Cyrillic Medium", 0, 12)); // NOI18N
        txt_password.setText("Dsilvaryancr7");
        txt_password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_password.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_password.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_password.setPreferredSize(new java.awt.Dimension(150, 30));
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passwordKeyReleased(evt);
            }
        });

        txt_email1.setFont(new java.awt.Font("Diodrum Cyrillic Medium", 0, 12)); // NOI18N
        txt_email1.setText("ryansilva2004cr7@gmail.com");
        txt_email1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_email1.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_email1.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_email1.setPreferredSize(new java.awt.Dimension(150, 30));
        txt_email1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_email1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_email1KeyReleased(evt);
            }
        });

        btn_signin.setBackground(new java.awt.Color(0, 0, 153));
        btn_signin.setFont(new java.awt.Font("Diodrum Cyrillic Semibold", 0, 14)); // NOI18N
        btn_signin.setForeground(new java.awt.Color(255, 255, 255));
        btn_signin.setText("Sign In");
        btn_signin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_signin.setBorderPainted(false);
        btn_signin.setFocusable(false);
        btn_signin.setPreferredSize(new java.awt.Dimension(50, 20));
        btn_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signinActionPerformed(evt);
            }
        });

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

        btn_signup.setBackground(new java.awt.Color(255, 255, 255));
        btn_signup.setForeground(new java.awt.Color(0, 0, 204));
        btn_signup.setText("Don't have an account? Sign up here.");
        btn_signup.setBorder(null);
        btn_signup.setBorderPainted(false);
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_signinLayout = new javax.swing.GroupLayout(pnl_signin);
        pnl_signin.setLayout(pnl_signinLayout);
        pnl_signinLayout.setHorizontalGroup(
            pnl_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_signinLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pnl_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_signinLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_signinLayout.createSequentialGroup()
                        .addGroup(pnl_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_signup)
                            .addGroup(pnl_signinLayout.createSequentialGroup()
                                .addGroup(pnl_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(12, 12, 12)
                                .addGroup(pnl_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_email1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(lbl_email_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_password_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnl_signinLayout.createSequentialGroup()
                                        .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(20, 20, 20))
                    .addComponent(btn_close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnl_signinLayout.setVerticalGroup(
            pnl_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_signinLayout.createSequentialGroup()
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(43, 43, 43)
                .addGroup(pnl_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_email_error, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_password_error, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_signinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(pnl_signin);
        pnl_signin.setBounds(297, 0, 350, 350);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private static String acc_email;
    private void btn_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signinActionPerformed
       
        if(csi.checkValidations(this) == true) 
       {
           CSignIn csi = new CSignIn();
           if(true == csi.Account_SignIn(txt_email1.getText(), txt_password.getText()))
           {
               acc_email = txt_email1.getText();
               VHome home = new VHome();
               home.setVisible(true);
               this.setVisible(false);
           }
       }
       else
       {
           csi.checkValidations(this);
       }
    }//GEN-LAST:event_btn_signinActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_email1.setText("");
        txt_password.setText("");
        lbl_email_error.setVisible(false);
        lbl_password_error.setVisible(false);
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void txt_email1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_email1KeyPressed
        csi.checkValidations(this);
    }//GEN-LAST:event_txt_email1KeyPressed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        csi.checkValidations(this);
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        VSignUp vsu = new VSignUp();
        vsu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_signupActionPerformed

    private void txt_email1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_email1KeyReleased
        csi.checkValidations(this);
    }//GEN-LAST:event_txt_email1KeyReleased

    private void txt_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyReleased
        csi.checkValidations(this);
    }//GEN-LAST:event_txt_passwordKeyReleased


    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new VSignIn().setVisible(true);
            }
        }
        );
    }
   
    public static String getEmail()
    {
        return acc_email;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_signin;
    private javax.swing.JButton btn_signup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private keeptoo.KGradientPanel kGradientPanel2;
    public javax.swing.JLabel lbl_email_error;
    public javax.swing.JLabel lbl_password_error;
    private javax.swing.JPanel pnl_signin;
    private javax.swing.JTextField txt_email;
    public javax.swing.JTextField txt_email1;
    public javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables
}
