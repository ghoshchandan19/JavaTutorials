package com.exceptionhandling;

public class HandleMultipleException {

	public static void main(String[] args) {
		try
		{
		System.out.println("Open file");
		int n=args.length;
		System.out.println(n);
		int a =45/10;//Arithematic Exception 
		System.out.println(a);
		int b[]={2,5,7};
		b[50]=100;//ArrayIndexOutOfBoundsException
	}
		
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
		}
		finally
		{
			System.out.println("Close files");
		}

}
}
