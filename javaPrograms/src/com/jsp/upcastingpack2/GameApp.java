package com.jsp.upcastingpack2;
import java.util.Scanner;
class Car
{
	void start() {}
	void accelerate() {}
	void stop() {}
		
	}
class Alto extends Car
{
	void start()
	{
		System.out.println("key starts");
	}
	void accelerate()
	{
		System.out.println("half cluch drive");
	}
	void stop()
	{
		System.out.println("key stop");
	}
}
class Audi extends Car
{
	void start()
	{
		System.out.println("button starts");
	}
	void accelerate()
	{
		System.out.println("full cluch drive");
	}
	void stop()
	{
		System.out.println("button stop");
	}
}
class Benz extends Car
{
	void start()
	{
		System.out.println("touch starts");
	}
	void accelerate()
	{
		System.out.println("automatic drive");
	}
	void stop()
	{
		System.out.println("touch stop");
	}
}
class Carselector
{
	public Car getcar()
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("select car:");
	System.out.println("1.Alto\n"
		+"2.Audi\n"
		+"3.Benz");
	String carselect =scn.next();
	switch(carselect)
	{
	case "Alto":return new Alto();
	case "Audi":return new Audi();
	case "Benz":return new Benz();
	}
	return null;
	}
}
public class GameApp {

	public static void main(String[] args) {
	Carselector carselect=new Carselector();
	Car car=carselect.getcar();
	if(car==null)
	{
		System.out.println("car not available");
		return;
	}
	car.start();
	car.accelerate();
	car.stop();
	

	}

}

