package james.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomePageController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String homePage(Model model){
		return "helloworld";
	}
	
	@RequestMapping(value="/helloworld", method=RequestMethod.GET)
	public String helloWorld(Model model){
		return "helloworld";
	}
}
