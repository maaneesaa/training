package training;

import java.util.Scanner;

	public class GalToLit {
	public static void main(String[] args) {
		GalToLit.InchesToMeters();
		GalToLit.MetersToKilometers();

		/*
		 * double gallons; double liters; gallons = 10; liters = gallons *
		 * 3.7854; System.out.println(gallons + " " + "gallons is" + " " +
		 * liters + " " + "liters");
		 * 
		 * GalToLit.degtofar(3);
		 * 
		 * }
		 * 
		 * public static void degtofar(double degree) { double fahrenheit;
		 * fahrenheit = degree * 33.8; System.out.println(degree + " " +
		 * "degree is" + " " + fahrenheit + " " + "fahrenheit");
		 */

	}

	public static void InchesToMeters() {
		double inch;
		double meter;
		int counter;
		
		counter = 0;
		for (inch = 1; inch <= 144; inch++) {
			meter = inch * 39.37;
			System.out.println(inch+ " inch is " + meter + " meter.");

			counter++;
			if (counter == 12) {
				System.out.println();
				counter = 0;

			}
		}
	}
	
	public static void MetersToKilometers() {
		Scanner sc = new Scanner(System.in);
		double meters;
		System.out.println("Enter the meters:");
		meters= sc.nextDouble();
		double kilometers = meters* 0.001;
		System.out.println(meters + " meters is equal to " + kilometers + " kilometers.");
		double 	inches = meters* 39.37;
		System.out.println(meters + " meters is equal to " + inches + " inches.");
		double 	feet = meters* 3.281;
		System.out.println(meters + " meters is equal to " + feet + " feet.");
	}
}
