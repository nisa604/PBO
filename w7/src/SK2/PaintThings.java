package SK2;

import java.text.DecimalFormat;

public class PaintThings {
	public static void main(String[] args) {
		final double COVERAGE = 350;
		Paint paint = new Paint(COVERAGE);
		
		rectangle deck;
		sphere bigBall;
		Cylinder tank;
		
		double deckAmt, ballAmt, tankAmt;
		
		DecimalFormat fmt = new DecimalFormat("0.#");
		System.out.println("\nNumber of gallons of paint needed . . .");
		System.out.println("Deck" + fmt.format(deckAmt));
		System.out.println("Big Ball" + fmt.format(ballAmt));
		System.out.println("Tank" + fmt.format(tankAmt));
	}
}
