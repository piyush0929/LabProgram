package com.question3;

import javax.naming.InvalidNameException;
import java.util.Scanner;


public class  UserDefinedExceptionToCheckName {

	    void validateName(String name) throws InvalidNameException { 
		String[] names = { "Jaydeep", "Piyush", "Dyandev", "Mahadev"};          //passing array name
        boolean found= false;
       
        for (String n: names)
        {
            if (n.equalsIgnoreCase(name))                                  //ignores whether the letter is lowercase or uppercase
            {
                found = true;
                break;
            }
        }
        
        if (found)
        {
            System.out.println("Valid Name");                              //if name found same 
        } 
        else 
        {
            throw new InvalidNameException("Try Again!!!!!");              //if name not found 
        }
    }
	
	
	    public static void main(String[] args) {

		    UserDefinedExceptionToCheckName dn=new UserDefinedExceptionToCheckName(); //creating the objects
	        Scanner sc=new Scanner(System.in);

	        System.out.println("Enter Name:");                                 //taking user input
	        String name = sc.next();
	        try
	        {
	            dn.validateName(name);                                         //throwing exception
	        }
	        catch(InvalidNameException e)                                      //throwing exception
	        {

	            System.out.println("Invalid Name " +e);
	        }
	  
	    }


}