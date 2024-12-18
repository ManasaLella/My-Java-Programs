package com.jsp.arrays;

public class Minelement {

	public static void main(String[] args) {
	int []a= {4,1,3,7,0,1,2};
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
System.out.println(min);
	}

}
