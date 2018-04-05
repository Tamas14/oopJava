package hu.unimiskolc.products;

public class Bread extends Product
{
	private double quantity;

	/**
	 * 
	 * @param name
	 * @param price
	 * @param tax
	 * @param quantity
	 */
	public Bread(String name, int price, int tax, double quantity)
	{
		super(name, price, tax);

		this.quantity = quantity;
	}

	@Override
	public String toString()
	{
		return super.toString() + " " + quantity;
	}

	public double getQuantity()
	{
		return quantity;
	}

	public static boolean compPrice(Bread b1, Bread b2)
	{
		return b1.getPrice() > b2.getPrice();
	}

}
