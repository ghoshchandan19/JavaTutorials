package com.exceptionhandling;

public class HandleArithematicException {

	public static void main(String[] args) {
		//Starting of try block
		try{
		System.out.println("Open file");
		int n=args.length;
		System.out.println(n);
	    int a =45/n;
		System.out.println(a);
		}catch(ArithmeticException ae)
		{
			//Printing the exception error message
			System.out.println(ae);
		}
		
		finally
		{
		System.out.println("Close file");
		}
		


	}

}
