package com.sipl.app;

class Employees1
{
	private int id;
	private String name;

	Employees1(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + "]";
	}
}
public class Encapsulation {

	public static void main(String[] args) 
	{
		Employees1 e1 = new Employees1(11,"Akhil");
		System.out.println(e1);  
		

	}

}
