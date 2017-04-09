
import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100);
		random = random + 1;
		int count = 0;
		// 2. Print out the random variable above

		// 11. do the following 10 times

		int guess; // 1. ask the user for a guess using a pop-up window, and save their response
		String guesSS = null;
		for (int i = 0; i < 11; i++) {

			guesSS = JOptionPane.showInputDialog("make a guess of the number im thinking of. its 1-100");
			try {
				guess = Integer.parseInt(guesSS);
				if (guess == random) {
					JOptionPane.showMessageDialog(null, "u win...");
					System.exit(0);
				} else if (guess > random) {
					JOptionPane.showMessageDialog(null, "ur guess was to high.");
				} else if (guess < random) {
					JOptionPane.showMessageDialog(null, "Your guess was to low. ");

				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "not a #");
			}

			// 9. if the guess is low
			// 10. tell them it's too low

			// 12. tell them they lose

		}
		JOptionPane.showMessageDialog(null, "u lose");
	}
}
