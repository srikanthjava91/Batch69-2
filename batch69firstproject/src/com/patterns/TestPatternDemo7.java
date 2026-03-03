package com.patterns;

public class TestPatternDemo7 {

	public static void main(String[] args) {
		int star = 0;
		int space = 8;

		for (int i = 1; i <= 9; i++) {

			// left stars
			for (int a = 0; a <= star; a++) {
				System.out.print("*");
			}

			// spaces
			for (int b = 0; b <= space; b++) {
				System.out.print(" ");
			}

			// right stars
			for (int c = 0; c <= star; c++) {
				System.out.print("*");
			}

			System.out.println();

			if (i < 5) {
				star++;
				space -= 2;
			} else {
				star--;
				space += 2;
			}

		}

	}

}
