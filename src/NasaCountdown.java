import javax.swing.JOptionPane;

public class NasaCountdown {
	public static void main(String[] args) {
		// 2. ask the user when to start (JOptionPane.showInputDialog)
		// 3. convert the user's answer to an int (Integer.parseInt)

		// 4. countdown from user's starting point
String s = JOptionPane.showInputDialog("what number should we count off from?");
int ss = Integer.parseInt(s);
for(int i= ss; i>=0; i--){

	speak(Integer.toString(i));
}
JOptionPane.showMessageDialog(null, "blastoff");
		// 5. when the counting is done, print "blastoff!"
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}


