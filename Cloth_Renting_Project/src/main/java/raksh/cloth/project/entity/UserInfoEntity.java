package raksh.cloth.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.hibernate.annotations.GenericGenerator;


import lombok.Data;

@Entity
@Table(name = "userinfo")
@Data
public class UserInfoEntity implements Serializable {
	private static Logger logger = Logger.getLogger(UserInfoEntity.class);
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private int id;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "middleName")
	private String middleName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "type")
	private String type;
	@Column(name = "phoneNumber")
	private Long phoneNumber;
	@Column(name = "alternativeNumber")
	private int alternativeNumber;
	@Column(name = "password")
	private String password;
	
	 public UserInfoEntity() {
		 logger.info("inside getMessage()...Invoked :" + this.getClass().getSimpleName());
	 }

	public UserInfoEntity(int id, String firstName, String middleName, String lastName, String email, String type,
			Long phoneNumber, int alternativeNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.type = type;
		this.phoneNumber = phoneNumber;
		this.alternativeNumber = alternativeNumber;
	}
}
