import java.util.Random;

import Turtle.*;

public class GrumpyTurtle extends DrunkTurtle {

	public GrumpyTurtle() {// constructor
		super();
	}

	public void moveForward(int distance) { // move grumpy
		Random rand = new Random();
		int chance = rand.nextInt(100);// random chance
		if (chance < 50) { // by 50 percent
			super.moveForward(distance); // using DrunkTurtle move forward (drunk move)
		} else {
			turnLeftSober(180);// turn around
		}
	}

}
