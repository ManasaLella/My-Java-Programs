package com.jsp.numerprograms;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int n=scn.nextInt();
		int sum=0;
		int prod=1;
		while(n>0) {
			sum+=n%10;
			prod*=n%10;
			n/=10;
		}
    
		if(sum==prod) System.out.println(" spy number");
		else System.out.println("not");
	}

}
