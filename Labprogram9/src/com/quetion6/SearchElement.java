package com.quetion6;

import java.util.*;

public class SearchElement {

	public static void main(String[] args) {
		int count, num, i;
        int[] inputArray = new int[200];
   
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter number of elements");
        count = sc.nextInt();
        System.out.println("Enter " + count + " elements");
        for(i = 0; i < count; i++) {
            inputArray[i] = sc.nextInt();
        }
 
        System.out.println("Enter element to search");
        num = sc.nextInt();
        
        for (i = 0; i < count ; i++) {
            if(num == inputArray[i]){
               System.out.println(num+" is present at index "+i);
               break;
            }
        }
   
        if(i == count)
           System.out.println(num + " not present in array");
    }
}
