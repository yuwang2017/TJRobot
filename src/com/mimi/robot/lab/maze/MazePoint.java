package com.mimi.robot.lab.maze;

import java.util.ArrayList;
import java.util.List;

/*
 * This class hold the map point that robot
 * passed
 */
		

public class MazePoint {
	
	private int x = 0;
	private int y = 0;
	
	private boolean deadend = false;
	
	
	
	//The branches that lead to a dead end;
	private List<MazePoint> deadroutes = new ArrayList<MazePoint>();
	
	//The branched that lead to potential exit
	private List<MazePoint> exits = new ArrayList<MazePoint>();
	
	public MazePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getKey() {
		return "" + this.x + "-" + this.y;
	}
	
	/*
	 * 
	 */
	public boolean isDeadend() {
		return deadend;
	}
	
	
	public boolean equals(MazePoint p) {
		return this.x == p.getX() && this.y == p.getY();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	public List<MazePoint> getDeadroutes() {
		return deadroutes;
	}


	public void setDeadroutes(List<MazePoint> deadroutes) {
		this.deadroutes = deadroutes;
	}


	public void setDeadend(boolean deadend) {
		this.deadend = deadend;
	}


	public List<MazePoint> getExits() {
		return exits;
	}

	public void setExits(List<MazePoint> exits) {
		this.exits = exits;
	}
	
	
	
	

}
