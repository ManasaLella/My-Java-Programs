package com.jsp.upcastingpack;
class Car
{
	void start() {}
	void acceleration() {}
	void stop() {}
}
class alto extends Car
{
	void start()
	{
		System.out.println("key start");
	}
	void acceleration()
	{
		System.out.println("half cluch drive");
	}
	void stop()
	{
		System.out.println("key stop");
	}
}
class audi extends Car
{
void start()
{
	System.out.println("button start");
}
void acceleration()
{
	System.out.println("full clutch");
}
void stop()
{
	System.out.println("button stop");
}
}
class benz extends Car
{
	void start()
	{
		System.out.println("touch starts");
	}
	void acceleration()
	{
		System.out.println("automatic drive");
	}
	void stop()
	{
		System.out.println("touch stop");
	}
}
class Driver
{
	public void drive(Car car)
	{
		car.start();
		car.acceleration();
		car.stop();
	}
	
}
public class Cardevelopment {

	public static void main(String[] args) {
	Driver driver=new Driver();
	driver.drive(new alto());
	

	}

}
