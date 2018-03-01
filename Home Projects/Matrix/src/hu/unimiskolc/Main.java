package hu.unimiskolc;

public class Main {

	public static void main(String[] args) {
		Matrix m1 = new Matrix(new double[][] { { 2, -1, 4 }, { 7, 1, 0 } });
		Matrix m2 = new Matrix(3, 1);

		m2.randomize(10);

		System.out.println("Matrix 1");
		Matrix.print(m1);
		lineBreak(2);

		System.out.println("Matrix 2");
		Matrix.print(m2);
		lineBreak(2);

		Matrix m3 = null;

		try {
			System.out.println("Matrix 1 * matrix 2");
			m3 = Matrix.multiply(m1, m2);

			Matrix.print(m3);
			lineBreak(2);

			System.out.println("Transposed");
			Matrix.print(Matrix.transpose(m3));
		} catch (MatrixDimensionMismatchException e) {
			e.printStackTrace();
		}

	}

	private static void lineBreak(int a) {
		for (int i = 0; i < a; i++) {
			System.out.println();
		}
	}

}
