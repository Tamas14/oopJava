package hu.unimiskolc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person p = new Person();
		Scanner s = new Scanner(System.in);

		System.out.print("Name: ");
		p.setName(s.nextLine());

		System.out.print("Height (m): ");
		p.setHeight(Double.parseDouble(s.nextLine()));

		System.out.print("Weight (kg): ");
		p.setWeight(Integer.parseInt(s.nextLine()));

		s.close();
		System.out.println(p.toString());
	}

}
