package javaExercise2;

import java.util.Scanner;

public class KeyPressed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int keyPress;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key: ");
		keyPress = sc.nextInt();

		if (keyPress < 9) {
			switch (keyPress) {

			case 0: {
				System.out.println("Pressed number is 0.");
				break;
			}
			case 1: {
				System.out.println("Pressed number is 1.");
				break;
			}
			case 2: {
				System.out.println("Pressed number is 2.");
				break;
			}
			case 3: {
				System.out.println("Pressed number is 3.");
				break;
			}
			case 4: {
				System.out.println("Pressed number is 4.");
				break;
			}
			case 5: {
				System.out.println("Pressed number is 5.");
				break;
			}
			case 6: {
				System.out.println("Pressed number is 6.");
				break;
			}
			case 7: {
				System.out.println("Pressed number is 7.");
				break;
			}
			case 8: {
				System.out.println("Pressed number is 8.");
				break;
			}
			case 9: {
				System.out.println("Pressed number is 9.");
				break;
			}
			}

		} else {

			System.out.println("Not Allowed");

		}
	}
}
