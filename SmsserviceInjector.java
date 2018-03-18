import Interfaces.ProcessService;
import Interfaces.ServiceInjector;

/**
 * 
 */

/**
 * @author vaish
 *
 */
public class SmsserviceInjector implements ServiceInjector{

	@Override
	public ProcessService getService() {
		return new ProcessMessage(new SmsService());
		
	}
	

}
