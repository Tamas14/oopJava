package hu.unimiskolc;

public class Main {

	public static void main(String[] args) {
		GCD gcd;
		long now;
		try {
			gcd = new GCD(2000000000, 1);
			
			now = System.currentTimeMillis();
			System.out.println("got " + gcd.prime_factorizations() + " in " + (System.currentTimeMillis() - now) + "ms");
			
			now = System.currentTimeMillis();
			System.out.println("got " + gcd.subtraction() + " in " + (System.currentTimeMillis() - now) + "ms");
			
			now = System.currentTimeMillis();
			System.out.println("got " + gcd.euclidean() + " in " + (System.currentTimeMillis() - now) + "ms");

			now = System.currentTimeMillis();
			System.out.println("got " + Fibonacci.getFibonacci(10000) + "\nin " + (System.currentTimeMillis() - now) + "ms");
		} catch (NumberOutOfRangeException e) {
			System.out.println("Given number is out of range " + e.getRange());
			e.printStackTrace();
		}
	}
}