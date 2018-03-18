import com.twilio.sdk.resource.api.v2010.account.message.*;

import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import com.twilio.sdk.Twilio;


import Interfaces.Services;

public class SmsService implements Services {

	@Override
	public void sendService(String Sender,String Subject, String Receiver, String Message) {
		 Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
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
		/* Message message = Message
		 .creator(new PhoneNumber("YOUR_PHONE_NUMBER"), new PhoneNumber("YOUR_TWILIO_NUMBER"),""
		 ).create();*/
		 
		 //System.out.println(message.getSid());
		 System.out.println("Successfully Message has been sent to "+ Receiver);
		 }
		
	}

