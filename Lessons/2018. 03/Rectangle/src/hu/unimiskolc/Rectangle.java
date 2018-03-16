package hu.unimiskolc;

public class Rectangle {

	private int a, b;

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public Rectangle(int a) {
		this.a = a;
		this.b = a;
	}

	public int getArea() {
		return a * b;
	}

	public void setSides(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void setSides(int a) {
		this.a = a;
		this.b = a;
	}

	public boolean compareArea(Rectangle r) {
		return (getArea() == r.getArea());
	}

	public boolean compareSides(Rectangle r) {
		return (this.a == r.a && this.b == r.b);
	}

	@Override
	public String toString() {
		return a + ", " + b + ": " + getArea();
	}

}
