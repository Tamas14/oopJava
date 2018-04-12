package hu.unimiskolc.place;

import hu.unimiskolc.person.Seller;

public class Property implements Seller
{
	private int price;
	private String currency;
	int size; // m^2
	String city;

	/**
	 * @param price
	 * @param currency
	 * @param size
	 * @param city
	 */
	public Property(int price, String currency, int size, String city)
	{
		this.price = price;
		this.currency = currency;
		this.size = size;
		this.city = city;
	}

	public int squareMeterPrice()
	{
		return price / size;
	}

	public static double toEuro(int price)
	{
		double eur = 0.00321205396;

		return eur * price;
	}

	@Override
	public int getPrice()
	{
		return price;
	}

	@Override
	public String getCurrency()
	{
		return currency;
	}

	@Override
	public void setPrice(int price)
	{
		this.price = price;
	}

	@Override
	public void setCurrency(String currency)
	{
		this.currency = currency;
	}

	@Override
	public String toString()
	{
		return this.city + " " + this.size + " " + this.price + " " + currency;
	}

}
