package training;

import java.util.Scanner;

/**
 * @author manisa
 *
 */
public class Arthematic {
	public int x;
	public int y;

	public static void main(String[] args) {
		// Arthematic a = new Arthematic();
		// a.multiply(5, 6);
		// HelloWorld.multiply(5, 3);
		Arthematic.Area();
		Arthematic.circumference();

		Arthematic b = new Arthematic();
		b.x = 5;
		b.y = 1;
		b.multiply1();
		Arthematic c = new Arthematic();
		c.multiply1();
		c.x = 6;
		c.y = 9;
		c.multiply1();

	}

	// this method will multiply the value of x and y
	public void multiply(int x, int y) {
		int a;
		a = x * y;
		System.out.println("the value is" + a);
	}

	public void multiply1() {
		int a;
		a = this.x * this.y;
		System.out.println("the value is" + a);
	}

	public static void Area() {
		Scanner sc = new Scanner(System.in);
		double radius;
		System.out.println("Enter the radius of the circle:");
		radius = sc.nextDouble();
		double area = 3.18 * radius * radius;
		System.out.println("The area of a circle: " + area);
	}
	public static void circumference() {
		Scanner sc = new Scanner(System.in);
		double radius;
		System.out.println("Enter the radius of the circle:");
		radius = sc.nextDouble();
		double circumference = 2* 3.18 * radius;
		System.out.println("The circumference of a circle: " + circumference);
	}

}
