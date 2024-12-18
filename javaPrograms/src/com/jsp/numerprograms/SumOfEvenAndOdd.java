package com.jsp.numerprograms;

import java.util.Scanner;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int eve=0;
		int odd=0;
		while(n>0) {
		int e=n%10;
		if(e%2==0) {
			eve+=e;
		}else {
			odd+=e;
		}
		n/=10;
		}
		System.out.println(eve);
		System.out.println(odd);
	}
	

}
