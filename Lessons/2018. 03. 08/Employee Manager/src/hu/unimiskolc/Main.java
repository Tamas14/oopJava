package hu.unimiskolc;

import java.util.Scanner;

public class Main {

	// public static void main(String[] args) {
	// Employee e = new Employee();
	// e.setName("Tamás Csaba");
	// e.setSalary(3000.1);
	//
	// System.out.println(e.getData());
	//
	// e.incSalary(1234.53);
	//
	// System.out.println(e.getData());
	//
	// System.out.println(e.salaryInRange(3000, 5000));
	// System.out.println("Tax: " + e.getTax());
	//
	// Employee e2 = new Employee();
	// e2.setName("Kiss Jóska");
	// e2.setSalary(600);
	//
	// System.out.print(e.hasGreaterSalary(e2));
	// }

	public static void main(String[] args) {
		int count = 5;
		
		Employee[] emps = new Employee[count];
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < count; i++) {
			emps[i] = new Employee();
			System.out.print((i + 1) + ") Name: ");
			emps[i].setName(s.nextLine());

			System.out.print((i + 1) + ") Salary: ");
			emps[i].setSalary(Double.parseDouble(s.nextLine()));
		}
		
		s.close();
		
		System.out.println(emps[maxSalary(emps)].getName() + " has the greatest salary.");
		System.out.println("Employees in range [0, 1000]: " + salaryRange(0, 1000, emps));
		System.out.println("Average salary: " + avgSalary(emps));
		System.out.println("Sum of tax: " + taxSum(emps));
	}

	public static int maxSalary(Employee[] emps) {
		int index = 0;

		for (int i = 1; i < emps.length; i++)
			if (emps[i].getSalary() > emps[index].getSalary())
				index = i;

		return index;
	}

	public static int salaryRange(double l, double h, Employee[] emps) {
		int count = 0;
		
		for (int i = 0; i < emps.length; i++)
			if (emps[i].salaryInRange(l, h))
				count++;
		
		return count;
	}
	
	public static double avgSalary(Employee[] emps)
	{
		double sum = 0;
		
		for (int i = 0; i < emps.length; i++)
			sum += emps[i].getSalary();
		
		return sum / emps.length;
	}
	
	public static double taxSum(Employee[] emps)
	{
		double sum = 0;
		
		for (int i = 0; i < emps.length; i++)
			sum += emps[i].getTax();
		
		return sum;
	}
}
