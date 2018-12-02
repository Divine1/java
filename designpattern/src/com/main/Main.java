package com.main;

import java.util.function.Predicate;

interface Myinterface{
	String my(int s);
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main");
		//Predicate<String> pred = (inp)-> inp.equals("");	
		//System.out.println(pred.test(""));
		
		//Predicate<String> pred = Main::comp;
		Myinterface myinterf = Main::comp;
		System.out.println(myinterf.my(3));
	}
	public static String comp(int a) {
		System.out.println("in comp");
		return "in comp";
	}
}
