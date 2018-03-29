package hu.unimiskolc;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);

		Person[] p;

		System.out.print("Person count: ");
		n = Integer.parseInt(s.nextLine());

		p = new Person[n];
		String name;
		int age;
		int salary;
		String address;

		for (int i = 0; i < n; i++) {
			System.out.print("Name: ");
			name = s.nextLine();
			System.out.print("Age: ");
			age = Integer.parseInt(s.nextLine());
			System.out.print("Salary: ");
			salary = Integer.parseInt(s.nextLine());
			System.out.print("Address: ");
			address = s.nextLine();

			p[i] = new Person(name, age, salary, address);
		}

		// fillArr(p);

		s.close();

		System.out.println();

		for (int i = 0; i < n; i++) {
			if (p[i].getDiff() < 0)
				System.out.println(p[i].toString());
		}

		System.out.println("Min wage decreased");
		Person.setMinWage(80);

		for (int i = 0; i < n; i++) {
			if (p[i].getDiff() < 0)
				System.out.println(p[i].toString());
		}

	}

	public static void fillArr(Person[] ps) {
		Random r = new Random();
		for (int i = 0; i < ps.length; i++) {
			ps[i] = new Person((char) (65 + i) + "", r.nextInt(35) + 18, r.nextInt(100000) + 60000, "");
		}
	}
}
