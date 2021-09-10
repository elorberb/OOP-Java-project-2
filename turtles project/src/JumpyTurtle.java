
public class JumpyTurtle extends SmartTurtle {
	private boolean isTailUp = false; // boolean that tells if tail is up

	public JumpyTurtle() { // constructor
		super();
		isTailUp = false; // default mode tail is down
	}

	public void tailDown() { // tail down
		isTailUp = false;
		super.tailDown();
	}

	public void tailUp() { // tail up
		isTailUp = true;
		super.tailUp();
	}

	public void moveForward(double distance) { // how jumpyTurtle moves
		if (!isTailUp) { // if the tail is down
			jumpyMove(distance); // jumpy move
		} else {
			super.moveForward(distance); // move regularly
		}
	}

	public void draw(int sides, double size) {// draw a polygon in the given sides and size

		int angleSize = getPolygonAngle(sides);
		if (!isTailUp) { // if tail is up jumpy draw
			for (int i = 0; i < sides; i++) {
				jumpyMove(size);
				turnLeft(angleSize);
			}
		} else {
			super.draw(sides, size); // using SmartTurtle draw method
		}
	}

	private void jumpyMove(double distance) { // jumpy move
		double currentSize = distance;
		int tail = 0; //
		while (currentSize >= 0) { // runs until distance is over
			if (tail % 2 == 0) { // if tail is even tail down
				super.tailDown();
			} else {// else tail up
				super.tailUp();
			}
			super.moveForward(5);
			currentSize -= 5; // downsize by 5
			tail++;
		}
	}
}
