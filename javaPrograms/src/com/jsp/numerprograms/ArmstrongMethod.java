package com.jsp.numerprograms;

public class ArmstrongMethod {

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));

	}
	public static boolean isArmstrong(int number) {
		int orinumber=number;
		int sum=0;
		int numofDigits=String.valueOf(number).length();
		
		while(number !=0) {
			int digit=number%10;
			sum+=Math.pow(digit, numofDigits);
			number/=10;
		}
		return sum==orinumber;
	}

}
