package springtraining.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springtraining.utils.UserValidator;
import springtraining.vo.UserVO;

@Controller
// @RequestMapping(value = "/controller")
public class HomeController {
	@Autowired
	UserValidator validator;

	String message = "Welcome to home page";

	@RequestMapping("/home")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "user") String name) {

		ModelAndView mv = new ModelAndView("home");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

	@RequestMapping(value = "/formpage", method = RequestMethod.GET)
	public ModelAndView getFormPage() {

		ModelAndView mv = new ModelAndView("formpage_command");
		// mv.addObject("userVo", new UserVO());
		return mv;
	}

	@RequestMapping(value = "/submitform", method = RequestMethod.POST)
	public String submitForm(@Valid @ModelAttribute("userVo") UserVO userVo, BindingResult result, Model model) {

		// custom validation
		validator.validate(userVo, result);

		if (result.hasErrors()) {
			return "formpage_command";
		}
		model.addAttribute("user", userVo.getName());
		return "successpage";
	}

	@RequestMapping(value = "/maintenancepage", method = RequestMethod.GET)
	public ModelAndView getMaintenancePage() {

		ModelAndView mv = new ModelAndView("maintenancepage");
		return mv;
	}

}
