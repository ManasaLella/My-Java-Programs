package com.jsp.numerprograms;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
	int n=23;
	int num=0;
		int sum=0;
		
	
		while(num>9) {
			
			while(num>0) {
			int rem=num%10;
			sum+=rem*rem;
			num/=10;
		}
			num=sum;
		
		}
		if(num == 1) System.out.println("happy number");
		else System.out.println("not");
	}

}
