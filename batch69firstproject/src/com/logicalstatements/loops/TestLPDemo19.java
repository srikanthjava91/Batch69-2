package com.logicalstatements.loops;

//WAP for break and continue 
public class TestLPDemo19 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("******************");
		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				continue;
			}
			System.out.println(i);

		}

	}

}
