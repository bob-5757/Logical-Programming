package com.java.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dummy {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("ddMMyyhhmmss");
		System.out.println(sf.format(date));

	}
}
