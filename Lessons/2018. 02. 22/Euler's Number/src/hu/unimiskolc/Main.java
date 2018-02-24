package hu.unimiskolc;

public class Main {

	public static void main(String[] args) {
		double euler = 1;
		double f = 1;
		for (int i = 1; i <= 100; i++) {
			f = f * (1.0 / i);
			if (f == 0)
				break;

			euler += f;
		}

		System.out.println("Euler's number: " + euler);
	}

}
