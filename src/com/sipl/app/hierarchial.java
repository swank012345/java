package com.sipl.app;
class Employees
{
    void emp()
    { 
    	System.out.println("employee works.............");
    }
}
class Developer extends Employees
{
	void dev()
	{
		System.out.println("develops an application");
	}
}
class Tester extends Employees
{
  void test()
  {
	  System.out.println("Tests an application");
  }
}
public class hierarchial 
{
	public static void main(String[] args) 
	{
		Tester e1 = new Tester();
		e1.test();
		
		System.out.println("develop");
		System.out.println("test");
		System.out.println("");
	}

}
