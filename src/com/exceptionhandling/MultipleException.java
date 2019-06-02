package com.exceptionhandling;

public class MultipleException {

	public static void main(String[] args) {
		System.out.println("Open file");
		int n=args.length;
		System.out.println(n);
		int a =45/n;//Arithematic Exception 
		System.out.println(a);
		int b[]={2,5,7};
		b[50]=100;//ArrayIndexOutOfBoundsException
		System.out.println("Closing files");
		

	}

}
