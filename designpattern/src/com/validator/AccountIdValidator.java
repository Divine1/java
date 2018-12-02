package com.validator;

public class AccountIdValidator implements IvalidatorMarker{

	public Ivalidator validate(String accountid) {
		return (errorMap) ->{
			System.out.println("in AccountIdValidator "+accountid);
			errorMap.put(getClass().getName(), "");
			return errorMap;
		};
	}
}
