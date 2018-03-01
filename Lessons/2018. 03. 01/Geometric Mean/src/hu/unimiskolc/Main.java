package hu.unimiskolc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double[] arr = new double[10];
		Scanner s = new Scanner(System.in);

		System.out.println("Elements of the array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + ": ");
			arr[i] = s.nextDouble();
		}
		
		s.close();
		
		System.out.println("Geometric mean: " + mean(arr));
	}

	public static double mean(double[] arr) {
		double multiplication = 1;
		for (int i = 0; i < arr.length; i++) {
			multiplication *= arr[i];
		}

		return Math.pow(multiplication, 1.0 / arr.length);
	}

}
