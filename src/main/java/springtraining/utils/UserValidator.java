package springtraining.utils;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import springtraining.exception.MyCustomException;
import springtraining.vo.UserVO;

@Component
public class UserValidator implements Validator {

	public boolean supports(Class clazz) {
		return UserVO.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		UserVO userVo = (UserVO) target;

		if (userVo.getAge() != null && userVo.getAge() == 21) {
			// errors.rejectValue("age", "error.reject21", new Object[] {
			// "'age'" }, "Alternate Error Text");
			throw new MyCustomException("AGE21", "This is MyCustomException for age 21");
		}

		// ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
		// "error.name", "Name cannot be empty.");
	}

}