package main;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import java.util.Scanner;
import main.test.Employee;
import main.test.Customer;
import main.test.Branch;


@Configuration
public class ProjectConfig {
	
	Scanner scan = new Scanner(System.in);
	
	@Bean
	public Branch branch() {
		System.out.println("Please enter branch name:");
		String branchName = scan.nextLine();
		Branch b = new Branch();
		b.setName(branchName);
		return b;
	}
	
	@Bean
	public Customer customer() {
		System.out.println("");
		System.out.println("Please enter customer's name:");
		String customerName = scan.nextLine();
		Customer c = new Customer();
		c.setName(customerName);
		System.out.println("Please enter customer's age:");
		int customerAge = scan.nextInt();
		scan.nextLine();
		c.setAge(customerAge);
		return c;
	}

	@Bean
	public Employee employee(Branch branch, Customer customer) {
		System.out.println("");
		System.out.println("Please enter employee's name:");
		String employeeName = scan.nextLine();
		Employee e = new Employee();
		e.setName(employeeName);
		System.out.println("Please enter employee's age:");
		int employeeAge = scan.nextInt();
		scan.nextLine();
		e.setAge(employeeAge);
		e.setBranch(branch);
		e.setCustomer(customer);
		return e;
	}
	
}
