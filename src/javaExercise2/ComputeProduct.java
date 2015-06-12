package javaExercise2;
import java.util.Scanner;

public class ComputeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, product = 1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements of an array: ");
		n = sc.nextInt();
	
		int [] array = new int [n];
		System.out.println("Enter the elements of an array: ");
		for(int i = 0; i<n; i++){
			array[i] = sc.nextInt();
			product *=array[i];
		}
			System.out.println("The product is: " + product);
		
	}

}
