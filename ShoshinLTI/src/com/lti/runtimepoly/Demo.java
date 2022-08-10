package com.lti.runtimepoly;

interface Vehicle
{
	public void Start();
	public void Stop();
}

class Car implements Vehicle
{

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("Car started");
	}

	@Override
	public void Stop() {
		// TODO Auto-generated method stub
		System.out.println("Car stopped");
	}
	
	public void drive()
	{
		System.out.println("Car Driving");
	}
	
}

class Bike implements Vehicle
{

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("Bike started");
	}

	@Override
	public void Stop() {
		// TODO Auto-generated method stub
		System.out.println("Bike stopped");
	}
	
	public void ride()
	{
		System.out.println("Bike ridden");
	}
}

public class Demo 
{
	public static void main(String []args)
	{
		Vehicle v1;
		v1 = new Car();
		v1 = new Bike();
		
		v1.Start();
		v1.Stop();
		//v1.ride();
		
	}
}
