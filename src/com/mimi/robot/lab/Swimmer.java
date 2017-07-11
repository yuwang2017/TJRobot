package com.mimi.robot.lab;
	//Name______________________________ Date_____________
   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   public class Swimmer extends Robot implements Runnable
   {
      public Swimmer(int x)
      {
         super(x, 1, Display.NORTH, 0);
      }
      public void run() //not swim
      {
    	  while(this.getY()<10) {
	    	  int delay = (int)(Math.random() * 500);
	    	  try {
	    		  Thread.sleep(delay);
	    	  } catch (Exception e) {
	    		  
	    	  }
	    	  this.move();
    	  }
      }
   }