
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		
		Robot tort = new Robot();
		
		
		for(int i = 0; i< 99999; i++){
			
			String tortC = JOptionPane.showInputDialog("what color do you want to draw in. blue, green, or orange");
		
		
		tort.penDown();
		tort.setPenWidth(10);
		tort.setSpeed(10);

		if (tortC.equals("blue")) {
			tort.setPenColor(Color.blue);

		} else if (tortC.equals("orange")) {

			tort.setPenColor(Color.orange);

		} else if (tortC.equals("green")) {

			tort.setPenColor(Color.green);

		} else {

			tort.setRandomPenColor();
		}

		tort.move(300);
		tort.turn(360 / 3);
		tort.move(2 * 380);
		tort.turn(30);
		tort.move(100);

		// 5. if the user doesn’t enter anything, choose a random color

		// 6. put a loop around your code so that you keep asking the user for
		// more colors & drawing them

		// 2. set the pen width to 10

		// 1. make the tortoise draw a shape (this will take more than one line
		}// of code)

	}}
	
