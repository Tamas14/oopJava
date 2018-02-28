package hu.unimiskolc;

public class Dimension {

	int rows, columns;

	public Dimension(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o == this)
			return true;
		if (!(o instanceof Dimension))
			return false;
		Dimension d2 = (Dimension) o;

		if (this.rows == d2.rows && this.columns == d2.columns)
			return true;

		return false;
	}

	@Override
	public String toString() {
		return rows + " " + columns;
	}

}
