package training;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter your number:");
		number = sc.nextInt();
		if (number % 2 == 0)
			System.out.println("The number you have entered is even.");
		else
			System.out.println("The number you have entered is odd.");
	}

}
