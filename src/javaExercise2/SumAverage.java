package javaExercise2;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of element you want in array: ");
		n = sc.nextInt();

		// assign the array
		int[] array = new int[n];
		System.out.println("Enter the elements of an array:");

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			sum = sum + array[i];
		}
		System.out.println("The sum is : " + sum);

		System.out.print("The average is: " + (sum / n));
	}

}
