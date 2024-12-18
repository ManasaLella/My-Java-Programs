package com.jsp.numerprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number");
		
		int n=scn.nextInt();
		
		int res=1;
		for(int i=1;i<=n;i++) {
			res*=i;
		}

		System.out.println(res);
	}

}
