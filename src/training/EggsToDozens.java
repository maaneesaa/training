package training;

import java.util.Scanner;

public class EggsToDozens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eggs;
		
		
		System.out.println("Enter the number of eggs: ");
		eggs = sc.nextInt();
		double dozens = eggs/12;
		//System.out.println("The number of eggs you have entered is equivalent to: " + dozens);
		int extras = eggs%12;
		System.out.println("The number of eggs you have entered is equivalent to: " + dozens + " dozens and " + extras + " eggs" );
		
				
		
				
		
	}
}
