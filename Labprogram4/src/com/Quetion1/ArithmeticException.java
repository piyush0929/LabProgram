package com.Quetion1;
import java.util.Scanner;
public class ArithmeticException {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);	

	//taking the user input
	System.out.println("Enter the first number:");		
	a=s.nextInt();

	//taking the user input
			b=s.nextInt();
	System.out.println("Enter the second number:");				
	if(a==0 && b==0) 
	{
		throw new Exception("enter the two numbers:");			//throwing exception because the 0 number entered
	}
	else
	{
	try
	{
	c=a/b;									//performing the divide operation and throw the exception
	System.out.println("result is "+c);				//printing the result
	}
	catch(ArithmeticException e)				//catch the divide by zero exception thrown by the try block
	{
		System.out.println("performing divide by zero");
	}
		} 		  
			
	}
}
