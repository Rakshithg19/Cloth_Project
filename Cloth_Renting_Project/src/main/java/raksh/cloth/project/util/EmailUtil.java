package raksh.cloth.project.util;

import raksh.cloth.project.exceptions.UtilException;

public interface EmailUtil {
	public boolean sendMail(String toEmailId, String body, String subject) throws UtilException;
}
