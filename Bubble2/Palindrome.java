package com.java11.scjp.chapter1.welcome2java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Here we find all the Palindrome available in a given string. 
 * @author Karthic Santhanam
 *
 */
public class Palindrome {
	
	static List<String> paliStrList = new ArrayList<String>(); 

	public static void main(String[] args) {
		
		//String input = "dgfgsdkfbhsdaduifhsafhosasdsagjkjszsfhdfiohrothilirilutABCBAmalayalammg";
		//String input = "malayalam";
		String input = "ammaklsdfjasdfghjklirilkjhgfdsajaduadrianvcjfisdjrfadncvskladjimalayalamWAMAW";

		System.err.println(new Date().getTime());
		  int inputLen = input.length();
		  
		  for (int i=0; i < inputLen; i++) {
		  
			  char matchCharRef = input.charAt(i);
			  
			  int lastIndexOfChar = input.lastIndexOf(matchCharRef);
			  
			  if (i == lastIndexOfChar) 
				  continue;
			  
			  String probablePalindrome = input.substring(i, lastIndexOfChar+1);
			  
			  
			  if (probablePalindrome.length() > 2) {
				  palindromeTest(probablePalindrome, matchCharRef);
			  }
			  
		  }
		  System.out.println(paliStrList);
   		  System.err.println(new Date().getTime());
	
	}
	
	public static List<String> palindromeTest(String palindromeCheckInput, char refChar) {
		
		  String reversed = new StringBuffer(palindromeCheckInput).reverse().toString();
		  if (palindromeCheckInput.equals(reversed)) { 
			  if (palindromeCheckInput != null && 
					  !palindromeCheckInput.trim().isEmpty() && 
					  	   palindromeCheckInput.trim().length() > 2 && 
					  		   !palindromeCheckInput.equals("")) {
				  paliStrList.add(palindromeCheckInput);
			  }
		  }
		  
		  if (palindromeCheckInput.length() > 2)
		  palindromeTest(palindromeCheckInput.substring(0, palindromeCheckInput.length()-1), refChar); 
		  
		  return paliStrList;
		
	}

}
