package com.jsp.numerprograms;

import java.util.Scanner;

public class Pallindram {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		
		int n=scn.nextInt();
		int m=0;
		while(n>0) {
			m=(m*10)+(n%10);
			n/=10;
		}
		System.out.println(m);
if(n==m) System.out.println("pallindram");

else System.out.println("not");

	
	}
}
