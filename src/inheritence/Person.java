package inheritence;

public class Person {

	public String firstName;
	public String lastName;
	public int age;
	
	//constructor
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;	
	}
	
	public Person(String firstName, String lastName, int age){
		this(firstName, lastName);
		this.age = age;
	}
	
	public String fullName(){
		return this.firstName + " " + this.lastName;
	}
	
	public static String staticTest(){
		return "static test";
	}
	
	public String toString(){
		return "I am overriding to string method";
	}
	
}
