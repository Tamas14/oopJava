package hu.unimiskolc.people;

public class Employee extends Adult
{
	public static int retiringAge = 65;
	private int salary;
	
	public Employee(String name, int age, String workplace, int salary)
	{
		super(name, age, workplace);
		this.salary = salary;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " " + salary;
	}
	
}
