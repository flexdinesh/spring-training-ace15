package springtraining.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/homeexample")
	public ModelAndView showMessage() {

		ModelAndView mv = new ModelAndView("home");
		
		mv.addObject("message", "MyMessage");
		mv.addObject("name", "MyName");
		
		return mv;
	}
}
