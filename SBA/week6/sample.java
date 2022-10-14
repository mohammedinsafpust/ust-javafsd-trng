package ust.com;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Sample {
	
	static Logger  log=Logger.getLogger(Sample.class.getName());
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.debug("Heloo debug");
		log.info("Hello from info");
	}

}
