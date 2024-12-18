package com.jsp.arrays;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
    int size=s.nextInt();
    int a[]=new int[size];
    for(int i=0;i<size; i++) {
    a[i]=s.nextInt();
    }
    for(int i=size-1;i>=0;i--) {
    	System.out.println(a[i]);
    }
	}

}
