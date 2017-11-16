package com.jm3002.learn.spring.mvc.ann;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = StudentCodePrefixValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface StudentCodePrefix {
	
	public String value() default "STD";

	public String message() default " code should start with STD";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
}
