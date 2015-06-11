package javaExercise2;

//multiplication table using 2d array

public class MultiTable {

	public static void main(String[] args) {
		int[][] multiTable = new int[9][9];

		for (int i = 0; i < multiTable.length; i++) {
			for (int j = 0; j < multiTable[i].length; j++) {

				multiTable[i][j] = (i + 1) * (j + 1);
			}
		}
		System.out.print(" | ");
		for (int i = 0; i < 9; i++) {
			System.out.print((i + 1) + " ");
		}
		System.out.println();
		System.out.println("---------------------");
		for (int i = 0; i < multiTable.length; i++) {
			System.out.print((i + 1) + "|");
			for (int j = 0; j < multiTable[i].length; j++) {

				System.out.print(" " + multiTable[i][j]);
			}

			System.out.println();

		}

	}

}
