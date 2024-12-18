package com.jsp.twodarrays;

public class Foreach {

	public static void main(String[] args) {
	int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
	for(int[]n:a) {
		for(int n1:n) {
			System.out.print(n1+"\t");
		}
		System.out.println();
	}

	}

}
