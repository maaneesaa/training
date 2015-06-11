package javaExercise2;
import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("Enter the frist number");
		n1 = sc.nextInt();
		System.out.println("Enter the second number");
		n2 = sc.nextInt();
		boolean isPrime = true;
		for (int i= n1; i<=n2; i++){
			for (int j= 2; j<n1; j++){
				if(n1%j == 0){
					isPrime = false;
					System.out.print("Its not a prime number.");
					break;
				}
				else {
					isPrime = true;
				}
			}
		}
			if (isPrime == true);
			
			System.out.print("The prime numbers are: " + n1);
		
	}

}
