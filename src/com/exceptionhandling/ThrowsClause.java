package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsClause {
	
	public static void main(String[] args) throws IOException {
		ThrowsClause t=new ThrowsClause();
		t.accept();
		t.display();
	
	}
	private String name;
	void accept() throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name:");
		name=br.readLine();//Will throw IOException at compile time
		}
	void display()
	{
		System.out.println("Name:  "+name);
	}
	
	
	
	
	
}

