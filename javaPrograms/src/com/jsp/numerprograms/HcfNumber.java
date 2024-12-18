package com.jsp.numerprograms;

import java.util.Scanner;

public class HcfNumber {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter numbers");
		
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int hcf=0;
		int n=n1<n2?n1:n2;
		for(int i=1;i<=n1;i++) {
			if(n1%i==0 && n2%i==0) {
				hcf=i;
			}
		}
		System.out.println(hcf);

		
	}

}
