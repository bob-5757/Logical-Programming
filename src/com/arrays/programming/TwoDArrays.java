package com.arrays.programming;

public class TwoDArrays {

	public static void main(String[] args) {

		int numbers[][] = { { 1, 2, 3, 4 }, 
				            { 5, 8 }, 
				             { 9, 10, 11, 12 }
				            
		                  };
		
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers[i].length;j++)
			{
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
