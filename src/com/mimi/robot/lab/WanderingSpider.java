package com.mimi.robot.lab;
import com.mimi.robot.util.RobotUtil;


import edu.fcps.karel2.Robot;

/*
 * Random Wandering on the 10 X 10 map. 
 * The robot move randomly and won't hit 
 * the wall of out of the 10X10 grid
 * 
 */
public class WanderingSpider {

	public static void main(String[] args) {
		
		//Create a robot.
		Robot spider = new Robot();
		
		while(true) {
			
			//Check if next move is valid
			if(RobotUtil.isValidMove(spider)) {
				spider.move();
				RobotUtil.turnToDirection(spider, RobotUtil.getRandomDirection());
			} else {
				RobotUtil.turnToDirection(spider, RobotUtil.getRandomDirection());
			}			
		}
	}
	

}
