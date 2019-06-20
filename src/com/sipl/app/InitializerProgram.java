package com.sipl.app;
class vehicle
{
	int speed;
	vehicle(int speed)
	{
		this.speed=speed;
		System.out.println("Super class constructor");
		System.out.println(speed);
		{
			System.out.println("hii");
		}
	}
}


class Bike extends vehicle
{
	String bn;;
    Bike(String bn)
    {
    	super(100);
    	this.bn=bn;
    	System.out.println("Sub class constructor");
    }
    {
    	System.out.println("Hello Viswamitra");
    }
      
}

public class InitializerProgram 
{
	 public static void main(String[] args) 
     {
  	   Bike b1=new Bike("jj");
		
	}

}
