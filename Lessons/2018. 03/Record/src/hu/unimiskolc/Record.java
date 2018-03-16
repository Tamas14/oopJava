package hu.unimiskolc;

public class Record {

	private String artist;
	private String title;
	private int length;

	public Record(String artist, String title, int length) {
		this.artist = artist;
		this.title = title;
		this.length = length;
	}

	public int compareLength(Record o) {
		if (this.length > o.length)
			return 1;
		else if (this.length < o.length)
			return -1;
		else
			return 0;
	}

	public boolean artistEquals(String artist) {
		return this.artist.equalsIgnoreCase(artist);
	}

	public String getArtist() {
		return artist;
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	@Override
	public String toString() {
		return artist + ": " + title + ", " + length + " perc";
	}

}
