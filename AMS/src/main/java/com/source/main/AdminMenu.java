package com.source.main;

import com.mycompany.ams.AMS;
import static com.source.main.Login.id;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class AdminMenu extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public AdminMenu() {
        initComponents();
        conn = AMS.connectmysqldb();
        dt();
        times();
    }
    
    public void dt(){
        Date d = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     
        String dd = sdf.format(d);
        lbl_date.setText(dd);
        
    }
    
    Timer t ;
    SimpleDateFormat st = null ;
    public void times() {
    
        t = new Timer(0, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                st = new SimpleDateFormat("hh:mm:ss a");
                
                String tt = st.format(dt);
                
                lbl_time.setText(tt);
            }
            
        });
        
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_manage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        btn_settings = new javax.swing.JButton();
        btn_logout1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_profile = new javax.swing.JLabel();
        btn_logout2 = new javax.swing.JButton();
        btn_createqr = new javax.swing.JButton();
        btn_scanqr = new javax.swing.JButton();
        btn_listinfo = new javax.swing.JButton();
        btn_view = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbl_date = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbl_time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(191, 215, 237));
        jPanel2.setPreferredSize(new java.awt.Dimension(1159, 696));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 116, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_manage.setText("Manage Users");
        btn_manage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageActionPerformed(evt);
            }
        });
        jPanel1.add(btn_manage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 132, 39));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dashboard");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logged as:   Admin");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        lbl_user.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setText("user here!");
        jPanel1.add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        btn_settings.setText("Settings");
        btn_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_settingsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, 132, 39));

        btn_logout1.setText("Activity Logs");
        btn_logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logout1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, 132, 39));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\aianl\\Documents\\NetBeansProjects\\AMS\\icon\\admin 0.3.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        btn_profile.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btn_profile.setForeground(new java.awt.Color(255, 255, 255));
        btn_profile.setText("PROFILE");
        btn_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_profileMouseClicked(evt);
            }
        });
        jPanel1.add(btn_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        btn_logout2.setText("Logout");
        btn_logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logout2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logout2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 700, 132, 39));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 244, 824));

        btn_createqr.setBackground(new java.awt.Color(96, 163, 217));
        btn_createqr.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btn_createqr.setForeground(new java.awt.Color(255, 255, 255));
        btn_createqr.setIcon(new javax.swing.ImageIcon("C:\\Users\\aianl\\Documents\\NetBeansProjects\\AMS\\icon\\qr-code0.25.png")); // NOI18N
        btn_createqr.setText("Create QR Code for Student");
        btn_createqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createqrActionPerformed(evt);
            }
        });
        jPanel2.add(btn_createqr, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 405, -1, 137));

        btn_scanqr.setBackground(new java.awt.Color(96, 163, 217));
        btn_scanqr.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btn_scanqr.setForeground(new java.awt.Color(255, 255, 255));
        btn_scanqr.setIcon(new javax.swing.ImageIcon("C:\\Users\\aianl\\Documents\\NetBeansProjects\\AMS\\icon\\scan0.25.png")); // NOI18N
        btn_scanqr.setText("Scan QR for Attendance");
        btn_scanqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_scanqrActionPerformed(evt);
            }
        });
        jPanel2.add(btn_scanqr, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 405, 283, 137));

        btn_listinfo.setBackground(new java.awt.Color(96, 163, 217));
        btn_listinfo.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btn_listinfo.setForeground(new java.awt.Color(255, 255, 255));
        btn_listinfo.setIcon(new javax.swing.ImageIcon("C:\\Users\\aianl\\Documents\\NetBeansProjects\\AMS\\icon\\view 0.25.png")); // NOI18N
        btn_listinfo.setText("View Student Attendance");
        btn_listinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listinfoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_listinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 568, 283, 137));

        btn_view.setBackground(new java.awt.Color(96, 163, 217));
        btn_view.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        btn_view.setForeground(new java.awt.Color(255, 255, 255));
        btn_view.setIcon(new javax.swing.ImageIcon("C:\\Users\\aianl\\Documents\\NetBeansProjects\\AMS\\icon\\list0.25.png")); // NOI18N
        btn_view.setText("List of Student Information");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        jPanel2.add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 568, 283, 137));

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Attendance Monitoring System");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\aianl\\Documents\\NetBeansProjects\\AMS\\icon\\logo 0.25.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 920, -1));

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        lbl_date.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        lbl_date.setText("Date");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lbl_date)
                .addGap(27, 27, 27))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));

        lbl_time.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_time.setText("time");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lbl_time)
                .addGap(27, 27, 27))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        StudentRecord record = new StudentRecord();
        record.setVisible(true);
    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_listinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listinfoActionPerformed
        AttendanceReport report = new AttendanceReport();
        report.setVisible(true);
    }//GEN-LAST:event_btn_listinfoActionPerformed

    private void btn_scanqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_scanqrActionPerformed
        ScanQr scan = new ScanQr();
        scan.setVisible(true);
    }//GEN-LAST:event_btn_scanqrActionPerformed

    private void btn_createqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createqrActionPerformed
        CreateQrCode create = new CreateQrCode();
        create.setVisible(true);
    }//GEN-LAST:event_btn_createqrActionPerformed

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

    private void btn_logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logout1ActionPerformed
        ActivityLogs logs = new ActivityLogs();
        logs.setVisible(true);
    }//GEN-LAST:event_btn_logout1ActionPerformed

    private void btn_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_settingsActionPerformed

        try{
            String sql = "SELECT * FROM tb_smtp WHERE id = '1';";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery(sql);

            if(rs.next()){
                String email = rs.getString("email");
                String password = rs.getString("password");

                SettingsSMTP settings = new SettingsSMTP();
                settings.txt_email.setText(email);
                settings.txt_password.setText(password);
                settings.setVisible(true);

            }else{
                JOptionPane.showMessageDialog(null,"Error");
            }

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_btn_settingsActionPerformed

    private void btn_manageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageActionPerformed
        ManageUsers manage = new ManageUsers();
        manage.setVisible(true);
    }//GEN-LAST:event_btn_manageActionPerformed

    private void btn_logout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logout2ActionPerformed
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
    }//GEN-LAST:event_btn_logout2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_createqr;
    private javax.swing.JButton btn_listinfo;
    private javax.swing.JButton btn_logout1;
    private javax.swing.JButton btn_logout2;
    private javax.swing.JButton btn_manage;
    private javax.swing.JLabel btn_profile;
    private javax.swing.JButton btn_scanqr;
    private javax.swing.JButton btn_settings;
    private javax.swing.JButton btn_view;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_time;
    public javax.swing.JLabel lbl_user;
    // End of variables declaration//GEN-END:variables
}
