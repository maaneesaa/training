package inheritence;

public class Employee extends Person {
	
	public double salary;
	public String dressCode;
	public Manager manager;

	//constructor
	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public Employee(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
	}
	
	//public method
	public String fullName(){
		String fullName = super.fullName();
		return fullName + " with Salary: " + this.salary; 
	}
	
	protected String getFullName(){
		return "get full name";
	}
}
