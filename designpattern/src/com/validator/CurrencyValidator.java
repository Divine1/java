package com.validator;

public class CurrencyValidator implements IvalidatorMarker {
	public Ivalidator validate(String currency) {
		
		return (errorMap) ->{
			System.out.println("in CurrencyValidator "+currency);
			errorMap.put(getClass().getName(), "");
			return errorMap;
		};
	}
}
