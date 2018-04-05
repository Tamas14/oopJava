package hu.unimiskolc.people;

public class Adult extends Person
{
	private String workplace;

	public Adult(String name, int age, String workplace)
	{
		super(name, age);
		this.workplace = workplace;
	}

	@Override
	public String toString()
	{
		return super.toString() + " " + workplace;
	}

	public String getWorkplace()
	{
		return workplace;
	}

}
