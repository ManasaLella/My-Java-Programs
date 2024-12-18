package com.jsp.strings;

public class ComparingString {

	public static void main(String[] args) {
		String s1=new String("abcd");
		System.out.println(s1);
		
		String s2="abcd";
		System.out.println(s2);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3="ABCD";//ignore small or capitals but compare
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));

	}

}
