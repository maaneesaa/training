package training;

public class MoonWeight {

	public static void main(String[] args) {
		earthweight ();
		/*
		 * earthweight = 980;
		 * 
		 * moonweight = earthweight * 0.17;
		 * System.out.println("my weight on moon is " + moonweight + " pounds");
		 */

	}

	public static void earthweight() {
		double mass = 100;
		double gravity = 9.8;
		double moonweight = mass * gravity * 0.17;

		System.out.println("my weight on moon is " + moonweight + " pounds");

	}

}
