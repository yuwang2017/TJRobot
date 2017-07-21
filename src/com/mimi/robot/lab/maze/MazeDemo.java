package com.mimi.robot.lab.maze;

import java.util.HashMap;

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class MazeDemo {
	
	static HashMap<String, MazePoint> points = new HashMap<String, MazePoint>();
	
	public static void main(String[] args) {
		Display.openWorld("maps/maze1.map");
		Robot mouse = new Robot(1, 1, Display.EAST, 0);
		
		//This mouse will try to found a beeper
		int backward = Display.WEST;
		while(!mouse.hasBeepers()) {
			if(mouse.nextToABeeper()) {
				mouse.pickBeeper();
			}
			//Start probe, the logic is, 
			//At any given point, robot survey its
			//surroundings and memorize it, 
			
			
			
			if(mouse.frontIsClear()) {
				if(backward != mouse.getDirection()) {
					mouse.move();
					backward  = getBackwardDirection(mouse.getDirection());
				}
			}
		
			mouse.turnLeft();
		}

	}
	
	public
	
	
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
