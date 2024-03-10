package main.test;

public class Customer {

	private String name;
	private int age;

	public Customer() {
		System.out.println("A customer has been created");
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return("Customer: " + name + ", Age: " + age);
	}

}
