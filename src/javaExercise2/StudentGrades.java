package javaExercise2;
import java.util.Scanner;

public class StudentGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numStudents;
		double grades = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students: ");
		numStudents = sc.nextInt();
		
		int [] array = new int[numStudents];
		System.out.println("Enter the grades of the students: ");
		
		for(int i= 1; i< array.length; i++){
			array[i] = sc.nextInt();
			
			if(grades == array[i]){
			System.out.println(i+1);
			
		}
			
		}
		
	}

}
