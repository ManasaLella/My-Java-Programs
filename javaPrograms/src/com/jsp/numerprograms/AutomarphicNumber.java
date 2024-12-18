package com.jsp.numerprograms;

public class AutomarphicNumber {

	public static void main(String[] args) {
		
		int n=5,p=1 , sq=n*n ,num=n;
		
		while(n>0) {
			p*=10;
			n/=10;
			
		}
		if(num==sq%p) System.out.println("automarphic");
		else System.out.println("not");

	}

}
