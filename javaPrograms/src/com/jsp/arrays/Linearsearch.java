package com.jsp.arrays;

public class Linearsearch {

	public static void main(String[] args) {
		int[]a= {2,24,55,32,58,42,14};
		int key=58;
		System.out.println(search(a,key));
	}
	public static int search(int[]a,int key)
{
	for(int i=0;i<a.length;i++) {
		if(a[i]==key)return i;
	}
	return -1;
}
}

