package com.jsp.strings;

public class PallindromInSentence {

	public static void main(String[] args) {
		
		String s="madam sir madam sis";
		String[] s1=s.split(" ");
      for(int i=0; i<s1.length;i++) {
    	  if(Pallindrom.ispallindrom(s1[i]))
    		  System.out.println(s1[i]);
      }
	}

}
