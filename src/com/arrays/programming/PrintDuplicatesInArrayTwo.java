package com.arrays.programming;

public class PrintDuplicatesInArrayTwo {

	public static void main(String[] args) {
		int a[] = { 3, 0, 8, 7, 5, 2,3,3};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicate found "+a[j]);
					
				}
			}
		}

	}

}
