package ex_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department {
	private String name;
	private List<Employee> employees;

	public Department(String name) {
		this.name = name;
		this.employees = new ArrayList<>();
	}
	
	

	public String getName() {
		return name;
	}



	public List<Employee> getEmployees() {
		return employees;
	}



	public double getAverageSalary() {
		
//		double sumSalary = 0;
//		for(Employee emp : employees) {
//			sumSalary+=emp.getSalary();
//		}
//		return sumSalary/this.employees.size();

		return this.employees.stream()
				.mapToDouble(e -> e.getSalary())
				.average().orElse(0.0);
	}
}
