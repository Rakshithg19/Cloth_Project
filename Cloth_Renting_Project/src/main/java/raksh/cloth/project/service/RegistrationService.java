package raksh.cloth.project.service;

import raksh.cloth.project.dto.RegistrationDTO;
import raksh.cloth.project.exceptions.ServiceException;

public interface RegistrationService {
	public boolean validateAndSave(RegistrationDTO dto) throws ServiceException;

}
