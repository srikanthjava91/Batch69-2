package com.arrays;

//WAP to find TotalMarks and avg of a Student, based on Given marks.
public class TestArrDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		int[] marks = { 65, 71, 42, 63, 59, 69 };
		double totalMarks = 0;
		double avg = 0;

		for (int i = 0; i < marks.length; i++) {
			totalMarks = marks[i] + totalMarks;// 65+ 71= 136 + 42= 178+ 63= 241+ 59 = 300+72 =372
		}

		avg = totalMarks / marks.length;

		System.out.println("Total Marks of the Student : " + totalMarks);
		System.out.println("AVg marks : " + avg);

//		int[] numbers = { 10, 20 };
//		System.out.println(numbers);
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);

	}

}
