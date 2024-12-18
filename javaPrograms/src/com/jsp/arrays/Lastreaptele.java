package com.jsp.arrays;

public class Lastreaptele {

	public static void main(String[] args) {
		int []a= {1,2,4,3,2,5,4,1,2};
		int key=4;
		System.out.println(search(a,key));
	}
	public static int search(int []a,int key) {
		for (int i=a.length-1;i>=0;i--) {
			if(a[i]==key) 
				return i;
		}
		return -1;
	
	}
}
