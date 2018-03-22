package hu.unimiskolc;

import java.util.Random;
import java.util.Scanner;

public class Main {

	// public static void main(String[] args) {
	// Rectangle a = new Rectangle(10);
	// Rectangle b = new Rectangle(5, 6);
	// Rectangle c = a;
	//
	// System.out.println(a.toString());
	// System.out.println(b.toString());
	// System.out.println(c.toString());
	// System.out.println();
	//
	// a.setSides(4, 3);
	// System.out.println(a.toString());
	// System.out.println(b.toString());
	// System.out.println(c.toString());
	// System.out.println();
	//
	// a.setSides(5, 6);
	// System.out.println(a == b);
	// System.out.println(a == c);
	// System.out.println(a.compareSides(b));
	// }

	public static void main(String[] args) {
		Rectangle[] rects = new Rectangle[10];
		Random r = new Random();

		// Filling up the array
		for (int i = 0; i < 10; i++) {
			rects[i] = new Rectangle(r.nextInt(9) + 2, r.nextInt(9) + 2);
			System.out.println(rects[i].toString());
		}

		// Find the smallest rectangle
		int min = 0;
		for (int i = 1; i < 10; i++) {
			if (rects[min].getArea() > rects[i].getArea())
				min = i;
		}

		System.out.println("Smallest rectangle: " + rects[min].toString());

		// Create a new rectangle, count smaller ones
		Scanner s = new Scanner(System.in);
		Rectangle rect;
		int a, b;

		System.out.print("Side a: ");
		a = Integer.parseInt(s.nextLine());

		System.out.print("Side b: ");
		b = Integer.parseInt(s.nextLine());

		s.close();
		rect = new Rectangle(a, b);

		int counter = 0;
		for (int i = 0; i < 10; i++) {
			if (rects[i].getArea() < rect.getArea())
				counter++;
		}

		System.out.println("Smaller ones: " + counter);

		// Search for the same rectangle
		boolean found = false;
		int i = 0;
		while (!found && i < rects.length) {
			if (rects[i].compareSides(rect))
				found = true;
			else
				i++;
		}

		if (found)
			System.out.println("Same rectangle's index: " + i);
		else
			System.out.println("Not found");
	}

}
