package javaExercise2;

import java.util.Scanner;

public class Symbol {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		
		String word = sc.nextLine();
		
		for (int i=0; i< word.length(); i++)
		System.out.println(word.charAt(i));
	}

}
