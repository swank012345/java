package com.sipl.app;
class person
{
	int age;
	String name;
	person(int age, String name)
	{
		this.age=age;
		this.name=name;
		
	}
}
class Employee2 extends person
{
	float salary;

	Employee2(int age,String name,float salary)
	{
		super(age,name);
		this.salary=salary;
	}
      void display()
      {
    	  System.out.println(age +" "+name+" " +salary+" ");
      }
		
	
}
public class Employee1
{
      public static void main(String[] args)
      {
		Employee2 e2 = new Employee2(23,"mitra", 645200);
		e2.display();
	}
}

