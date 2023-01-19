package com.quetion3;

public class reversearray {

	public static void main(String[] args) 
	{
		 int [] arr = new int [] {6, 7, 8, 9, 10};  
	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	        //Loop through the array in reverse order  
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");  
	        }  
	 }  
}


