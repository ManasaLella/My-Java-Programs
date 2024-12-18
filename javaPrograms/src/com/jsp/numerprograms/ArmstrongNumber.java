package com.jsp.numerprograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int n=scn.nextInt();
		int num=n;
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		n=num;
		int sum=0;
		while(n>0) {
		int d=n%10;
		int proud=1;
		
		for(int i=1;i<=count;i++) {
			proud*=d;
		}
		sum+=proud;
		n/=10;
}
		if(num==sum) {
			System.out.println("is a armstrong number");
		}else {
			System.out.println("not a armstrong number");
		}
	}
}
