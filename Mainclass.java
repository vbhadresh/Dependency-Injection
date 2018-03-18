import Interfaces.ServiceInjector;

public class Mainclass {

	public static void main(String[] args) {
		ServiceInjector injector;
		injector= new EmailserviceInjector();
		injector.getService().processMessages("carserviceschicago@gmail.com","test", "carserviceschicago@gmail.com", "Hello");;
		injector= null;
		injector= new SmsserviceInjector();
		injector.getService().processMessages("abcd@gmail.com","test", "3120987898", "Hello");;
	}
}
