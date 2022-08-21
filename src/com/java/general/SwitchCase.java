package com.java.general;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();

		switch (choice) {
		case "sunday":
			System.out.println("sunday");
			break;
		case "monday":
			System.out.println("monday");
			break;
		case "tuesday":
			System.out.println("tuesday");
			break;
		case "wednesday":
			System.out.println("wednesday");
			break;
		case "thursday":
			System.out.println("thursday");
			break;
		case "friday":
			System.out.println("friday");
			break;
		case "saturday":
			System.out.println("saturday");
			break;
		default:
			System.out.println("Choose a correct option..");
		}

	}

}
