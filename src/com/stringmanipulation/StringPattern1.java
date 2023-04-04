package com.stringmanipulation;

public class StringPattern1 {

	public static void main(String[] args) {
		String str = "INDIA";
	    /*INDIA 
	      01234
	      (01)
	      (02)
	      (03)
	      (04
	      05)
	      I
	      
	    */
	    for(int i=0; i<=str.length(); i++)
	    {
	        System.out.println(str.substring(0,i));
	    }

	}

}
/*
 * I 
 * IN
 * IND
 * INDI
 * INDIA
 */