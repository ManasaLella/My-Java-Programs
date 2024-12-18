package com.jsp.numerprograms;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		
		int n=scn.nextInt();
		while(n>0) {
		int bin=n%2;
		System.out.print(bin);
		n/=2;
		}

	}

}
