package com.jsp.arrays;

public class MisingEleInSeries {
	
	public static int findMissingEle(int []a) {
		int n= a.length+1;
		int sum1=n*(n+1)/2;
		int sum=0;
		for(int num: a) {
			sum+=num;
		}
		
		return sum1-sum;
		
	}

	public static void main(String[] args) {
		int[]a= {1,2,4,5,6};
		
		System.out.println(findMissingEle(a));
		

	}

}
