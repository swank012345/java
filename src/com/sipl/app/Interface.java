package com.sipl.app;
 interface demo
{
	void run();
	void eat();
	void sleep();
}
class sample1 implements demo

{

	public void eat()
	{
		System.out.println("Eating");
	}
	public void run()
	{
		System.out.println("Running");
	}
	public void sleep()
	{
		System.out.println("Sleeping");
	}
}
public class Interface
{
	public static void main(String[] args) 
	{
		sample1 s1=new sample1();
		System.out.println("Interface");
		s1.eat();
		s1.run();
		s1.sleep();
		
		
	}

}
