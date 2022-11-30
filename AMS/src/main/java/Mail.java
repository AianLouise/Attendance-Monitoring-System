
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

public class Mail {

    Session newSession = null;
    MimeMessage mimeMessage = null;
   public static void main(String[] args) {
        Mail mail = new Mail();
        mail.setupSeverProperties();
        try {

            mail.draftEmail();
            mail.sendEmail();
    
        } catch (Exception ex){
            ex.printStackTrace();
        }
   }

   void sendEmail() throws MessagingException {

        String from = "attendancems123@gmail.com";
        String fromPassword = "mmbsodskafhatiqq";
        String emailHost = "smtp.gmail.com";

        Transport transport = newSession.getTransport("smtp");
        transport.connect(emailHost, from, fromPassword);
        transport.sendMessage(mimeMessage,  mimeMessage.getAllRecipients());

        transport.close();
        System.out.println("email successfully send");

   }

   MimeMessage draftEmail() throws AddressException, MessagingException{
        String to = "2021301205@dhvsu.edu.ph";
        String subject = "Test Mail";

        String body = "Test Body Your Pincode is: ";

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