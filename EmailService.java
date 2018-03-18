import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import Interfaces.Services;

public class EmailService implements Services {

	@Override
	public void sendService(String Sender,String Subject, String Receiver, String message) {
		String password = "Gmail@123";
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		// get Session
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(Sender, password);
			}
		});
		
try {
			
			if (!(Receiver == null)) {
				MimeMessage msg = new MimeMessage(session);
				msg.addRecipient(Message.RecipientType.TO, new InternetAddress(Receiver));
				msg.setSubject(Subject);
				msg.setText(message);
				// send message
				Transport.send(msg);
				System.out.println("Successfully Email has been sent to "+ Receiver);
			
			} else {
				System.out.println("Message not sent");
			
			}
		
		
	}
catch(Exception e){
	System.err.println("Failed to send mail to "+ Receiver);
}

}
}
