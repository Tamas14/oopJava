package hu.unimiskolc;

import java.util.Scanner;

import hu.unimiskolc.exception.PrimeException;

public class Test
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		int input = -1;
		boolean invalidInput;

		for (int i = 0; i < numbers.length; i++)
		{
			do
			{
				invalidInput = false;
				try
				{
					System.out.print((i+1) + ") Enter a prime number: ");
					input = read(scanner);
				} catch (NumberFormatException e)
				{
					System.out.println("Error! Number expected.");
					invalidInput = true;
				} catch (PrimeException e)
				{
					System.out.println("Error! Prime number expected.");
					invalidInput = true;
				}
			} while (invalidInput);

			numbers[i] = input;
		}
	}

	public static int read(Scanner scanner) throws NumberFormatException, PrimeException
	{
		String line;
		int num = -1;

		line = scanner.nextLine();
		num = Integer.parseInt(line);

		// num is a number
		if (!isPrime(num))
			throw new PrimeException();

		// num is a prime number

		return num;
	}

	public static boolean isPrime(int num)
	{
		if (num < 2)
			return false;
		if (num == 2 || num == 3)
			return true;

		boolean prime = true;
		for (int i = 2; i <= Math.sqrt(num); i++)
		{
			if (num % i == 0)
				prime = false;
		}

		return prime;
	}
}
