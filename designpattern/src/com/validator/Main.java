package com.validator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IvalidatorMarker accountIdMarker = new AccountIdValidator();
//		IvalidatorMarker accountNameMarker = new AccountNameValidator();
//		IvalidatorMarker currencyMarker = new CurrencyValidator();

		trail();
		
		//List<Integer> list = Arrays.asList(1,2,3,4);
		/*
		String[] myArray = { "this", "is", "a", "sentence" };
		String result = Arrays.stream(myArray)
		                .reduce("", (a,b) -> {
		                	System.out.println("a "+a);
		                	System.out.println("b "+b);
		                	return a + b;
		                	});
		
		Optional<String>  result1 = Arrays.stream(myArray)
                .reduce((a,b) -> {
		                	System.out.println("a "+a);
		                	System.out.println("b "+b);
		                	return a + b;
		                	});
		
		
		*/
		//System.out.println("Result1 "+result1);
		
		
//		
//		Optional<Integer>  result2 = list.stream()
//                .reduce((a,b) -> {
//		                	System.out.println("a "+a);
//		                	System.out.println("b "+b);
//		                	return a + b;
//		                	});
//		System.out.println("Result2 "+result2);
	}

	public static void trail() {
		List<String> classlist = Arrays.asList("com.validator.AccountIdValidator",
				"com.validator.AccountNameValidator","com.validator.CurrencyValidator");
		Map<String,String> errorMap = new LinkedHashMap<>();

		/*Ivalidator ivalidator = CreateInstance.creator(classlist);
		ivalidator.validate(errorMap);
		System.out.println(errorMap);*/
		
		
		List<Ivalidator> ivalidatorList = CreateInstance.creator(classlist);
		
		/*
		Optional<Ivalidator> optional= ivalidatorList.stream()
				.reduce((val,err) ->{
					val.
					return null;
				});
		*/
		
		Optional<Map<String, String>> opt= ivalidatorList.stream()
				.map((inp) -> {
					System.out.println("74");
					return inp.validate(errorMap);
				})
				.reduce((start,inc) ->{
					System.out.println("start "+start);
					return inc;
				});
		
		System.out.println(opt.get());
		
	}
}
