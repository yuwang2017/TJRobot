package com.mimi.robot.lab;
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab00 {

	public static void main(String[] args) {
		Robot gorge = new Robot(4, 4, Display.EAST, 10);
		
		gorge.move();
		gorge.move();
		
		gorge.turnLeft();
		
		gorge.move();
		gorge.move();
		
		gorge.putBeeper();
		boolean turnLeft = true;
		while (gorge.hasBeepers()) {
			gorge.move();
			if(!gorge.nextToABeeper()) {
				gorge.putBeeper();
		
				if(turnLeft) {
				gorge.turnLeft();
			} else {
				gorge.move();
			}
			}
			turnLeft = !turnLeft;
		}		
	}
	
}
