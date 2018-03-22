package hu.unimiskolc.elso;

public class Number {

	public static final double diff = 0.001;
	private double number;
	
	public Number(double number) {
		this.number = number;
	}
	
	public boolean hasLowerDiff(double number)
	{
		return diff > (this.number - number);
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}
	
}
