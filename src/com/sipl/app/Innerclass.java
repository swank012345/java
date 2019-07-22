package com.sipl.app;
class OuterClass
{
	 static void show()
	{
		System.out.println("Shows");
	}
	 void move()
	 {
		 System.out.println("Hiiiiiii   ");
	 }
}
public class Innerclass 
{
	public static void main(String[] args)
	{
		System.out.println("main starts....");
		OuterClass.show();
		System.out.println("");
		
		

		
	}

}
