package hu.unimiskolc;

public class Person {
	private String name;
	private int age;
	private int salary;
	private String address;
	private static int minWage = 120;

	public Person(String name, int age, int salary, String address) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return name + " " + age + " " + salary + " " + address;
	}

	public static void setMinWage(int minWage) {
		Person.minWage = minWage;
	}

	public static Person maxSalary(Person p1, Person p2) {
		if (p1.getSalary() > p2.getSalary())
			return p1;

		return p2;
	}

	public int getDiff() {
		return this.salary - Person.minWage*1000;
	}

	public int getSalary() {
		return salary;
	}

}
