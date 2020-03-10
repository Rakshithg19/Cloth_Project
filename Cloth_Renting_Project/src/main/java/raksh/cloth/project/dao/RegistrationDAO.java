package raksh.cloth.project.dao;

import raksh.cloth.project.entity.AddressEntity;
import raksh.cloth.project.entity.UserInfoEntity;
import raksh.cloth.project.exceptions.DAOException;

public interface RegistrationDAO {
	public void save(UserInfoEntity userEntity) throws DAOException;
	public void save(AddressEntity addressEntity) throws DAOException;
}
