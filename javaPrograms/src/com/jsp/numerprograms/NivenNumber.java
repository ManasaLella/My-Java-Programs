package com.jsp.numerprograms;
/* if 21 2+1=3 21%3==0 niven */
public class NivenNumber {

	public static void main(String[] args) {
		
		int n=21,sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		if(n%sum==0) System.out.println("niven number");
		else System.out.println("not");

	}

}
