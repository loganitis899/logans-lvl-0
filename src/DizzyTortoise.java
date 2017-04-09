
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {

		// 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
		int dizzzy;
		try {
			dizzzy = Integer.parseInt(JOptionPane.showInputDialog("how much do you want the tortoice to be dizzy. 1-10"));
			dance(dizzzy);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "dats snot a #");
		}

		// 1. Use the dance method to make the Tortoise spin.

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
