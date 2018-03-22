package hu.unimiskolc;

public class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public Employee(String name) {
		this(name, 250000);
	}

	public void incSalary(double amount) {
		salary += amount;
	}

	public String getData() {
		return "Name: " + name + " Salary: " + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean salaryInRange(double l, double h) {
		return (l <= salary && salary <= h);
	}

	public double getTax() {
		double rate = 0.16;
		return rate * salary;
	}

	public boolean hasGreaterSalary(Employee e) {
		return this.salary > e.getSalary();
	}
}
