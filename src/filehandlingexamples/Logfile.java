package filehandlingexamples;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logfile {
	//import slf4j
	
	public static Logger log=LoggerFactory.getLogger(Logfile.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//import log4j
		
		PropertyConfigurator.configure("D:\\Jarfiles\\Log4j\\log4j.properties");
		log.info("Start the program");
		int i=1;
		int j=2;
		int k=i+j;
		System.out.println(k);
		log.info("End the program");
		
	}

}
