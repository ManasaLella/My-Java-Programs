package com.jsp.numerprograms;

import java.util.Scanner;

public class FibnociGivenRange {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter lower limit");
		int l=scn.nextInt();
		System.out.println("enter upper limit");
		int u=scn.nextInt();
		int a=0,b=1,c;
		
		while(a<=u) {
			if(a>=l) System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}

	}

}
