package training;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("My name is manisha");
		HelloWorld.multiply(5, -10);
		int a = HelloWorld.multiplys(5, 5, 10);
		HelloWorld.numberaddition(6, 10);
		int b = HelloWorld.numbersubtraction(9, 3);
		HelloWorld.addition(9, 3);
		

		System.out.println("the second value is" + a);
	}

	public static void multiply(int x, int y) {
		int a;
		a = x * y;
		System.out.println("the value is" + a);
	}

	public static int multiplys(int x, int y, int z) {
		int a;
		a = x * y * z;
		return a;

	}

	public static void numberaddition(int x, int y) {
		int b;
		b = x + y;
		System.out.println("my number is" + b);
	}

	public static int numbersubtraction(int x, int y) {
		int b;
		b = x - y;
		return b;

	}

	public static void addition(int x, int y) {
		boolean c;
		int b1 = x + y;
		if (b1 >= 0) {
			System.out.println("my value is" + b1);
		} else {
			// b1 is negative
			System.out.println("value must be greater than 0");
		}

	}
	public static void example(){
		int a = 2;
		int b = 3;
		if (a < b) {
			System.out.println(a + "is less than" + b);
		} 
		else if (a == b) {
			System.out.println(a + "is equal to" + b);
		}
		else if (a < 0) {
			System.out.println(a + "is negative");
		}
		else {
			System.out.println(b + "is less than" + a);	
		}
		
	}
	

}
