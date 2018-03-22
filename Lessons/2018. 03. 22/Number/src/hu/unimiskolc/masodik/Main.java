package hu.unimiskolc.masodik;

import java.util.Random;

import hu.unimiskolc.elso.Number;

public class Main {

	public static void main(String[] args) {
		final Number num = new Number(0.4653);

		Random r = new Random();
		float guess;
		int guesses = 0;

		while (true) {
			guess = r.nextFloat();
			guesses++;
			
			if (!num.hasLowerDiff(guess))
				System.out.println(guess + " " + (num.getNumber() - guess));
			else
				break;
		}
		
		System.out.println(guesses);
		
		num.setNumber(0.31441);
		
		/*The final local variable num cannot be assigned.
		num = new Number(0.12312312);
		*/
	}

}
