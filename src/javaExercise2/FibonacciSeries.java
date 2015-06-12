package javaExercise2;

public class FibonacciSeries {

	public static void main(String[] args) {
		FibonacciSeries instance = new FibonacciSeries();
	for (int i = 0; i <= 40; i++){
		System.out.print(instance.fibo(i) + " ");
	}

	}

	public int fibo(int f) {
		if (f == 0) {
			return 0;
		}
		if (f == 1 || f == 2) {
			return 1;
		}

		return fibo(f - 1) + fibo(f - 2);

	}

}