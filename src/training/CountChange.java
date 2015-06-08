package training;
import java.util.Scanner;

/*
 * This program counts changes: pennies, nickle, dimes and quaters.
 */

public class CountChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int pennies;
		int nickels;
		int dimes;
		int quaters;
		
		
		System.out.println("Enter the number of quaters:");
		quaters = sc.nextInt();
		System.out.println("Enter the number of dimes:");
		dimes = sc.nextInt();
		System.out.println("Enter the number of nickels:");
		nickels = sc.nextInt();
		System.out.println("Enter the number of pennies:");
		pennies = sc.nextInt();
		double dollars = 1*pennies + 5*nickels + 10*dimes + 25*quaters;
		
		System.out.println("The total change is : $" + dollars/100.00);
		
				
	}

}
