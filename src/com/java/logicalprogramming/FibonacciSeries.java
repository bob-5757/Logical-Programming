package com.java.logicalprogramming;

public class FibonacciSeries {

	public static void main(String[] args) {

		// 0 1 1 2 3 5 8
		// a b 
		int a = 0, b= 1,c;
		System.out.print(a+" "+b);
		for(int i =1; i<=5; i++)
		{
			c = a+b;
			System.out.print(c);
			a = b;
			b = c;
			
		}
	}

}
