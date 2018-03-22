package hu.unimiskolc;

import java.time.LocalDate;

public class Employee {
	public static int pensionLimit = 65;

	private String name;
	private LocalDate birthday;
	private double salary;

	public Employee(String name, LocalDate birthday, double salary) {
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
	}

	public Employee(String name, LocalDate birthday) {
		this(name, birthday, 0);
		this.salary = 10000 * getAge();
	}

	public int untilPension() {
		return pensionLimit - getAge();
	}

	@Override
	public String toString() {
		return name + ", " + getAge() + ", " + salary + ", " + untilPension();
	}

	public String getPersonals() {
		return name + ", " + getAge() + ": " + getMonth(birthday.getMonthValue()) + " " + birthday.getDayOfMonth();
	}

	public static void setPensionLimit(int age) {
		pensionLimit = age;
	}

	public static Employee getYounger(Employee e1, Employee e2) {
		if (e1.getAge() < e2.getAge())
			return e1;
		return e2;
	}

	public int getAge() {
		return LocalDate.now().getYear() - birthday.getYear();
	}

	private String getMonth(int num) {
		String[] honapok = { null, "január", "február", "március", "április", "május", "június", "július", "augusztus",
				"szeptember", "október", "november", "december" };
		return honapok[num];
	}

}
