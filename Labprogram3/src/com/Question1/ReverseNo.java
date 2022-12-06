package com.Question1;
import java.util.Scanner;

class ReverseNo 
{
		public class reverse()
		{
			System.out.println("Enter the number to reverse: ");
			 Scanner sc = new Scanner(System.in);			
			int number=sc.nextInt();		
					
			int reverse=0;
			
			while(number!=0)
			{
				int remainder=number%10;				
				reverse=reverse*10+remainder;
				number=number/10;
			}
			System.out.println("The reverse of the given no is: "+reverse);		
			
			
		}
	}

	class Sum extends ReversNo			 
	{
		public void sumdigit()			
		{
			System.out.println("Enter the number to find sum: ");
			Scanner sc=new Scanner(System.in);			
			int number=sc.nextInt();
			
			int sum=0,digit;
			
			while(number>0)		
			{
				digit=number%10;					
				sum=sum+digit;
				number=number/10;
				
			}
			System.out.println("Sum of digit is: "+sum);
		}
	}

	public class inheritance extends Sum{

		public static void main(String[] args) {
			
			Sum s=new Sum();				
			
			s.sumdigit();					
			s.reverse();					
			

		}

	}
