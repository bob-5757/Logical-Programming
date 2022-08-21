package com.java.general;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args)
	{
		System.out.println("Enter your age");
		   String age = new Scanner(System.in).next();
		   int rage = Integer.parseInt(age);
		   
		   String result = rage>=17?"can vote":"can not vote";
		   System.out.println(result);
				   
		
	}
}

