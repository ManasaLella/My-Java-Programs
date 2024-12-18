package com.jsp.numerprograms;

import java.util.Scanner;

public class FibnociNumberForLimit {

	public static void main(String[] args) {
		
		 Scanner scn=new Scanner(System.in);
		 
		 System.out.println("enter number");
		 
		 int n=scn.nextInt();
		 
		 int a=0,b=1,c;
		 while(a<=n) {
			 System.out.println(a);
			 c=a+b;
			 a=b;
			 b=c;
		 }
		 
		 

	}

}
