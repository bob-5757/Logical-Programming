package com.stringmanipulation;

public class StringPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "INDIA";
		    /*INDIA 
		      01234
		      (05)
		      (04)
		      (03)
		      (02
		      01)
		      INDIA
		      INDI
		      IND
		      IN
		      I
		    */
		    for(int i=str.length(); i>=i; i--)
		    {
		        System.out.println(str.substring(0,i));
		    }
	}

}
