//Program to show Arithemetic exception
package com.exceptionhandling;

public class ArithematicException {

	public static void main(String[] args) {
		System.out.println("Open file");
		int n=args.length;
		System.out.println(n);
		int a =45/n;
		System.out.println(a);
		System.out.println("Close file");

	}

}
