package hu.unimiskolc.people.test;

import java.util.Random;
import java.util.Scanner;

import hu.unimiskolc.people.Adult;
import hu.unimiskolc.people.Child;
import hu.unimiskolc.people.Employee;
import hu.unimiskolc.people.Person;

public class PersonTest
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		Person[] p;

		String name, work;
		int age, salary = 0;

		System.out.print("Person count: ");
		p = new Person[Integer.parseInt(s.nextLine())];

		for (int i = 0; i < p.length; i++)
		{
			System.out.print((i + 1) + ") Name: ");
			name = s.nextLine();

			System.out.print((i + 1) + ") Age: ");
			age = Integer.parseInt(s.nextLine());

			System.out.print((i + 1) + ") " + ((age < 18) ? "School: " : "Workplace: "));
			work = s.nextLine();

			if (work.length() < 1)
				work = null;
			else if (age >= 18)
			{
				System.out.print((i + 1) + ") Salary: ");
				salary = Integer.parseInt(s.nextLine());
			}

			p[i] = (age < 18) ? new Child(name, age, work)
					: (work != null) ? new Employee(name, age, work, salary) : new Adult(name, age, work);

		}
		s.close();

		//fillArr(p);

		sort(p);

		print(p);

	}

	public static void sort(Person[] p)
	{
		int min;
		Person person;

		for (int i = 0; i < p.length - 1; i++)
		{
			min = i;
			for (int j = i; j < p.length; j++)
			{
				if (p[min].isOlderThan(p[j]))
					min = j;
			}

			person = p[i];
			p[i] = p[min];
			p[min] = person;
		}
	}

	public static void print(Person[] p)
	{
		for (Person person : p)
		{
			System.out.println(person.toString());
		}
	}

	public static void fillArr(Person[] p)
	{
		Random r = new Random();
		for (int i = 0; i < p.length; i++)
		{
			String name = (char) (65 + i) + "";
			int age = r.nextInt(40) + 10;
			String work = (i % 2 == 0) ? name + i : "";

			if (age < 18)
				p[i] = new Child(name, age, work);
			else if (work.length() < 1)
				p[i] = new Adult(name, age, null);
			else
				p[i] = new Employee(name, age, work, r.nextInt(1500) + 500);
		}

	}
}
