package com.tns.assignment;

import java.util.Scanner;

public class Assignment_multipleof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int g=sc.nextInt();
			if((g%3)==0) {
				System.out.println("The number you have entered is multiple of three");
				
			}
			else {
				System.out.println("The number you have entered is not a multiple of three");
				
			}

		}
	}


