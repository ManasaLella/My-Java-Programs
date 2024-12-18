 package com.jsp.arrays;

public class Binarysearch {

	public static void main(String[] args) {
		int []a= {1,2,4,5,7,9,13,20};
		int index= search(a,20);
		System.out.println(index);

	}
	public static int search(int[]a,int key) {
		int st=0;
		int end=a.length-1;
		while(st<=end) {
		int mid=(st+end)/2;
		if(key==a[mid]) return mid;
		else if(key<a[mid]) {
			end=mid-1;
		}
		else st=mid+1;
		}
		return -1;
	}

}
