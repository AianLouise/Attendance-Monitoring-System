package com.source.main;


import com.mycompany.ams.AMS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class Mail {

    Session newSession = null;
    MimeMessage mimeMessage = null;
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
   public static void main(String[] args) {
       
   }
   static String email;
   static String password;
   void sendEmail() throws MessagingException {
        conn = AMS.connectmysqldb();
        
        try{
                String sql = "SELECT * FROM tb_smtp WHERE id = '1';";
               
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery(sql);
                
                if(rs.next()){
                    email = rs.getString("email");
                    password = rs.getString("password");
                }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        String from = email;
        String fromPassword = password;
        String emailHost = "smtp.gmail.com";

        Transport transport = newSession.getTransport("smtp");
        transport.connect(emailHost, from, fromPassword);
        transport.sendMessage(mimeMessage,  mimeMessage.getAllRecipients());

        transport.close();
        System.out.println("email successfully send");

   }

   MimeMessage draftEmail(String code, String email) throws AddressException, MessagingException{
        
        String to = email;
        String subject = "AMS";
        
        String i = String.valueOf(code);
        
        String body = "Your Pincode is: " + i;

        mimeMessage = new MimeMessage(newSession);

       
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mimeMessage.setSubject(subject);

            MimeMultipart multipart = new MimeMultipart();

            MimeBodyPart bodyPart = new MimeBodyPart();
            bodyPart.setContent(body, "text/html"); // html/text
            multipart.addBodyPart(bodyPart);
            mimeMessage.setContent(multipart);
            return mimeMessage;

        
   }

   void setupSeverProperties() {

        Properties properties = System.getProperties();
        properties.put("mail.smtp.port", "465");
     //    properties.put("mail.smtp.socektFactory.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.stmp.starttls.required", "true");
        properties.put("mail.debug", "true");
        properties.put("mail.smtp.ssl.enable", "true");

        newSession = Session.getDefaultInstance(properties, null);
   }



}