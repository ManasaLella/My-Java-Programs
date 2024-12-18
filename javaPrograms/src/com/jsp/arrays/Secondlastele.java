package com.jsp.arrays;
import java.util.Arrays;
public class Secondlastele {

	public static void main(String[] args) {
		int[]a= {22,31,42,56,43,32,40};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-2)
			System.out.println(a[i]);
		}

	}

}
