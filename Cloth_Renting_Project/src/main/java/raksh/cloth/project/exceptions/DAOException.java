package raksh.cloth.project.exceptions;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class DAOException extends Exception{
	private static Logger logger = Logger.getLogger(ControllerException.class);

	private String message = "Exception has occured:" + this.getClass().getSimpleName();
	
	 public DAOException() {
		logger.info("inside getMessage()...Created :" + this.getClass().getSimpleName() );
	}
	 public DAOException(String message) {
			this.message = message;
			logger.info("inside getMessage()...Created :" + this.getClass().getSimpleName());
		}

		public String getMessage() {
			logger.info("inside getMessage()..." + message);
			return message;
		}

	}
