package com.source.main;

import com.mycompany.ams.AMS;
import static com.source.main.Login.id;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class UserMenu extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public UserMenu() {
        initComponents();
        conn = AMS.connectmysqldb();
        Login login = new Login();
        System.out.println(login.id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_profile = new javax.swing.JLabel();
        btn_logs = new javax.swing.JButton();
        btn_scanqr = new javax.swing.JButton();
        btn_view = new javax.swing.JButton();
        btn_listinfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(191, 215, 237));

        jPanel1.setBackground(new java.awt.Color(0, 116, 183));

        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dashboard");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Logged as:     User");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");

        lbl_user.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setText("user here!");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\aianl\\Documents\\NetBeansProjects\\AMS\\icon\\logo 0.4.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\aianl\\Documents\\NetBeansProjects\\AMS\\icon\\admin 0.3.png")); // NOI18N

        btn_profile.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btn_profile.setForeground(new java.awt.Color(255, 255, 255));
        btn_profile.setText("PROFILE");
        btn_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_profileMouseClicked(evt);
            }
        });

        btn_logs.setText("Activity Logs");
        btn_logs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_user))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btn_profile))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_logs, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_profile)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_user))
                .addGap(135, 135, 135)
                .addComponent(btn_logs, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_scanqr.setBackground(new java.awt.Color(96, 163, 217));
        btn_scanqr.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btn_scanqr.setForeground(new java.awt.Color(255, 255, 255));
        btn_scanqr.setText("Scan QR for Attendance");
        btn_scanqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_scanqrActionPerformed(evt);
            }
        });

        btn_view.setBackground(new java.awt.Color(96, 163, 217));
        btn_view.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btn_view.setForeground(new java.awt.Color(255, 255, 255));
        btn_view.setText("List of Student Information");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });

        btn_listinfo.setBackground(new java.awt.Color(96, 163, 217));
        btn_listinfo.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btn_listinfo.setForeground(new java.awt.Color(255, 255, 255));
        btn_listinfo.setText("View Attendance Record");
        btn_listinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listinfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(btn_scanqr, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_view)
                .addGap(18, 18, 18)
                .addComponent(btn_listinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 147, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_view, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_scanqr, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_listinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(208, 208, 208))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        Login login = new Login();
        try{
                String sql = "SELECT * FROM tb_account WHERE User_Id='"+login.id+"';";
                
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery(sql);
                
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Logged Out Successfully");
                    String userType = rs.getString("type");
                    String username = rs.getString("username");
                    id = rs.getInt("User_Id");
                    
                    //date
                    Date currentDate = GregorianCalendar.getInstance().getTime();
                    DateFormat df = DateFormat.getDateInstance();
                    String dateString = df.format(currentDate);
                        
                    //time
                    Date d = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                    String timeString = sdf.format(d);
                        
                    String value0 = timeString;
                    String values = dateString;
                        
                    int value = id;

                        String reg = "INSERT INTO tb_logs(user_id,username,date,status) VALUES ('"+value+"','"+username+"','"+value0+" / "+values+"','Logged Out')";
                                
                        ps = conn.prepareStatement(reg);
                        ps.execute();
                        
                        this.dispose();
        
                        login.setVisible(true);
                    
                }else{

                }
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_profileMouseClicked
        Login login = new Login();
        try{
            String sql = "SELECT * FROM tb_account WHERE User_Id = '"+login.id+"'";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);

            if(rs.next()){
                String name = rs.getString("name");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");

                Profile profile = new Profile();
                profile.txt_name.setText(name);
                profile.txt_username.setText(username);
                profile.txt_email.setText(email);
                profile.txt_password.setText(password);
                profile.setVisible(true);

            }else{
                JOptionPane.showMessageDialog(null,"Error");
            }

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_btn_profileMouseClicked

    private void btn_scanqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_scanqrActionPerformed
        ScanQr scan = new ScanQr();
        scan.setVisible(true);
    }//GEN-LAST:event_btn_scanqrActionPerformed

    private void btn_listinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listinfoActionPerformed
        AttendanceReport report = new AttendanceReport();
        report.setVisible(true);
    }//GEN-LAST:event_btn_listinfoActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        StudentRecord record = new StudentRecord();
        record.setVisible(true);
    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_logsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logsActionPerformed
        ActivityLogs logs = new ActivityLogs();
        logs.setVisible(true);
    }//GEN-LAST:event_btn_logsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_listinfo;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_logs;
    private javax.swing.JLabel btn_profile;
    private javax.swing.JButton btn_scanqr;
    private javax.swing.JButton btn_view;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lbl_user;
    // End of variables declaration//GEN-END:variables
}
