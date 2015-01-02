package com.stringhandling.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {
	Pattern pattern;
	Matcher matcher;
	public RegularExpressionExample(){
		//boolean val = characterMatching("....", "1234");
		//boolean val = matchingAtBeginingOfLine("^..cd", "abcd");
		//boolean val = matchAnyOfTheCharacter("[1][0123456789][0123].", "192.");
		
		//boolean val = negatesPattern("[^123][^456]", "27");
		//boolean val = matchesRangesFrom("[1-8a-n]", "9");
		//boolean val = matchesOR("x.|yy", "yz");
		//boolean val = matchesForDigits("\\d", "10");
		//boolean val = matchesForWords("\\w", "_");// Accepts 0-9 and a-z and A-Z
		//boolean val = matchesForNonWords("\\W", " ");// Accepts anything except 0-9 and a-z and A-Z
		//boolean val = occursNTimes("A{5}....", "AAAAABCCD");//  checks for alphabet A for exactly 5 times.
		//boolean val = occursOnceOrNotAtAll("ABC?", "AB");//  checks for alphabet A for exactly 5 times. 
		//boolean val = occursZeroOrMoreTimes("X+", "XXXXXXXXXXXX");//  checks for actually occuring one or more times.
		//boolean val = occursAtleastNTimesButNotMoreThanMTimes("X{2,6}", "XXXXX");//  checks for actually occuring one or more times.
		
		//caseInsensitivePattern("aa", "AAbngaadhkfhsfkhAA");
		//findDifferentSplits("\\W", "AAAn@BBN%CCCC@SSSS}DDDD$DDDD");
		
		replaceFirst("1*2*", "1111111111111222222222222222222222223456781233333");
		replaceFirst("1*2", "1111111111111222222222222222222222223456781233333");
		
//		System.out
//				.println("RegularExpressionExample.RegularExpressionExample()"+ val);
//		
		
		
		
	}
	
	public static void main(String[] args) {
		new RegularExpressionExample();
		
	}
	
	public boolean characterMatching(String charseq , String inputString){
		boolean check = false;
		pattern = Pattern.compile(charseq);
		matcher = pattern.matcher(inputString);
	
		check = matcher.matches();
		return check;
		
	}
	
	public boolean matchingAtBeginingOfLine(String charseq , String inputString){
		boolean check = false;
		pattern = Pattern.compile(charseq);
		System.out
				.println("RegularExpressionExample.matchingAtBeginingOfLine()");
		matcher = pattern.matcher(inputString);
	
		check = matcher.matches();
		return check;
		
	}
	
	public boolean matchAnyOfTheCharacter(String charseq , String inputString){
		boolean check = false;
		pattern = Pattern.compile(charseq);
		matcher = pattern.matcher(inputString);
	
		check = matcher.matches();
		return check;
	}
	
	public boolean negatesPattern(String charseq , String inputString){
		boolean check = false;
		pattern = Pattern.compile(charseq);
		matcher = pattern.matcher(inputString);
	
		check = matcher.matches();
		return check;
	}
	
	public boolean matchesRangesFrom(String charseq , String inputString){
		boolean check = false;
		pattern = Pattern.compile(charseq);
		matcher = pattern.matcher(inputString);
	
		check = matcher.matches();
		return check;
	}
	
	public boolean matchesOR(String charseq , String inputString){
		boolean check = false;
		pattern = Pattern.compile(charseq);
		matcher = pattern.matcher(inputString);
	
		check = matcher.matches();
		return check;
	}
	
	public boolean matchesForDigits(String charseq , String inputString){
		boolean check = false;
		pattern = Pattern.compile(charseq);
		matcher = pattern.matcher(inputString);
	
		check = matcher.matches();
		return check;
	}
	
	public boolean matchesForWords(String charseq , String inputString){
		boolean check = false;
		pattern = Pattern.compile(charseq);
		matcher = pattern.matcher(inputString);
	
		check = matcher.matches();
		return check;
	}
	
	public boolean matchesForNonWords(String charseq , String inputString){
		boolean check = false;
		pattern = Pattern.compile(charseq);
		matcher = pattern.matcher(inputString);
	
		check = matcher.matches();
		return check;
	}
	
	public boolean occursOnceOrNotAtAll(String charseq , String inputString){
		boolean check = false;
		pattern = Pattern.compile(charseq);
		matcher = pattern.matcher(inputString);
	
		check = matcher.matches();
		return check;
	}
	
	
	public boolean occursNTimes(String charseq , String inputString){
		boolean check = false;
		pattern = Pattern.compile(charseq);
		matcher = pattern.matcher(inputString);
	
		check = matcher.matches();
		return check;
	}
	
	public boolean occursZeroOrMoreTimes(String charseq , String inputString){
		boolean check = false;
		pattern = Pattern.compile(charseq);
		matcher = pattern.matcher(inputString);
	
		check = matcher.matches();
		return check;
	}
	public boolean occursAtleastNTimesButNotMoreThanMTimes(String charseq , String inputString){
		boolean check = false;
		pattern = Pattern.compile(charseq);
		matcher = pattern.matcher(inputString);
	
		check = matcher.matches();
		return check;
	}
	
	public void caseInsensitivePattern(String charseq , String inputString){
		boolean check = false;
		pattern = Pattern.compile(charseq,Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(inputString);
		while(matcher.find()){
			System.out
					.println("RegularExpressionExample.caseInsensitivePattern() found text"+ matcher.group() +"Startindex"+ matcher.start() +"EndIndex"+ matcher.end());
		}
	
		check = matcher.matches();
		//return check;
	}
	
	public void findDifferentSplits(String charseq , String inputString){
		pattern = Pattern.compile(charseq);
	
		System.out.println("RegularExpressionExample.findDifferentSplits()");
		String[] words = pattern.split(inputString);
		
		
		for(String s : words){
			System.out
					.println("RegularExpressionExample.findDifferentSplits()"+ s);
		}
	}
	
	public void replaceFirst(String charseq , String inputString){
		pattern = Pattern.compile(charseq);
		matcher = pattern.matcher(inputString);
	
		System.out.println("RegularExpressionExample.findDifferentSplits()"+ matcher.replaceFirst("_"));
	
		
		
		
	}
	
	public void replaceAll(String charseq , String inputString){
		pattern = Pattern.compile(charseq);
		matcher = pattern.matcher(inputString);
	
		System.out.println("RegularExpressionExample.findDifferentSplits()"+ matcher.replaceFirst("_"));
		
		
		
	}
	
	
	
	
	
	

}
