package com.jsp.arrays;

import java.util.Scanner;

public class Alloccurence {

	public static void main(String[] args) {
		int[]a= {1,2,3,2,1};
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) count++;
			}
			System.out.println(count+"times"+a[i]+"repeated");
		}
	}

}
