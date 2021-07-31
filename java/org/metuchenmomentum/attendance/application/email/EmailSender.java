package org.metuchenmomentum.attendance.application.email;

import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
// import java.util.logging.Level;
// import java.util.logging.Logger;

public class EmailSender {

    private final Session session;						//to send an email you need a Session and 										
    private final String fromEmail;						//an email to send from	
//    private final String toEmail;
//    private final String subject;
//    private final String body;
    
    
    EmailSender (Session session, String fromEmail) { 
        this.session = session;
        this.fromEmail = fromEmail; 
    }

public boolean send(String toEmail, String subject, String body) throws AddressException, MessagingException {

	//This?
	/*
	 * String recipient = toEmail;
	 * String emailSubject = subject;
	 * String emailBody = body;
	 */
	
	//or this?
	/*
	 * this.toEmail = toEmail;
	 * this.subject = subject;
	 * this.body = body;
	 */
	
//	try {
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(fromEmail)); 
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail)); //can also be RecipientType.BCC or RecipientType.CC
		message.setSubject(subject);                                 			   	//Email subject
		message.setText(body);    								    				 //Email body
//	} catch (Exception ex) {
//        Logger.getLogger (EmailSender.class.getName()).log(Level.SEVERE, null, ex);
///    }  
	
	Transport.send(message);
	return true;
	
}

public static Builder builder() {
    return new Builder();
    }

public static class Builder {
    private boolean auth;
    private boolean tlsEnable;
    private String host;
    private int port;
    private String email;
    private String password;

    private Builder() { //private = it will go through the Builder class, not just through this method
        auth = true;
        tlsEnable = true;
        host = null;
        port = 587;
        email = null;
        password = null;
        }
        
    public Builder disableAuth() { //so that user can change
        auth = false;
        return this;
        }

    public Builder disableTls() {
        tlsEnable = false;
        return this;
        }

    public Builder setHost(String hostString) {
        host = hostString;
        return this; //so that it'll return when u call this
    }

    public Builder setEmail(String userEmail) {
        email = userEmail;
        return this;
    }

    public Builder setPassword(String userPassword) {
        password = userPassword;
        return this;
    }

    public EmailSender build() {
        Properties properties = new Properties();
    
            properties.put("mail.smtp.auth", auth);                        
            properties.put("mail.smtp.starttls.enable", tlsEnable);            
            properties.put("mail.smtp.host", host);    
            properties.put("mail.smtp.port", port);              
    
            Session session = Session.getInstance(properties, new Authenticator() { //logs in
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(email, password);
                    }
            });
            return new EmailSender(session, email);
        }
    }
}


    


