package com.jsp.arrays;

import java.util.Scanner;

public class Storeeveninarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		int a[]=new int[n];
		int j=0;
		for(int i=1;i<n;i++) {
		int n1=s.nextInt();
	if(n1%2==0) {
		a[j]=n1;
		j++;
	}
	}
for(int k:a) {
	System.out.println(k);
}
	}

}
