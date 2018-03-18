import Interfaces.ProcessService;
import Interfaces.ServiceInjector;

/**
 * 
 */

/**
 * @author vaish
 *
 */
public class EmailserviceInjector implements ServiceInjector{

	@Override
	public ProcessService getService() {
		return new ProcessMessage(new EmailService());
		
	}
	

}
