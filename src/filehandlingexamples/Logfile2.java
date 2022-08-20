package filehandlingexamples;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.pattern.LogEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logfile2 {

	public static Logger log2=LoggerFactory.getLogger(Logfile2.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("D:\\Jarfiles\\Log4j\\log4j.properties");
		log2.info("operation start");
		int a = 1;
		int b = 2;
		int c = a+b;
		System.out.println(c);
		log2.info("operation end");
		
		
	}

}

