package com.jsp.numerprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		
		int n=scn.nextInt();
		boolean flag=true;
		for(int i=2;i<=n/2;i++) {
			if(n<=1)continue;
			if(n%i==0) {
				flag=false;
				System.out.println(n+ "not a prime");
				break;
			}
		}
		if(flag) System.out.println(n+ "is a prime number");

	}

}
