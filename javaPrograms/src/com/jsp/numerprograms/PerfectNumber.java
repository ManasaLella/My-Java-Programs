package com.jsp.numerprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int sum=0;
		System.out.println("enter a number");
		
		int n=scn.nextInt();
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) sum+=i;
		}
		if(sum==n) {
			System.out.println(n+"is a perfect number");
		}else {
			System.out.println(n+"not a perfect number");
		}

	}

}
