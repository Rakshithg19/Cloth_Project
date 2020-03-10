package raksh.cloth.project.dao;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import raksh.cloth.project.entity.AddressEntity;
import raksh.cloth.project.entity.UserInfoEntity;
import raksh.cloth.project.exceptions.DAOException;

@Repository
public class RegistrationDAOImpl implements RegistrationDAO {
	private static Logger logger = Logger.getLogger(RegistrationDAOImpl.class);
	@Autowired
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public RegistrationDAOImpl() {
		logger.info("inside getMessage()...Invoked :" + this.getClass().getSimpleName());
	}

	public void save(UserInfoEntity userEntity) throws DAOException {
		logger.info("inside getMessage()...Invoking save method from DAOImpl");
		Session session = null;
		try {
			session = factory.openSession();

			session.beginTransaction();

			session.save(userEntity);

			session.getTransaction().commit();
			logger.info("inside getMessage()...Data saved in DataBase succesfully.");

		} catch (Exception e) {
			logger.info("INFO:" + e.getMessage());
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				logger.info("inside getMessage()...Resources closed.");

			}
		}

	}

	public void save(AddressEntity addressEntity) throws DAOException {
		logger.info("inside getMessage()...Invoking save method from DAOImpl");
		Session session = null;
		try {
			session = factory.openSession();

			session.beginTransaction();

			session.save(addressEntity);

			session.getTransaction().commit();
			logger.info("inside getMessage()...Data saved in DataBase succesfully.");

		} catch (Exception e) {
			logger.info("INFO:" + e.getMessage());
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				logger.info("inside getMessage()...Resources closed.");

			}
		}

	}
}
