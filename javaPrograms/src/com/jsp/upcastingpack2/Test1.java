package com.jsp.upcastingpack2;
class A
{
	int i;
	A()
	{
		i=10;
	}
	void show()
	{
		System.out.println(i);
		}
}
public class Test1 {
	public static void main(String[]args)
	{
		A a1=new A();
		a1.show();
		A a2=new A();
		a2.show();
		
	}

}
