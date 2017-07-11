package com.mimi.robot.lab;

import edu.fcps.karel2.Robot;

public class Athlete extends Robot {
	
	public Athlete( ) {
		super();
	}
	
	public Athlete(int x, int y, int direction, int beepers) {
		super(x, y, direction, beepers);
	}
	
	public void turnAround() {
		this.turnLeft();
		this.turnLeft();
	}
	
	public void turnRight() {
		this.turnLeft();
		this.turnLeft();
		this.turnLeft();
	}

}
