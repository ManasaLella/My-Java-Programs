package com.jsp.arrays;

import java.util.Scanner;

public class Evenoddindexsum {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
	int size=s.nextInt();
	int sumeven=0;
	int sumodd=0;
	int a[]=new int[size];
	for(int i=0;i<size;i++) {
	a[i]=s.nextInt();
	if(i%2==0) {
		sumeven+=a[i];
	}
	else {
		sumodd+=a[i];
	}

}

		System.out.println(sumeven);
		System.out.println(sumodd);
}
}
