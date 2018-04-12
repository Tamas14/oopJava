package hu.unimiskolc.test;

import hu.unimiskolc.Cuboid;
import hu.unimiskolc.Cylinder;

public class Main
{
	public static void main(String[] args)
	{
		Cylinder cy = new Cylinder(10, 5);
		
		System.out.println(cy.toString() + " Volume: " + cy.getVolume());
		
		Cuboid cu = new Cuboid(6, 4, 5);
		
		System.out.println(cu.toString() + " Volume: " + cu.getVolume());
		
		if(cy.biggerThan(cu))
			System.out.println("The cylinder is bigger");
		else
			System.out.println("The cuboid is bigget");
	}
	
}
