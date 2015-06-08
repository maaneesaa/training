package javaExercise2;

public class AscendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//assign array with elements
		
		int [] numbers = {22, 35, 46, 78, 36, -7, -3, 5};
		int size = 8;
		
		// display the original array
		
		for (int i = 0; i < size; i++)
			System.out.println("The numbers are " + numbers[i] +" " );
		System.out.println();
			
		//sorting of array using bubble sort
		for(int a = 1; a< size; a++)
			for (int b = size-1; b>=a; b--){
				if (numbers[b-1] > numbers[b]){
					int t = numbers[b-1];
					numbers[b-1]= numbers[b];
					numbers[b] = t;
					
				}
			}
			for(int i = 0; i< size; i++)
				System.out.println ("The sorted numbers are" + numbers[i] );
			System.out.println();
			
				
		}
		
	}


