package hu.unimiskolc.person;

public interface Seller
{
	int defPrice = 1;
	String defCurrency = "Ft";
	
	public int getPrice();
	
	public String getCurrency();
	
	public void setPrice(int price);
	
	public void setCurrency(String currency);
}
