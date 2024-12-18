package com.jsp.strings;

public class RiverseString {

	public static void main(String[] args) {
		String s="manasa";
		char[]ch=s.toCharArray();
		
		int i=0;
		int j=ch.length-1;
		while(i<j) {
			char temp=ch[j];
			ch[j]=ch[i];
			ch[i]=temp;
			
		}
		System.out.println(ch);
			
		}
		

	}


