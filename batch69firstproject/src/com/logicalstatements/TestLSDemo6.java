package com.logicalstatements;

import java.util.Scanner;

//WAP to find the Cricketer based on Jersey number ..? 
public class TestLSDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Jersey number to get the Crickter info : ");

		int jno = sc.nextInt();
		switch (jno) {
		case 7:
			System.out.println("MSD");
			System.out.println("Thala for a Reason ");
			break;
		case 18:
			System.out.println("Virat");
			System.out.println("The most consistent player and we can call him King Kohli !!");
			break;
		case 45:
			System.out.println("Rohit Sharma");
			System.out.println("Good captain and we can call him as Hitman");
			break;
		case 1:
			System.out.println("Rahul");
			System.out.println("Cool Batsman with Good Wicket Keeping !! ");
			break;
		case 4:
			System.out.println("Abhishek");
			System.out.println("We can call it as Katterma Koduku");
			break;

		default:
			System.out.println("Unknown player  ");

		}

	}
}
