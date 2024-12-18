package com.jsp.numerprograms;

import java.util.Scanner;
/*if 9 is there 9*9=81 and 8+1=9 multiplication sum = number */
public class NeonNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int sq=n*n;
		int sum=0;
	
		while(sq>0) {
			sum+=(sq%10);
			sq/=10;
		}
		if(n==sum) System.out.println("neon number");
		else System.out.println("not");

	}

}
