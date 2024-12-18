package com.jsp.arrays;

public class Maxelement {

	public static void main(String[] args) {
	int []a= {1,3,4,5,10,6,8};
	int max=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
		System.out.println(max);

	}

}
