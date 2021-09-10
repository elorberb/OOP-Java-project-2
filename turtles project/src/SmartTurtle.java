
import Turtle.*;

public class SmartTurtle extends Turtle {

	public SmartTurtle() {// constructor
		super();
	}

	public void draw(int sides, double size) { // draw a polygon in the given sides and size
		int angleSize = getPolygonAngle(sides);// gets angle size
		for (int i = 0; i < sides; i++) { // rounds by the number of sides
			moveForward(size);
			turnLeft(angleSize);
		}
	}

	protected int getPolygonAngle(int sides) { // calculate polygon angle
		return 360 / sides;
	}

	public void moveForward(double distance) { // move normally
		super.moveForward(distance);
	}

	public void tailDown() { // tail down
		super.tailDown();
	}

	public void tailUp() { // tail up
		super.tailUp();
	}

}
