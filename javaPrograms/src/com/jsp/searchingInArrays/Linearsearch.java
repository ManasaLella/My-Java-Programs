package com.jsp.searchingInArrays;

public class Linearsearch {

	public static void main(String[] args) {
	int []a= {1,2,3,4,5,6,8};
	int key=4;
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
