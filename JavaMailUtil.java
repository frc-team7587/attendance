import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.Message;

// import javax.mail.Message.RecipientType;
// import javax.mail.MessagingException;
// import javax.mail.search.RecipientTerm;
// import javax.mail.internet.AddressException;


public class JavaMailUtil {
    public static void sendMail(String recipient) throws Exception {
        Properties properties = new Properties();

        properties.put("mail.smtp.auth", true);                         //finds if an authentication is needed (e.g. rewuired to enter a User & pass)
        properties.put("mail.smtp.starttls.enable", "true");            
        properties.put("mail.smtp.host", "smtp.gmail.com");        //every mail service (e.g. Gmail) has a host and port
        properties.put("mail.smtp.port", "587");                   //Gmail's host is setp.gmail.com. Their port is 587

        String myAccountEmail = "WRITE EMAIL HERE";          //Email and pass of email from which you're sending the emails
        String password = "WRITE PASSWORD HERE";

        Session session = Session.getInstance(properties, new Authenticator() { //logs in
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
       });

       Message message = prepareMessage(session, myAccountEmail, recipient);

       Transport.send(message);
       System.out.println("Message sent successfully");
    } 

    private static Message prepareMessage(Session session, String myAccountEmail, String recipient) {
        try { 
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); //can also be RecipientType.BCC or RecipientType.CC
            message.setSubject("WRITE EMAIL SUBJECT HERE");                                 //Email subject
            message.setText("WRITE EMAIL BODY HERE");                                       //Email body
            return message;
        } catch (Exception ex) {
        Logger.getLogger (JavaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
    } 
    return null;
}}