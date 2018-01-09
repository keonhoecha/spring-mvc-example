package net.fashiongo.web.controller;
import java.time.LocalDateTime;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	private static final Logger logger = LogManager.getLogger(HomeController.class);
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.error("home controller called");
		logger.log(Level.forName("search", 50), "custom log message");
		model.addAttribute("serverTime", LocalDateTime.now().toString());
		return "home";
	}
}
