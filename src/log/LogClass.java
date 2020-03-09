package log;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LogClass {
	
	static final Logger logger = Logger.getLogger(LogClass.class);
	
	public void logInfo(String infoLog) {
		BasicConfigurator.configure();
        logger.info("<--lOG INFO -->" + infoLog);
        System.out.println("<--lOG INFO -->" + infoLog);
	}
	
}
