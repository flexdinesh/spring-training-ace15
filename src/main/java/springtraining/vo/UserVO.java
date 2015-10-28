package springtraining.vo;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UserVO {
	@Size(min = 2, max = 30, message = "Your name must contain atleast 2 characters")
	private String name;

	@NotEmpty(message = "Please enter your email addresss.")
	@Email
	private String email;

	@NotNull(message = "Please enter your age.")
	@Min(value = 13, message = "Must be minimum 13 years old.")
	@Max(value = 100, message = "Age cannot exceed 100.")
	private Integer age;

	@Size(min = 10, max = 10, message = "Please enter a 10 digit number.")
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
