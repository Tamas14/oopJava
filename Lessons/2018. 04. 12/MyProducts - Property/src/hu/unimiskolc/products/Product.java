package hu.unimiskolc.products;

import hu.unimiskolc.person.Seller;

public abstract class Product implements Seller
{
	private String name;
	protected int price;
	protected String currency;
	private int tax;
	
	/**
	 * 
	 * @param name
	 * @param price
	 * @param tax
	 */
	public Product(String name, int price, int tax)
	{
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public int getGross()
	{
		return (int) Math.round(price * (1 + (tax / 100.0)));
	}

	public void incPrice(int percent)
	{
		this.price *= 1 + (percent / 100.0);
	}

	public int compPrice(Product p)
	{
		if (this.price > p.getPrice())
			return 1;
		if (this.price < p.getPrice())
			return -1;

		return 0;
	}

	@Override
	public String toString()
	{
		return this.name + " " + getGross();
	}

}
