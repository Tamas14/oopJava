package hu.unimiskolc;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 100; i++) {
			if (isPrime(i) && isPrime(i + 2))
			{
				count++;
				System.out.println("(" + i + ", " + (i + 2) + ")");
			}
		}
		
		System.out.println("Twin primes count: " + count);
	}

	public static boolean isPrime(int number) {
		if (number < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0 && i != number)
				return false;
		}

		return true;
	}

}
