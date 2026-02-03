package com.logicalstatements.loops;

public class TestLPDemo12 {

	public static void main(String[] args) throws InterruptedException {

//		while (10 > 5) {
//			System.out.println("Hello");
//			Thread.sleep(1000);
//		}

		int a = 10;
		while (a > 5) {
			System.out.println("Hi");
			Thread.sleep(1000);
			a--;
		}
	}
}
