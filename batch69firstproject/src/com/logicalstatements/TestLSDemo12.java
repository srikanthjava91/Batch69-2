package com.logicalstatements;

public class TestLSDemo12 {
	
	 static String getDayType1(int day) {

	        return switch (day) {
	            case 1, 7 -> "Weekend";

	            case 2, 3, 4, 5, 6 -> {
	                System.out.println("Working day");
	                yield "Weekday";
	            }

	            default -> {
	                yield "Invalid day";
	            }
	        };
	    }

	static String getGrade(int marks) {

		return switch (marks / 10) {
		case 10, 9 -> "A+";
		case 8 -> "A";
		case 7 -> "B";
		case 6 -> "C";
		case 5 -> "D";
		default -> "Fail";
		};
	}

	static String getDayType(int day) {

		switch (day) {
		case 1:
		case 7:
			return "Weekend";

		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			return "Weekday";

		default:
			return "Invalid day";
		}
	}

	public static void main(String[] args) {
		System.out.println(getDayType(1)); // Weekend
		System.out.println(getDayType(3)); // Weekday
		System.out.println(getDayType(9)); // Invalid day

		System.out.println(getGrade(40));
		
		System.out.println(getDayType1(3));
	}
}
