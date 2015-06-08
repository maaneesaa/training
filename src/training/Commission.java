package training;

import java.util.Scanner;

public class Commission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sales;
		System.out.println("Enter your sales:");
		sales = sc.nextInt();
		if (sales >= 1000)
			System.out.println("The commission is 10%.");
		else if (sales >= 7500)
			System.out.println("The commission is 20%.");
		else if (sales >= 5000)
			System.out.println("The commission is 20%.");
	}

}
