package com.validator;

public class AccountNameValidator implements IvalidatorMarker{
	public Ivalidator validate(String accountname) {
		
		return (errorMap) ->{
			System.out.println("in AccountNameValidator "+accountname);
			errorMap.put(getClass().getName(), "");
			return errorMap;
		};
	}
}
