package training;

public class ForLoopExample {

	public static void main(String[] args) {
		/*
		 * for (int i = 0; i < 10; i++) { for (int j = i; j < 10; j++) {
		 * 
		 * System.out.println("count is " + j); } }
		 */
		ForLoopExample.multiplesOf5();
		ForLoopExample.multiplesOf5s();
		
	}

	// for loop for 1-100 print multiples of 5

	public static void multiplesOf5() {
		for (int i = 5; i <= 100; i++) {
			// find i is a multiple of 5
			System.out.println(i);
			i = i + 4;

		}
	}

	public static void multiplesOf5s() {
		for (int i = 5; i <= 100; i++) {
			int remainder = i % 5;
			if (remainder == 0) {
				System.out.println(i);

			}
		}
		
		
			
		}

	}

