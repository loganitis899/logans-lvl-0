package broken;

/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Circle Ring
 *    Duration=.5
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=nested for loops
 *  
 ******************************************************************************/

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
    public static void main(String[] args) throws Exception {

        // 1. Make a new Robot
Robot tort=new Robot();

       //  2. Set your robot’s position to x=150 and y=200

        // 3. Put the robot's pen down

tort.setX(150);
tort.setY(200);
tort.penDown();
tort.setSpeed(10);

        // 4. Set the robot’s speed to 10
for(int i=0;i<260;i++){
	tort.move(3);
	tort.turn(1);
	if(i%20==0){
		for(int j=0;j<360;j++){
		tort.move(1);
		tort.turn(1);
	}}
}
        // 5. Do everything below here 360 times (use i as the counter)

	        // 6. Move the robot 3 pixels

       //  7. Turn the robot 1 degree

        // 8. If the counter i is divisible by 20 (hint: use mod operator  %)


        // 9. Do steps 10 thru 12, 360 times (use j as the counter)

		        // 10. Move the robot 1 pixel

		        // 11. Turn the robot 1 degree
}
}