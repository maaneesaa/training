package training;

import java.util.Scanner;

/*
 * This program will check if the user entered mark is pass or fail.
 */
public class PassFail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double marks;
		System.out.println("Enter your marks: ");
		 marks = sc.nextDouble();
		if (marks >= 50)
		System.out.println("You have passed.");
		else
		System.out.println("Sorry, you have failed.");
		

	}

}
