package hu.unimiskolc;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Integer[] intArray = new Integer[10];
		Double[] doubleArray = new Double[10];
		Character[] charArray = new Character[10];

		// Fill arrays with random data
		randomize(intArray);
		randomize(doubleArray);
		randomize(charArray);

		// Print them out
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);

		System.out.println();

		// Sort arrays
		Arrays.sort(intArray);
		Arrays.sort(doubleArray);
		Arrays.sort(charArray);

		// Print them out
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);

		System.out.println();
		
		// Binary search
		System.out.println("Searching for " + intArray[3] + ": " + Arrays.binarySearch(intArray, intArray[3]));
		System.out.println("Searching for " + doubleArray[6] + ": " + Arrays.binarySearch(doubleArray, doubleArray[6]));
		System.out.println("Searching for " + charArray[1] + ": " + Arrays.binarySearch(charArray, charArray[1]));
		
		System.out.println();
		
		Integer[] clone = intArray;
		Character[] notAClone = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		System.out.println("intArray and its clone are equal: " + Arrays.equals(intArray, clone));
		System.out.println("charArray and notAClone are equal: " + Arrays.equals(charArray, notAClone));
		
	}

	public static void randomize(Integer[] arr) {
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(50) + 1;
		}
	}

	public static void randomize(Double[] arr) {
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextDouble() * 10;
		}
	}

	public static void randomize(Character[] arr) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Character.valueOf((char) (65 + r.nextInt(26)));
		}
	}

	public static <E> void printArray(E[] arr) {
		for (E e : arr)
			System.out.print(e + ", ");

		System.out.println();
	}

}
