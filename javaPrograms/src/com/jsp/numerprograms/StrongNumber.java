package com.jsp.numerprograms;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		
		int n=scn.nextInt();
		
		int num=n;
		int sum=0;
		while(n>0) {
			n=num;
			int d=n%10;
			int prod=1;
			for(int i=1;i<=d;i++) {
				prod*=i;
			}
			sum+=prod;
			n/=10;
			
		}
		if(num==sum) {
			System.out.println(num + "is a strong number");
		}else {
			System.out.println(num + "not a strong number");
		}
		

	}

}
