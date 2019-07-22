package com.sipl.app;
class Company1
{
    void cmp()
    {
    	System.out.println("In company employees are there");
    }
}
class employee extends Company1
{
	void emp()
	{
		System.out.println(" dev and testing  teams are there");
	}
	
	
}
class developer extends employee
{
	void dev()
	{
		System.out.println("developer develops an application");
	}
	
}
public class Multilevel 
{
	public static void main(String[] args) 
	{
		developer d1 = new developer();
		d1.cmp();
		d1.emp();
		d1.dev();
	}

}
