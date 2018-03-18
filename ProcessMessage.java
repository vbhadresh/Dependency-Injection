import Interfaces.ProcessService;
import Interfaces.Services;

public class ProcessMessage implements ProcessService {
	
	private Services service;
	
	public ProcessMessage(Services serv) {
		this.service=serv;
	}

	@Override
	public void processMessages(String Sender,String Subject, String Receiver, String Message) {
		this.service.sendService(Receiver,Subject, Receiver, Message);
		
	}

	

}
