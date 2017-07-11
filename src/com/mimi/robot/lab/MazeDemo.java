package com.mimi.robot.lab;

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class MazeDemo {

	public static void main(String[] args) {
		Display.openWorld("maps/maze1.map");
		Robot mouse = new Robot(1, 1, Display.EAST, 0);
		
		//This mouse will try to found a beeper
		int backward = Display.WEST;
		while(!mouse.hasBeepers()) {
			if(mouse.nextToABeeper()) {
				mouse.pickBeeper();
			}
			//Start probe 
			if(mouse.frontIsClear()) {
				if(backward != mouse.getDirection()) {
					mouse.move();
					backward  = getBackwardDirection(mouse.getDirection());
				}
			}
		
			mouse.turnLeft();
		}

	}
	
	public static int getBackwardDirection(int d) {
		switch(d) {
			case Display.EAST:
				return Display.WEST;
			case Display.WEST:
				return Display.EAST;
			case Display.NORTH:
				return Display.SOUTH;
			case Display.SOUTH:
				return Display.NORTH;				
		}
		return Display.EAST;
	}

}
