package beans;

import java.util.Properties;
import java.util.Set;

public class Test {

	private Properties Driver;
		public void setDriver(Properties driver) {
		Driver = driver;
	}
	public void printData() {
		Set keys=Driver.keySet();
		for(Object key:keys) {
			System.out.println( key+":"+Driver.getProperty(key.toString()));
		}
	}
	
}
