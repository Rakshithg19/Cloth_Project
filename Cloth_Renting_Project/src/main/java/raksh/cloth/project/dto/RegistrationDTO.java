package raksh.cloth.project.dto;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;



import lombok.Data;

@Component
@Data
public class RegistrationDTO implements Serializable {
	private static Logger logger = Logger.getLogger(RegistrationDTO.class);
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String type;
	private Long phoneNumber;
	private Long alternativeNumber;
	private String address;
	private String city;
	private String state;
	private String landMark;
	
	public RegistrationDTO() {
		logger.info("inside getMessage()...Invoked :" + this.getClass().getSimpleName());
	}
}
