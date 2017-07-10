import edu.fcps.karel2.Display;
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
			if(isValidMove(spider)) {
				spider.move();
				turnToDirection(spider, getRandomDirection());
			} else {
				turnToDirection(spider, getRandomDirection());
			}			
		}
	}
	
	public static void turnToDirection(Robot robot, int direction) {
		while(robot.getDirection()!=direction) {
			robot.turnLeft();
		}
	}
	
	/*
	 * Base on current robot direction, check if
	 * next move if valid.
	 */
	public static boolean isValidMove(Robot robot) {
		
		int x = robot.getX();
		int y = robot.getY();
		
		//Make sure the next move won't out
		//of bound to the east
		if(robot.facingEast()) {
			if(x + 1 < 10) {
				return true;
			}
		}
		
		//Make sure the next move won't hit
		//the wall to the west
		if(robot.facingWest()) {
			if(x - 1 > 0) {
				return true;
			}
		}		
		
		//Make sure the next move won't hit
		//the wall to the south
		if(robot.facingSouth()) {
			if(y - 1 > 0) {
				return true;
			}
		}		
		
		//Make sure the next move won't out
		//of the bound to the north
		if(robot.facingNorth()) {
			if(y + 1 < 10) {
				return true;
			}
		}			
		return false;
	}
	
	
	public static int getRandomDirection() {
		int num = (int)(Math.random() * 100) % 4;
		int d = Display.EAST;
		
		switch( num ) {
			case 1: 
				d = Display.SOUTH;
				break;
			case 2:
				d = Display.NORTH;
				break;
			case 3:
				d = Display.WEST;
				break;
			default:
				d = Display.EAST;
		}		

		return d;			
	}
}
