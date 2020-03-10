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
@Table(name = "Address")
@Data
public class AddressEntity implements Serializable {
	private static Logger logger = Logger.getLogger(AddressEntity.class);

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private int id;
	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "landMark")
	private String landMark;

	public AddressEntity() {
		logger.info("inside getMessage()...Invoked :" + this.getClass().getSimpleName());
	}
}
