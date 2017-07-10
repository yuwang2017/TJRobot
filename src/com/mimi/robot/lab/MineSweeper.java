package com.mimi.robot.lab;
import com.mimi.robot.util.RobotUtil;

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

/*
 * The first robot mine the field with 20 
 * randomly set beepers. The second robot 
 * sweep the field and create a clear path
 * 
 */
public class MineSweeper {

	public static void main(String[] args) {
		mine();
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			
			
		}
		sweep();
	}
	
	
	public static void sweep() {
		Robot sapper = new Robot(1, 1, Display.EAST, 0);
		
		int x = sapper.getX();
		int y = sapper.getY();
		
		while(x<10 && y<10) {
			if(sapper.nextToABeeper()) {
				sapper.pickBeeper();
			}
			RobotUtil.turnToDirection(sapper, Display.EAST);
			sapper.move();
			if(sapper.nextToABeeper()) {
				sapper.pickBeeper();
			}
			RobotUtil.turnToDirection(sapper, Display.NORTH);
			sapper.move();
			x = sapper.getX();
			y = sapper.getY();
		}
		
	}
	
	public static void mine() {
		
		Robot miner = new Robot(4, 4, Display.EAST, 30);
		
		while(miner.hasBeepers()) {
			
			//Check if next move is valid
			if(RobotUtil.isValidMove(miner)) {
				miner.move();
				RobotUtil.turnToDirection(miner, RobotUtil.getRandomDirection());
				if(!miner.nextToABeeper()) {
					miner.putBeeper();
				}
			} else {
				RobotUtil.turnToDirection(miner, RobotUtil.getRandomDirection());
				if(RobotUtil.isValidMove(miner)) {
					miner.move();
				}
			}			
		}
		
	}
	
}
