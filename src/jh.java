package broken;

import javax.swing.JOptionPane;

public class jh {
public static void main(String[] args) {
	String burf=JOptionPane.showInputDialog("when is ur burfday?");
	if(burf.equals("may 8")){
		System.out.println("merry burfday");
	}else {
		System.out.println("merry unburfday");
	}
}
}
