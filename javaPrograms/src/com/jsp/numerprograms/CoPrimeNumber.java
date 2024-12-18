package com.jsp.numerprograms;

import java.util.Scanner;
/*  */
public class CoPrimeNumber {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter numbers");
		
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		
		int count=0;
		int small=n1<n2?n1:n2;
		for(int i=1;i<=small;i++) {
			if(n1%i==0 && n2%i==0) count++;
		}
		if(count>1) System.out.println("not a coprime");
		else System.out.println("coprime");
	}

}
