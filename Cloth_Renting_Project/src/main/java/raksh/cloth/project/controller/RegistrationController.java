
package raksh.cloth.project.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import raksh.cloth.project.dto.RegistrationDTO;
import raksh.cloth.project.exceptions.ControllerException;
import raksh.cloth.project.service.RegistrationService;

@Component
@RequestMapping("/")
public class RegistrationController extends ControllerException {
	private static Logger logger = Logger.getLogger(RegistrationController.class);

	@Autowired
	private RegistrationService service;

	public RegistrationController() {
		logger.info("created" + this.getClass().getSimpleName());
	}

	@RequestMapping("/SignUp.do")
	public String toSave(RegistrationDTO dto, ModelMap map) {
		logger.warn("warn message --> inside getMessage()...");
		logger.error("error message --> inside getMessage()..");
		try {
			logger.info("invoked onSignup");

			boolean check = this.service.validateAndSave(dto);
			if (check) {
				map.addAttribute("SignUp.jsp", "Data Saved");
			} else {
				map.addAttribute("SignUp.jsp", "Data not saved");
			}
		} catch (Exception e) {
			logger.info("INFO:" + e.getMessage());
		}
		return "SignUp";

	}
}
