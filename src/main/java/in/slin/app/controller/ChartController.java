package in.slin.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/birthchart")
public class ChartController {
	private static Logger LOGGER = LoggerFactory.getLogger(ChartController.class);

	@RequestMapping(method=RequestMethod.GET)
	public String getHome () {
		LOGGER.info("Getting birth chart.");
		return "birthchart";
	}
}
