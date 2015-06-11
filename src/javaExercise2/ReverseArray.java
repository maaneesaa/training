package javaExercise2;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[5];					//assign the array with 5 elements
		Scanner sc = new Scanner(System.in);		

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the " + (i + 1) + " elements of the array: ");
			array[i] = sc.nextInt();				//assign the user element int the array
		}
		//to reverse the array
		System.out.print("Reverse array is: ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		

		// asign array with the elements
		// int [] numbers = new int[] {23,45,63,87,90};
		// for (int i = numbers.length - 1; i > 0; i--){
		// System.out.println(numbers[i]);
		// }

	}

}
