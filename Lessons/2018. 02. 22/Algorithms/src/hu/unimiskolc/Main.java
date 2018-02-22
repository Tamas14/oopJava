package hu.unimiskolc;

public class Main {

	public static int linearSearch(int number, int[] numbers) {
		int i = 0;
		for (int num : numbers) {
			if (num == number) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public static void sort(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			int min = i;
			for (int j = i; j < numbers.length; j++) {
				if (numbers[j] < numbers[min]) {
					min = j;
				}
			}
			int seged = numbers[min];
			numbers[min] = numbers[i];
			numbers[i] = seged;

		}
	}

	public static int binarySearch(int number, int[] numbers) {
		int low = 0;
		int hi = numbers.length - 1;
		while (low <= hi) {
			int mid = low + (hi - low) / 2;
			if (number < numbers[mid])
				hi = mid - 1;
			else if (number > numbers[mid])
				low = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] numbers = new int[] { 45, 3, 4, 10, 15, 25, 78, 4, 5, 7 };
		int k;

		System.out.println("Position of 10: " + linearSearch(10, numbers));
		System.out.println("Position of 100: " + ((k = linearSearch(100, numbers)) != -1 ? k : "not found"));

		sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println();
		System.out.println("Position of 10: " + binarySearch(10, numbers));
		System.out.println("Position of 100: " + ((k = binarySearch(100, numbers)) != -1 ? k : "not found"));
	}

}
