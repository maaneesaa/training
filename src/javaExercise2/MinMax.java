package javaExercise2;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, max = 0, min = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements of an array: ");
		n = sc.nextInt();
		
		int [] array = new int [n];
		System.out.println("Enter the elements of an array: ");
		
		
		for(int i = 0; i<n; i++){
			array[i] = sc.nextInt();
			
			if(i == 0){
				min = max = array[0];
			}
			
			if(array[i] < min)
				min = array[i];
			if(array[i] > max)
				max = array[i];
		}
			System.out.println("The smallest and largest numbers are: " + min + " "+ max );
		
	}

}
