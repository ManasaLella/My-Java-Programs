package com.jsp.arrays;
import java.util.Scanner;
public class Evenindexvalue {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
	int size=s.nextInt();
	int a[]=new int[size];
	for(int i=0;i<size;i++) {
	a[i]=s.nextInt();
}
	for(int i=0;i<size;i++) {
		if(i%2==0) {
			System.out.println(a[i]);
		}
	}
	}
}
