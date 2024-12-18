package com.jsp.arrays;

import java.util.Scanner;

public class Sumofelements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		int sum=0;
		for(int i=0;i<size;i++) {
		a[i]=s.nextInt();
		sum=sum+a[i];
	}
System.out.println(sum);
			}
		}

