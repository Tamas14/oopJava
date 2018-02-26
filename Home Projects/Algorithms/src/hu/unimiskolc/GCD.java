package hu.unimiskolc;

import java.util.ArrayList;
import java.util.List;

/**
 * Greatest common divisor
 */
public class GCD {

	private int a, b;

	public GCD(int a, int b) throws NumberOutOfRangeException {
		if (a == 0 || b == 0)
			throw new NumberOutOfRangeException("0", "INF", false, false);
		this.a = a;
		this.b = b;
	}

	public int prime_factorizations() {
		if (a == 0 && b == 0)
			return 0;

		int[] a_f = factorization(a);
		int[] b_f = factorization(b);

		int gcd = 1;

		int j = 0;
		for (int i = 0; i < a_f.length;) {
			if (j == b_f.length)
				break;

			if (a_f[i] == b_f[j]) {
				gcd *= a_f[i];
				j++;
				i++;
			} else {
				if (a_f[i] < b_f[j])
					i++;
				else
					j++;
			}
		}

		return gcd;
	}

	public int subtraction() {
		int a_TMP = a;
		int b_TMP = b;
		int s;

		while (b_TMP != 0) {
			if (a_TMP < b_TMP) {
				s = a_TMP;
				a_TMP = b_TMP;
				b_TMP = s;
			}

			a_TMP -= b_TMP;
		}

		return a_TMP;
	}
	
	public int euclidean()
	{
		int a_TMP = a;
		int b_TMP = b;
		int s;
		
		while(b_TMP != 0)
		{
			s = a_TMP;
			a_TMP = b_TMP;
			b_TMP = s%b_TMP;
		}
		
		return a_TMP;
	}

	private int[] factorization(int a) {
		int i = 2;
		List<Integer> result = new ArrayList<>();

		if (a < 1)
			return null;

		if (isPrime(a))
			return new int[] { a };

		while (a != 1) {
			if (isPrime(i)) {
				if (a % i == 0) {
					a /= i;
					result.add(i);
				} else {
					i = (i != 2) ? i + 2 : i + 1;
				}
			} else {
				i += 2;
			}
		}

		return result.stream().mapToInt(f -> f).toArray();
	}

	private boolean isPrime(int a) {
		if (a < 2)
			return false;

		for (int i = 2; i <= Math.sqrt(a); i++)
			if (a % i == 0)
				return false;

		return true;
	}

}
