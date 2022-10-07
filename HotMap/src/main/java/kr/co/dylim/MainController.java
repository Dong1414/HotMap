package kr.co.dylim;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("vue/")
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String mainView(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "main";
	}
	
//	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
//	public String mainView2(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		return "main";
//	}
	
	@ResponseBody
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String test() {
		logger.info("getegetegt");
		
		return "main";
	}
	
}
