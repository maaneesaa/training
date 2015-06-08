package inheritence;

public class InheritenceExample {

	public static void main(String[] args) {
		Employee e = new Employee("Employee", "Doe", 40 );
		e.salary = 4000;
		//Employee e1 = new Employee("test", "test");
		//Employee bipin = new Employee("Bipin", "Budhathoki");
		
		System.out.println(e.fullName());
		System.out.println(e.getFullName());
//		System.out.println(e.lastName);
//		System.out.println(e.age);
//		System.out.println(e.salary);
//		System.out.println(e.dressCode);
		
		Person p = new Person("Person", "Test");
		System.out.println(p.fullName());
		System.out.println(p.toString());
		//System.out.println(bipin.fullName());
		
		//System.out.println(Employee.staticTest());
		
	}

}
