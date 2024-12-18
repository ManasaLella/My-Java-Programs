package com.jsp.arrays;

public class Minoccele {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,5,6,4,1,6,6};
		int min=a.length;
		int ele=0;
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]= ' ';
					count++;
				}
			}
			if(a[i]!=' ') 
				System.out.println(a[i]+"="+count);
			if(count<min && a[i]!=' ') {
				min=count;
				ele=a[i];
			}
			System.out.println(ele+"="+min);
		}
	}

}
