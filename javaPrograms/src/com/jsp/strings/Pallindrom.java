package com.jsp.strings;

public class Pallindrom {

	static boolean ispallindrom(String s) {
		s=s.toLowerCase();
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
	
			
		}
		return true;
		
		
	}

	
	public static void main(String[] args) {
		System.out.println(ispallindrom("sis"));
		}
}
