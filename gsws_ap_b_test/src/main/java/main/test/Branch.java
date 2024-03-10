package main.test;

public class Branch {

	private String name;
	
	public Branch() {
		System.out.println("A branch has been created");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Branch: " + name;
	}

}
