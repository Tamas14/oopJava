package hu.unimiskolc;

public class NumberOutOfRangeException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String le, he;
	private boolean cl, ch;
	
	public NumberOutOfRangeException(double le, double he, boolean cl, boolean ch) {
		this.le = le + "";
		this.he = he + "";
		this.cl = ch;
		this.ch = ch;
	}
	
	public NumberOutOfRangeException(String le, String he, boolean cl, boolean ch) {
		this.le = le;
		this.he = he;
		this.cl = ch;
		this.ch = ch;
	}
	
	public String getRange()
	{
		return ((cl) ? "[" : "(") + ((le == "INF") ? "-∞" : le) + ", " + ((he == "INF") ? "∞" : he) + ((ch) ? "]" : ")");
	}

}
