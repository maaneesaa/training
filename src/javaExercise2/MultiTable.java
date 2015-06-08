package javaExercise2;

//multiplication table using 2d array

public class MultiTable {

	public static void main (String[] args){
		int [][] multiTable = new int [10][10];
		
		for (int i = 1; i <= multiTable.length; i++){
			for(int j = 1; j <= multiTable[i].length; j++){
				
			 multiTable[i][j] = (i)* (j);
			}
			 
				System.out.print(multiTable);
				
		}
		
		System.out.println();
		
		
	}

}
