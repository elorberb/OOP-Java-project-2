import java.util.Random;
import Turtle.*;

public class DrunkTurtle extends Turtle {

	public DrunkTurtle() {// constructor
		super();
	}

	public void moveForward(double distance) {// move drunk
		Random rand = new Random();
		double firstMove = Math.random() * distance; // random distance
		super.moveForward(firstMove);// using Turtle move forward
		int chance = rand.nextInt(100);// random chance
		if (chance < 45) {// by 45 percent
			super.turnLeft((int) distance);// turn left by distance size
		}
		double secondMove = Math.random() * (distance / 2);// random distance
		super.moveForward(secondMove);// using Turtle move forward
	}

	protected void moveSober(double distance) { // move sober
		super.moveForward(distance);// using Turtle move forward
	}

	public void turnLeft(int degrees) {// turning left drunk
		Random rand = new Random();
		int drunkAngle = (int) (rand.nextInt(degrees) * 1.5);// random angle
		super.turnLeft(drunkAngle);
	}

	public void turnRight(int degrees) { // turning right drunk
		Random rand = new Random();
		int drunkAngle = (int) (rand.nextInt(degrees) * 1.5);// random angle
		super.turnRight(drunkAngle);
	}

	protected void turnLeftSober(int degrees) { // turning left sober
		super.turnLeft(degrees);
	}

	protected void turnRightSober(int degrees) { // turning right sober
		super.turnRight(degrees);
	}

}
