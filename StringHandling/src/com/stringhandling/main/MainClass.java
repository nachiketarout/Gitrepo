package com.stringhandling.main;

public class MainClass {
	String firstString;
	String secondString;
	public MainClass(){
		
		firstString = new String("nachi");
		secondString = new String("nachi");
		
		//checkStringCompatibility("Nachi", "Nachi");
		checkStringCompatibility(firstString, secondString);
		
	}
	public static void main(String[] args) {
		new MainClass();
	}
	
	public boolean checkStringCompatibility(String s1 , String s2){
		boolean check = false;
		if(s1==s2){
			System.out.println("MainClass.checkStringCompatibility()");
			System.out.println("MainClass.checkStringCompatibility()"+ s1==s2);
			System.out.println(s1==s2);
		}else{
			System.out.println("MainClass.checkStringCompatibility() Faileddddddddddd");
		}
		
		return check;
		
	}

}
