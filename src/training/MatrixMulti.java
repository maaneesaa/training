package training;

import java.util.Scanner;

public class MatrixMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int i, j, k; int[][] matrixa = { { 1, 2 }, { 3, 4 } }; int[][]
		 * matrixb = { { 5, 6 }, { 7, 8 } }; int[][] matrixc = new int[2][2];
		 * 
		 * // for multiplication for (i = 0; i < matrixa.length; i++) { for (j =
		 * 0; j < matrixb.length; j++) { for (k = 0; k < 2; k++) { matrixc[i][j]
		 * = matrixa[i][k] * matrixb[k][j] + matrixc[i][j]; }
		 * 
		 * } }
		 * 
		 * System.out.println("The matrix multiplication is: "); for (i = 0; i <
		 * matrixa.length; i++) { for (j = 0; j < matrixb.length; j++) {
		 * System.out.println(matrixc[i][j] + " "); } System.out.println(); }
		 */

		int i, j, k;
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of rows and coloum for matrices");
		n = sc.nextInt();
		int[][] matrixa = new int[n][n];
		int[][] matrixb = new int[n][n];
		int[][] matrixc = new int[n][n];
		System.out.println("Enter the element of rows for matrixa");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				matrixa[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the element of rowsfor matrixb");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				matrixb[i][j] = sc.nextInt();
			}
		}

		// for multiplication
		for (i = 0; i < matrixa.length; i++) {
			for (j = 0; j < matrixb.length; j++) {
				for (k = 0; k < 2; k++) {
					matrixc[i][j] = matrixa[i][k] * matrixb[k][j]
							+ matrixc[i][j];
				}

			}
		}

		System.out.println("The matrix multiplication is: ");
		for (i = 0; i < matrixa.length; i++) {
			for (j = 0; j < matrixb.length; j++) {
				System.out.print(matrixc[i][j] + " ");
			}
			System.out.println();
		}
	}
}
