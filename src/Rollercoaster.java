import javax.swing.JOptionPane;

public class Rollercoaster {
	int max = 10;
	String name = "bunbun";
	Rollercoaster(String aName) {
		name = aName;
	}

	public static void main(String[] args) {
		int capasity = 3;

		Rollercoaster howlo = new Rollercoaster("uhh");
		for (int i = 0; i < capasity; i++) {
			String height = JOptionPane.showInputDialog("How tall are you in Inches?");

			int heet = 0;
			heet = Integer.parseInt(height);
			if (heet >= howlo.max) {
				JOptionPane.showMessageDialog(null, "You can ride this ride");
			} else {
				JOptionPane.showMessageDialog(null, "You're too short!");
				capasity = capasity + 1;
			}

		}

	}
}
