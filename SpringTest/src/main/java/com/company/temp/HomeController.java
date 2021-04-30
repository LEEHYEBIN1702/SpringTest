package com.company.temp;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@GetMapping("/")
	public String index(HttpServletRequest request) {
	    logger.debug("###INDEX PAGE###");
	    String rtnPage = "contact";
	    String ipAddress = request.getHeader("X-FORWARDED-FOR");
	    if (ipAddress == null) {
	        ipAddress = request.getRemoteAddr();
	    }
	    logger.info(ipAddress + " : " + rtnPage);
	    return rtnPage;
	}	
}
