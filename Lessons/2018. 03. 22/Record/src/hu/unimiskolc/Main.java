package hu.unimiskolc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		Record[] records;

		System.out.print("Records count: ");
		count = Integer.parseInt(s.nextLine());

		records = new Record[count];

		String artist, title;
		int length;

		for (int i = 0; i < count; i++) {
			System.out.print("[" + (i + 1) + "] Artist: ");
			artist = s.nextLine();
			System.out.print("[" + (i + 1) + "] Title: ");
			title = s.nextLine();
			System.out.print("[" + (i + 1) + "] Length: ");
			length = Integer.parseInt(s.nextLine());

			records[i] = new Record(artist, title, length);
		}

		int max = 0;
		for (int i = 0; i < count; i++) {
			if (records[max].getLength() < records[i].getLength())
				max = i;
		}

		System.out.println("Longest record: " + records[max].toString());

		System.out.print("Search artist's records: ");
		String srcArtist = s.nextLine();

		for (int i = 0; i < count; i++) {
			if (records[i].artistEquals(srcArtist))
				System.out.println(records[i].toString());
		}

		s.close();

	}

}
