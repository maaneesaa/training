package javaExercise2;

public class CozaLozaWoza {

	public static void main(String[] args) {
		CozaLozaWoza instance = new CozaLozaWoza();
		instance.printNumbers(1, 110);

	}

	public void printNumbers(int n, int m) {
		int counter = 0;
		for (int i = n; i <= m; i++) {
		
			if (i % 7 == 0 && i % 5 == 0) {
				System.out.print("WozaLoza ");
				counter++;
			} 
			else if (i % 7 == 0 && i % 3 == 0) {
				System.out.print("WozaCoza ");
				counter++;
			} 
			else if (i % 5 == 0 && i % 3 == 0) {
				System.out.print("LozaCoza ");
				counter++;
			} 
			else if (i % 7 == 0) {
				System.out.print("Woza ");
				counter++;
			} 
			else if (i % 5 == 0) {
				System.out.print("Loza ");
				counter++;
			}
			else if (i % 3 == 0) {
				System.out.print("Coza ");
				counter++;
			}
			if (counter == 11) {
				System.out.println();
				counter = 0;
			}
			
		}
		
	}
}
