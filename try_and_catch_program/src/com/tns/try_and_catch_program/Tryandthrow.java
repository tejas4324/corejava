package com.tns.try_and_catch_program;

import java.util.Scanner;

public class Tryandthrow {
	static void validate()throws Invaliageexception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your  age please!!");
		int age =sc.nextInt();
		if(age<18) {
		throw new Invaliageexception("invalid age  you are not eligeble vote");	
			
		}
		else {
			System.out.println("you are eligeble to vote ");
		}
		}
	

	public static void main(String[] args) {
		try {
			validate();
		}catch(Exception e) {
			System.out.println("caught an Exception\n"+e);
		}

	}
}
