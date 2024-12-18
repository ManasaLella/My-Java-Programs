package com.jsp.numerprograms;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter binary number");
		
		int bin=scn.nextInt();
		int sum=0;
		int i=1;
		while(bin>0) {
			sum+=(bin%10)*i;
			bin/=10;
			i*=2;
		}
System.out.println(sum);
	}

}
