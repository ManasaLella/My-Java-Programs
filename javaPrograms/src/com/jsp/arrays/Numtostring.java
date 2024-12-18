package com.jsp.arrays;

public class Numtostring {

	public static void main(String[] args) {
		int n=9142;
		pw((n/1000)%10,"thousand");
		pw((n/100)%10,"houdered");
		pw(n%100," ");

	}
	public static void pw(int n,String s) {
		String one[]= {""," one"," two","three","four","five","six","seven","eight",
				       "nine","ten","eleven","tweleve","thirteen","fourteen","fifteen",
				       "sixteen","seventeen","eighteen","ninteen"};
		String two[]= {"","twenty","thirty","fourty"," fifty","sixty","seventy",
				         "eighty","ninty"};
		if(n<=19)
			System.out.print(one[n]+"");
		else
			System.out.print(two[n/10]+one[n%10]+"");
		if(n!=0)
			System.out.print(s+"");
		}
		
		
	}


