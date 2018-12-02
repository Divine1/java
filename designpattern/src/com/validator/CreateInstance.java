package com.validator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class CreateInstance {
	public static Ivalidator create(String className) {
		Class cls;
		IvalidatorMarker ivalidatorMarker = null;
		Ivalidator ivalidator = null;
		try {
			cls = Class.forName(className);
			
			ivalidatorMarker = (IvalidatorMarker) cls.newInstance(); 
	        System.out.println(ivalidatorMarker); 
	        ivalidator = ivalidatorMarker.validate("");
	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return ivalidator;
	}
	
	/*
	public static Ivalidator creator(List<String> classlist) {
		Ivalidator ivalidatorChain = null;
		for (String list : classlist) {
			Ivalidator ivalidatorAtomic = create(list);
			if(ivalidatorChain == null) {
				ivalidatorChain = ivalidatorAtomic;
			}
			else {
				ivalidatorChain = ivalidatorChain.andThen(ivalidatorAtomic);
			}
		}
		return ivalidatorChain;
		
	}
	*/
	
	public static List<Ivalidator> creator(List<String> classlist) {
		List<Ivalidator> ivalidatorList = new LinkedList<>();
		for (String list : classlist) {
			Ivalidator ivalidatorAtomic = create(list);
			ivalidatorList.add(ivalidatorAtomic);
		}
		return ivalidatorList;
	}
}
