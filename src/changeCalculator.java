import javax.swing.JOptionPane;

public class changeCalculator {
public static void main(String[] args) {
	
	String nix = JOptionPane.showInputDialog("how many nickles you have?");
	String dime = JOptionPane.showInputDialog("how many dimes you have?");
	String quarter = JOptionPane.showInputDialog("how many quarters you have?");
	int nixx = Integer.parseInt(nix);
	int dimee = Integer.parseInt(dime);
	int quarterr = Integer.parseInt(quarter);
	double summ = .05 * nixx + .1 * dimee + .25 * quarterr;
	JOptionPane.showMessageDialog(null, "your sum is "+summ +" dollars");
}
}

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */

		// Ask the user how many nickels they have

		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have
