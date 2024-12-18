package com.jsp.strings;

public class CountOccerence {

	public static void main(String[] args) {
		String s="manasa";
		int count=s.length()-s.replace("a", "").length();
		System.out.println(count);

	}

}
