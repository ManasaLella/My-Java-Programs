package com.jsp.strings;

public class CountingUcLcSpNu {

	public static void main(String[] args) {
		
		String s="Java Is @# 123";
		int uc=0;
		int lc=0;
		int nu=0;
		int sp=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
				uc++;
			else if(ch>='a'&& ch<='z')
				lc++;
			else if(ch>='0'&&ch<='9')
				nu++;
			else
				sp++;
				
		}
		System.out.println("uppercase" + uc);
		System.out.println("lowecase" + lc);
		System.out.println("number" + nu);
		System.out.println("special" + sp );

	}

}
