import javax.swing.JOptionPane;

public class adlibs {
	public static void main(String[] args) {
		String ad = JOptionPane.showInputDialog("give me an adjective.");
		String now = JOptionPane.showInputDialog("give me a noun.");
		String ver = JOptionPane.showInputDialog("give me a verb");
		JOptionPane.showMessageDialog(null, ad + "\n " + now + "\n" + ver);

	}

}
