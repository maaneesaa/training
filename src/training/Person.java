package training;

public class Person {
	public String firstName;
	public String lastName;
	public String address;

	public int age;
	public Person husband;
	
	
	public static void main(String[] args){
		Person manisa = new Person();
		manisa.firstName = "Manisha";
		manisa.lastName = "Prajapati";
		manisa.fullName();
		
		Person bipin = new Person();
		bipin.firstName = "Bipin";
		bipin.lastName = "Budhathoki";
		manisa.husband = bipin;
		bipin.husbandName();
		
	}
	
	public void fullName(){
		System.out.println(this.firstName + " "+ this.lastName);
		
	}
	public void husbandName(){
		System.out.println("Husband Name: " + this.firstName + " "+ this.lastName);
	}
}
