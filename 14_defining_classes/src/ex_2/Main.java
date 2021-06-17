package ex_2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		HashMap<String, Department> departments = new HashMap<>();
		Employee employee = null;
		for (int i = 1; i <= n; i++) {
			String employeeData = scanner.nextLine();
			String[] parameters = employeeData.split(" ");
			String name = parameters[0];
			double salary = Double.parseDouble(parameters[1]);
			String position = parameters[2];
			String department = parameters[3];

			if (parameters.length == 6) {
				String email = parameters[4];
				int age = Integer.parseInt(parameters[5]);
				employee = new Employee(name, salary, position, department, email, age);
			} else if (parameters.length == 5) {
				String parameter = parameters[4];
				if (parameter.contains("@")) {
					String email = parameter;
					employee = new Employee(name, salary, position, department, email);
				} else {
					int age = Integer.parseInt(parameter);
					employee = new Employee(name, salary, position, department, age);
				}
//				try {
//					int age = Integer.parseInt(parameter);
//					employee = new Employee(name, salary, position, department, age);
//				} catch (NumberFormatException ex) {
//					String email = parameter;
//					employee = new Employee(name, salary, position, department, email);
//				}
			} else if (parameters.length == 4) {
				employee = new Employee(name, salary, position, department);
			}

			if (!departments.containsKey(department)) {
				departments.put(department, new Department(department));
			}
			departments.get(department).getEmployees().add(employee);

		}

		Department maxAverageSalaryDepartment = departments.entrySet().stream()
				.max(Comparator.comparingDouble(entry -> entry.getValue().getAverageSalary())).get().getValue();

		System.out.println("Highest Average Salary: " + maxAverageSalaryDepartment.getName());
		maxAverageSalaryDepartment.getEmployees().stream()
				.sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
				.forEach(emp -> System.out.println(emp));
	}

}
