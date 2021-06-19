package ex_7;

public class Company {
	// "<Name> company <companyName> <department> <salary>"

	private String companyName;
	private String department;
	private double salary;
	
	public Company() {

	}

	public Company(String companyName, String department, double salary) {
		this.companyName = companyName;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("%s %s %.2f", companyName, department, salary);
	}

}
