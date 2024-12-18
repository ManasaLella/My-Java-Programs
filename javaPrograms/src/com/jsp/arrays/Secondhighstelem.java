package com.jsp.arrays;

public class Secondhighstelem {

	public static void main(String[] args) {
		int []a= {4,10,30,20,10,30};
		int max1=0;
		int max2=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2 && a[i]!=max1) {
				max2=a[i];
			}
		}
		System.out.println(max2);
	}
	

}
