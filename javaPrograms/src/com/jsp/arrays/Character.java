
package com.jsp.arrays;
import java.util.Scanner;
public class Character {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
     System.out.println("enter a size");
     int size=s.nextInt();
    char a[]=new char[size];
    for(int i=0;i<size;i++) {
    	
   a[i]=s.next().charAt(0);
	}
    for(int i=size-1;i>=0;i--) { 
    	System.out.println(a[i]);
    }
	}

}
