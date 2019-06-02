package com.exceptionhandling;

public class ThrowClause {

	static void book()
	{
		try{
			System.out.println("Inside book()");
			throw new NullPointerException("Exception data");
			
		}catch(NullPointerException ne)
		{
			System.out.println(ne);
		}
	}
	
	public static void main(String[] args) {
		ThrowClause.book();
	}
		
	}


