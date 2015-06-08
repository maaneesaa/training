package javaExercise2;

import java.util.Scanner;

public class ElementSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, search;
		
		System.out.println("Enter the number of the elements");
		n = sc.nextInt();
		
		//Initialize the array 
		int[] number = new int[n];
		
		//get the value from the user
		for(int i=0; i<n; i++){
			System.out.println("Enter the value of " + (i+1) + " element");
			number[i] = sc.nextInt();
		}
		
		//get the search value from the user
		System.out.println("Enter the value to search");
		search = sc.nextInt();
		
		//search for the element
		for(int i=0; i<number.length; i++){
			if(search == number[i]){
				System.out.println("the location of "+ search + " is "+ (i+1));
				break;
			}
		}
	}

}
