package hu.unimiskolc;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[10];

		randomize(arr);
		print(arr);
		System.out.println("Max even number: " + arr[search(arr)]);
	}

	public static void randomize(int[] arr) {
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(50) + 1;
		}
	}

	public static void print(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(i + ": " + arr[i]);
		}
	}

	public static int search(int[] arr) {
		int max = 0;
		int index = -1;

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				if (arr[i] % 2 == 0) {
					index = i;
					max = arr[i];
				}
			}
		}

		return index;
	}

}
