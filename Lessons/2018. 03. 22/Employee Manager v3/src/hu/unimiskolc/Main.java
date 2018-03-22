package hu.unimiskolc;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count;

		Employee[] emps;
		Scanner s = new Scanner(System.in);

		System.out.print("Count: ");
		count = Integer.parseInt(s.nextLine());

		emps = new Employee[count];

		// test(emps);

		String name;
		LocalDate bday;
		double salary;

		for (int i = 0; i < count; i++) {
			System.out.print((i + 1) + ") Name: ");
			name = s.nextLine();

			System.out.print((i + 1) + ") Birthday (yyyy-mm-dd): ");
			bday = LocalDate.parse(s.nextLine());

			System.out.print((i + 1) + ") Salary: ");
			salary = Double.parseDouble(s.nextLine());

			emps[i] = new Employee(name, bday, salary);
		}

		printAll(emps);
		Employee.setPensionLimit(70);
		printAll(emps);

		System.out.println("< 5 years until pension");
		for (Employee e : emps) {
			if (e.untilPension() < 5)
				System.out.println(e.toString());
		}

		System.out.println("More years than average");
		filter(emps);

		Comparator<Employee> AGEDESC = (Employee x, Employee y) -> Integer.compare(x.getAge(), y.getAge());
		Comparator<Employee> AGEASC = (Employee x, Employee y) -> Integer.compare(y.getAge(), x.getAge());

		System.out.println("Ascending order:");
		Collections.sort(Arrays.asList(emps), AGEASC);
		printAll(emps);

		System.out.println("Descending order:");
		Collections.sort(Arrays.asList(emps), AGEDESC);
		printAll(emps);

		System.out.println("Another output: ");
		for (Employee e : emps)
			System.out.println(e.getPersonals());

		s.close();
	}

	public static void printAll(Employee[] emps) {
		for (Employee e : emps)
			System.out.println(e.toString());
	}

	public static void filter(Employee[] emps) {
		double avg = 0;
		for (Employee e : emps)
			avg += e.untilPension();

		avg /= emps.length;

		for (Employee e : emps)
			if (e.untilPension() > avg)
				System.out.println(e.toString());
	}

//	public static void test(Employee[] emps) {
//		Random r = new Random();
//
//		for (int i = 0; i < emps.length; i++)
//			emps[i] = new Employee((char) (65 + i) + "", LocalDate.ofEpochDay(r.nextInt(10000) + 3000));
//	}

}
