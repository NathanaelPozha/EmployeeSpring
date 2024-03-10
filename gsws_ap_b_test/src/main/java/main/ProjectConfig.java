package main;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import main.test.Employee;
import main.test.Customer;
import main.test.Branch;

@Configuration
public class ProjectConfig {
	
	@Bean
	public Branch branch() {
		Branch b = new Branch();
		b.setName("Customer Service");
		return b;
	}
	
	@Bean
	public Customer customer() {
		Customer c = new Customer();
		c.setName("Adel");
		c.setAge(31);
		return c;
	}
	
	@Bean
	public Employee employee(Branch branch, Customer customer) {
		Employee e = new Employee();
		e.setName("Pozha");
		e.setAge(20);
		e.setBranch(branch);
		e.setCustomer(customer);
		return e;
	}

}
