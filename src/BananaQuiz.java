
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		String may = JOptionPane.showInputDialog("Do u like bananas?");
		if (may.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "ur crazy :P");
		} else if (may.equalsIgnoreCase("yes")) {
			String hobby = JOptionPane.showInputDialog("wuts ur favorite hobby?");
			JOptionPane.showMessageDialog(null, hobby + " is much better with bananas.");
		} else {
			JOptionPane.showMessageDialog(null, "your bananas.");
		}

	}

}
