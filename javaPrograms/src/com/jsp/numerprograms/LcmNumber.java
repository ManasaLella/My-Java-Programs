package com.jsp.numerprograms;

import java.util.Scanner;

public class LcmNumber {

	public static void main(String[] args) {
		

		Scanner scn=new Scanner(System.in);
		System.out.println("enter numbers");
		
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		 int n=n1>n2?n1:n2;
		 while(true) {
			 if(n%n1==0 && n%n2==0) break;
			 n++;
		 }
		 System.out.println(n);

	}

}
