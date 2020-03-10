package raksh.cloth.project.service;

import java.util.Objects;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import raksh.cloth.project.dao.RegistrationDAO;
import raksh.cloth.project.dto.RegistrationDTO;
import raksh.cloth.project.entity.AddressEntity;
import raksh.cloth.project.entity.UserInfoEntity;
import raksh.cloth.project.exceptions.ServiceException;

import raksh.cloth.project.util.EmailUtil;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	private static Logger logger = Logger.getLogger(RegistrationServiceImpl.class);

	@Autowired
	private RegistrationDAO dao;
	@Autowired
	private EmailUtil emailUtil;

	public RegistrationServiceImpl() {
		logger.info("inside getMessage()...Invoked :" + this.getClass().getSimpleName());
	}

	public boolean validateAndSave(RegistrationDTO dto) throws ServiceException {
		boolean valid = false;
		try {
			if (Objects.nonNull(dto)) {
				logger.info("starting validation for " + dto);

				// Validation for first name
				String FirstName = dto.getFirstName();
				if (FirstName != null && !FirstName.isEmpty() && FirstName.length() >= 5) {
					logger.info("First name is valid");
				}else {
					if (FirstName == null) {
						logger.info("First name is null");
					}
				
					valid = false;
				}
				// Validation for last name
				String LastName = dto.getLastName();
				if (LastName != null && !LastName.isEmpty() && LastName.length() >= 5) {
					logger.info("First name is valid");
				} else {
					if (LastName == null) {
						logger.info("First name is null");
					
					}
					valid = false;
				}
				// Validation for email
				String Email = dto.getEmail();
				if (Email != null && Email.length() > 10 && Email.contains("@")) {
					logger.info("Entered Email Id length is valid");
					valid = true;
				} else {
					if (Email == null && Email.length() < 10) {
						logger.info("Not Valid:Email Id length is less than 4");
					}
					valid = false;
				}
				// Validation for phone number
				long PhoneNumber = dto.getPhoneNumber();
				String PhoneNumber1 = Long.toString(PhoneNumber);
				if (PhoneNumber1 != null && PhoneNumber1.length() == 10) {
					logger.info("Entered Phone Number is valid");
					valid = true;
				} else {
					if (PhoneNumber1 == null && PhoneNumber1.length() < 10) {
						logger.info("Not Valid:Email Id length is less than 4");
					}
					valid = false;
				}
			//validation for address
			String Address = dto.getAddress();
			if (Address != null && !Address.isEmpty() && Address.length() >= 5) {
				logger.info("Address is valid");
			}else {
				if (Address == null) {
					logger.info("Address is null");
				}
				valid = false;
			}
			String City = dto.getCity();
			if (City != null && !City.isEmpty() && City.length() >= 5) {
				logger.info("City is valid");
			}else {
				if (City == null) {
					
					logger.info("City is null");
				}
				valid = false;
			}
			String State = dto.getState();
			if (State != null && !State.isEmpty()) {
				logger.info("State is valid");
			}else {
				if (State == null) {
					logger.info("State is null");
				}
				valid = false;

			}
			if (valid) {
				System.out.println("Data is valid ,will convert  to entity");

				
				
				
				
				UserInfoEntity userEntity = new UserInfoEntity();
				AddressEntity addressEntity = new AddressEntity();

				BeanUtils.copyProperties(dto, userEntity);
				BeanUtils.copyProperties(dto, addressEntity);
				String randomPassword=RandomStringUtils.randomAlphanumeric(9);
				logger.info("entity is ready \t " + userEntity+ " "+addressEntity);
				dao.save(addressEntity);
				userEntity.setPassword(randomPassword);
				dao.save(userEntity);
				
				
				emailUtil.sendMail(dto.getEmail(), ""+randomPassword, "XWORKZ password generated");
			}

		}
		}catch (Exception e) {
			logger.error("--Exception occured--");
		}
		return false;
	}

}

