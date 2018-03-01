package hu.unimiskolc;

import java.util.Random;

public class Matrix {

	private int rows, columns;
	private double[][] data;

	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.data = new double[rows][columns];
	}

	public Matrix(double[][] data) {
		this.rows = data.length;
		this.columns = data[0].length;
		this.data = data;
	}

	public void add(Matrix m) throws MatrixDimensionMismatchException {
		if (!this.getDimension().equals(m.getDimension())) {
			throw new MatrixDimensionMismatchException("One of the matrices is bigger than other");
		} else {
			for (int i = 0; i < this.rows; i++)
				for (int j = 0; j < this.columns; j++)
					data[i][j] += m.getMatrixData()[i][j];
		}
	}

	public void multiply(double d) {
		for (int i = 0; i < this.rows; i++)
			for (int j = 0; j < this.columns; j++)
				data[i][j] *= d;
	}

	public static Matrix multiply(Matrix m1, Matrix m2) throws MatrixDimensionMismatchException {
		if (m1.getDimension().columns != m2.getDimension().rows) {
			throw new MatrixDimensionMismatchException("1st matrix's columns should be equal to the 2th rows");
		} else {
			Matrix tmp = new Matrix(m1.getDimension().rows, m2.getDimension().columns);

			for (int i = 0; i < m1.getDimension().rows; i++) {
				for (int j = 0; j < m2.getDimension().columns; j++) {

					double sum = 0;

					for (int k = 0; k < m1.getDimension().columns; k++) {
						sum += m1.getMatrixData()[i][k] * m2.getMatrixData()[k][j];
					}

					tmp.getMatrixData()[i][j] = sum;
				}
			}

			return tmp;
		}
	}

	public static Matrix transpose(Matrix m) {
		double[][] data = new double[m.getDimension().columns][m.getDimension().rows];

		for (int i = 0; i < m.getDimension().columns; i++)
			for (int j = 0; j < m.getDimension().rows; j++)
				data[i][j] = m.getMatrixData()[j][i];

		return new Matrix(data);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o == this)
			return true;
		if (!(o instanceof Dimension))
			return false;
		Matrix m2 = (Matrix) o;

		for (int i = 0; i < this.rows; i++)
			for (int j = 0; j < this.columns; j++)
				if (data[i][j] != m2.getMatrixData()[i][j])
					return false;

		return true;
	}

	public void randomize(int max) {
		Random r = new Random();
		for (int i = 0; i < this.rows; i++)
			for (int j = 0; j < this.columns; j++)
				this.data[i][j] = r.nextInt(max * 2) - max;

	}

	public static void print(Matrix m) {
		for (int i = 0; i < m.getDimension().rows; i++) {

			for (int j = 0; j < m.getDimension().columns; j++)
				System.out.printf("%10.2f", m.getMatrixData()[i][j]);

			System.out.println();
		}

	}

	public double[][] getMatrixData() {
		return data;
	}

	public Dimension getDimension() {
		return new Dimension(rows, columns);
	}

}
