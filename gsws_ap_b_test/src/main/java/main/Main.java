package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import main.test.Employee;
import main.test.Customer;
import main.test.Branch;

public class Main {

	public static void main(String[] Args) {
		var context = 
				new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Employee employee = context.getBean(Employee.class);
		
		Customer customer = context.getBean(Customer.class);
		
		Branch branch = context.getBean(Branch.class);
		
		System.out.println("Employee's Name: " + employee.getName());
		System.out.println("Employee's Age: " + employee.getAge());
		
		System.out.println("Employee's " + employee.getBranch());
		System.out.println("Employee's " + employee.getCustomer());
	}

}
