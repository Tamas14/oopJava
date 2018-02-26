package hu.unimiskolc;

import java.math.BigInteger;

public class Fibonacci {

	public static BigInteger getFibonacci(int n) {
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		BigInteger s = new BigInteger("0");

		if (n > 0 && n <= 2)
			return BigInteger.valueOf(1);

		n -= 2;
		for (int i = 0; i < n; i++) {
			s = a.add(b);
			b = a.multiply(BigInteger.valueOf(1));
			a = s.multiply(BigInteger.valueOf(1));
		}

		return s;
	}

}
