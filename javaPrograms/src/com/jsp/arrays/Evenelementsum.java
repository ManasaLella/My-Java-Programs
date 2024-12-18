package com.jsp.arrays;

import java.util.Scanner;

public class Evenelementsum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		int sum=0;
		for(int i=0;i<size;i++) {
		a[i]=s.nextInt();
		int n=a[i];
		if(n%2==0) {
		sum+=n;
	}
		}
		System.out.println(sum);
		
	}
}

