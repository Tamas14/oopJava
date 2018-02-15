package hu.unimiskolc;

import java.util.Scanner;

/**
 * Number Converter
 * 
 * @author Tamás Csaba
 * 
 * @version 1.0
 *
 */

public class NumberConversion {
	private static int minBase = 2;
	private static int maxBase = 35;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Number: ");
		String number = s.nextLine();

		System.out.print("Base: ");
		int base = s.nextInt();

		System.out.print("Target: ");
		int target = s.nextInt();

		if (!number.matches("[-0-9A-Z]{1,}")) {
			System.out.println("Illegal characters used!");
			s.nextLine();
		} else if (number.contains("-")) {
			System.out.println("No support for negatives yes");
		} else if (minBase > base || minBase > target || maxBase < base || maxBase < target) {
			System.out.println("Supported number systems: [2, 35]");
			s.nextLine();
		} else {
			System.out.println(convertTo(getDecimal(number, base), target));
		}

		s.close();
	}

	/**
	 * Convert a decimal number to a given base.
	 * 
	 * @param number
	 *            Decimal number
	 * @param target
	 *            Target number's base
	 * @return Converted number
	 */
	public static String convertTo(int number, int target) {
		int maxIndex = getNumLength(number + "", 10, target);
		int[] pieces = new int[maxIndex];
		boolean checking;

		for (int i = 0; i < number; i++) {
			pieces[maxIndex - 1]++;
			checking = true;

			while (checking) {
				for (int j = maxIndex - 1; j >= 0; j--) {
					checking = false;
					if (pieces[j] >= target) {
						checking = true;
						pieces[j] = 0;
						if (j - 1 >= 0) {
							pieces[j - 1] += 1;
						} else {
							System.out.println("Error");
							checking = false;
							break;
						}
					}
				}
			}
		}

		String num = "";
		for (int i : pieces) {
			if (i > 9)
				num += valueOf(i);
			else
				num += i;
		}

		return num;
	}

	/**
	 * Return number's length in target base
	 * 
	 * @param number
	 *            Any number as string
	 * @param base
	 *            Number's base
	 * @param target
	 *            Target number's base
	 * @return Number length
	 */
	public static int getNumLength(String number, int base, int target) {
		return (int) (1 + Math.floor(Math.log10(getDecimal(number, base)) / Math.log10(target)));
	}

	/**
	 * Check the number depends on the base
	 * 
	 * @param number
	 *            Any number as string
	 * @param base
	 *            Number's base
	 * @return True, if the number's components are in the range [0, base)
	 */
	public static boolean validate(String number, int base) {
		String tmp;

		for (char c : number.toCharArray()) {
			tmp = Character.toString(c);
			if (isNumber(tmp)) {
				if (Integer.parseInt(tmp) >= base)
					return false;
			} else {
				if (valueOf(c) >= base)
					return false;
			}
		}

		return true;
	}

	/**
	 * Converts any given number to decimal
	 * 
	 * @param number
	 *            Any number as string
	 * @param base
	 *            Number's base
	 * @return Number in decimal
	 */
	public static int getDecimal(String number, int base) {
		int decimalValue = 0;
		int tmp;
		char[] chars = number.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			tmp = (isNumber(Character.toString(chars[i]))) ? Integer.parseInt(Character.toString(chars[i]))
					: valueOf(chars[i]);
			decimalValue += tmp * Math.pow(base, chars.length - (i + 1));
		}

		return decimalValue;
	}

	/**
	 * Converts letters to integer
	 * <p>
	 * A - 10<br>
	 * B - 11<br>
	 * ...
	 * 
	 * @param number
	 *            Any number as char
	 * @return Returns the letter's value
	 */
	public static int valueOf(char number) {
		int offset = 55;
		return (int) Character.toUpperCase(number) - offset;
	}

	/**
	 * Converts integers back to letters
	 * <p>
	 * 10 - A<br>
	 * 11 - B<br>
	 * ...
	 * 
	 * @param number
	 *            Any number
	 * @return Returns the letter
	 */
	public static char valueOf(int number) {
		int offset = 55;
		return new Character((char) (number + offset));
	}

	/**
	 * Checks, if the string is number or not.
	 * 
	 * @param str
	 *            String
	 * @return Return true, if str is a number.
	 */
	public static boolean isNumber(String str) {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
