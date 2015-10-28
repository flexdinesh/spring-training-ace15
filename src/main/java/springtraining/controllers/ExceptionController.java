package springtraining.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import springtraining.exception.MyCustomException;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(MyCustomException.class)
	public ModelAndView handleMyCustomException(MyCustomException ex) {

		ModelAndView model = new ModelAndView("error");
		model.addObject("errCode", ex.getErrCode());
		model.addObject("errMsg", ex.getErrMsg());

		return model;

	}

	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(Exception ex) {

		ModelAndView model = new ModelAndView("error");
		model.addObject("errMsg", "this is a Generic Exception");

		return model;

	}
}
