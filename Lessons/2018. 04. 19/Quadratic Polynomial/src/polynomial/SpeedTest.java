package polynomial;

import java.util.Random;

public class SpeedTest
{
	static long now;
	static long ell;

	public static void main(String[] args)
	{
		Random r = new Random();
		QuadraticPolynomial qp;
		long sum = 0;
		
		for (int j = 0; j < 10; j++)
		{
			now = System.currentTimeMillis();

			for (int i = 0; i < 1000000; i++)
			{
				qp = new QuadraticPolynomial(r.nextDouble(), r.nextDouble(), r.nextDouble());
				qp.getRoots();
			}

			ell = System.currentTimeMillis() - now;
			sum += ell;
			System.out.println((j + 1) + "): " + ell + " ms");
		}

		System.out.println("Average: " + (sum / 10));
	}

}