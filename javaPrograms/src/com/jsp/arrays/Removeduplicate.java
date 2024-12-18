package com.jsp.arrays;

public class Removeduplicate {

	public static void main(String[] args) {
		int[]a= {1,3,4,2,4,1,6,5};
		int n=remove(a);
		for(int i=0;i<=n;i++) {
			System.out.println(a[i]);
		}
		

	}
	public static int remove(int[]a) {
		int n=a.length-1;
		int newsize=n;
		for(int i=0;i<newsize;i++) {
			for(int j=i+1;j<newsize;j++) {
				if(a[i]==a[j])
				{
					for(int k=j;k<newsize;k++) {
						a[k]=a[k+1];
					}
					newsize--;
	
				}
			}
		}
		return newsize;
		
	}

}
