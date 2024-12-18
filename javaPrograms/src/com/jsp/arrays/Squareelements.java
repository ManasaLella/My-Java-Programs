package com.jsp.arrays;

public class Squareelements {

	public static void main(String[] args) {
		int []a= {2,1,2,3,4,7};
for(int i=0;i<a.length;i++) {
	int n=a[i];
	a[i]=n*n;
}
for(int i=0;i<a.length;i++) {
System.out.println(a[i]);
	}
	}
}
