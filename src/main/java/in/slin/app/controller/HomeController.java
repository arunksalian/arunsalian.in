package in.slin.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static in.slin.app.util.Constants.*;

@Controller
@RequestMapping("/slin")
public class HomeController {

	@RequestMapping(method=RequestMethod.GET)
	public String getHome () {
		return TOKEN_HOME;
	}
}
