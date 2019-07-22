package com.sipl.app;

import java.util.Scanner;

public class EvenOrOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println(a+"is a Even  Number");
		}
		else 
		{
			System.out.println(a+ " is Not a even number ");
		}
		
		
	}

}
