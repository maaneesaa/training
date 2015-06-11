package training;

import inheritence.Employee;
import inheritence.Person;

import java.util.Date;

public class Movie {
	public String name;
	public Date releaseDate;
	private double expenditure;
	private double income;
	public Person director;
	public Employee actor;
	
	//constructor of class movie
	public Movie(){
		this.releaseDate = new Date();
	}
	public Movie(String name){
		this();					//this (means Movie) call the statement Movie()
		this.name = name;		//name is assigned to Movie(String name)
	}	
	
	public Movie(String name, double income){
		this(name);				//call the above statement Movie(String name)
		this.income = income;	//class.properties
	}
	
	public Movie(String name, double income, double exp){	//parameters of movie
		this(name, income);			//call the above statement Movie(String name, double income)
		this.expenditure = exp;
	}
	
	public static void main(String[] args) {
	   //main class function
		
		Movie m1 = new Movie("50 shades of gray");
		m1.director = new Person("Manisha", "Prajapati");
		System.out.println(m1.director.fullName());
		
		m1.releaseDate = new Date(1989,12,25);
	    System.out.println(m1.releaseDate);
		System.out.println(m1.endingDate());
		System.out.println(m1.startingDate());
		m1.actor = new Employee("Bipin", "Budhathoki");
		System.out.println(m1.director.fullName());
		System.out.println(new Date());
		Date d = new Date();
		System.out.println(d);
	
	}
	
	public boolean isProfitable(){		//boolean type instance function
		return (expenditure < income);		
	}
	public Date endingDate(){			//another instance function
		return new Date(this.releaseDate.getYear() + 1, this.releaseDate.getMonth(), this.releaseDate.getDay());
	}
	
	public Date startingDate() {
		return new Date();
	}

}
