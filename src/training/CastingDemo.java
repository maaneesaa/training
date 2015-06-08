package training;

/*This class is going to create byte, int, double, variable and 
 * asign some value to the variable and cast them to one another
 * int--> byte
 * double--> int
 * double--> byte
 */

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b;
		int i = 128;
		//double d = 325.6;
		b = (byte) i;
		System.out.println("casting int i: " + " to byte b: " + b);
		//System.out.println(String.format("This is a byte %b", b));
		System.out.println(String.format("The integer is %d and %d", i, -i));
		System.out.println(String.format("casting int i: to byte b: %d", b));
	}
}
