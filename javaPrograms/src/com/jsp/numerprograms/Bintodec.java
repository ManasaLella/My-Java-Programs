package com.jsp.numerprograms;

import java.util.Scanner;

public class Bintodec {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter binary number");
		
		int n=scn.nextInt();
		int sum=0;
		int count=-1;
		while(n>0) {
			count++;
			double pow=Math.pow(2, count);
			sum+=(n%10)*pow;
			n/=10;
		}

		System.out.println(sum);
	}

}
