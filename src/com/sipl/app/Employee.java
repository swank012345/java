package com.sipl.app;
class Semployee
{
	int id;
	String name;
	float salary;
	void insert(int eid, String ename,float esalary)
	{
		id=eid;
		name=ename;
		salary=esalary;
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}
}
public class Employee 
{
	public static void main(String[] args) 
	{
		Semployee e1=new Semployee();
		Semployee e2=new Semployee();
		e1.insert(22,"mitra",54041);
		e2.insert(51, "milan", 44020);
		e1.display();
		e2.display();
	}

	

}
