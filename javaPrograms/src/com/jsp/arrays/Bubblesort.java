package com.jsp.arrays;
import java.util.Arrays;
public class Bubblesort {

	public static void main(String[] args) {
		int []a= {3,1,5,4,8,2};
       sort(a);
       System.out.println(Arrays.toString(a));
	}
	public static void sort(int[]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
				int temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
				}
			}
		}
	}

}
