package com.jm3002.learn.spring.mvc.ann;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StudentCodePrefixValidator implements ConstraintValidator<StudentCodePrefix, String> {

	public String defaultPrefixValue;

	public void initialize(StudentCodePrefix studentCodePrefix) {
		this.defaultPrefixValue = studentCodePrefix.value();
	}

	@Override
	public boolean isValid(String valuebyUser, ConstraintValidatorContext arg1) {
		boolean result = false;
		
		if(valuebyUser != null){
			result  = valuebyUser.startsWith(defaultPrefixValue);
		}
		else{
			result = true;
		}

		return result;
	}

}
