package com.exceptionhandling;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) {
		
	          Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user
	 
	          System.out.println("Enter Your Age");
	 
	          int age = sc.nextInt();         //Taking input from user
	 
	          try
	          {
	              if(age < 0)
	              {
	            	  sc.close();
	                  throw new ArithmeticException("Age can not be negative");  
	                  //throws AgeIsNegativeException if age is negative
	                  
	              }
	              
	          }
	          catch(ArithmeticException ex)
	          {
	              System.out.println(ex);    //Output : Age can not be negative
	          }
	          
	    }
	}


