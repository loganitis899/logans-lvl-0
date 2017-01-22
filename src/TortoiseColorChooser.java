
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class TortoiseColorChooser {
	public static void main(String[] args) {
		 Robot tort = new Robot();
		//3. ask the user what color they would like the tortoise to draw
	String tortC = JOptionPane.showInputDialog("what color do you want to draw in. blue, green, or orange");
		//4. use an if/else statement to set the pen color that the user requested
if(tortC.equals("blue")){
	tort.setPenWidth(10);
	tort.setPenColor(Color.blue);
	tort.setSpeed(10);
	tort.move(15);
	tort.turn(360/3);
	tort.move(2*3);
	tort.turn(360/50);
}


//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them

		//2. set the pen width to 10

		
	//1. make the tortoise draw a shape (this will take more than one line of code)

}
	}



