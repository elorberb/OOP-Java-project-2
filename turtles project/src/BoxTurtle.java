import java.util.Random;

public class BoxTurtle extends SmartTurtle {

	public BoxTurtle() { // constructor
		super();
	}

	public void draw(int sides, double size) { // draw by box turtle

		Random rand = new Random();
		int chance = rand.nextInt(100); // random chance
		if (chance < 40) { // by 40 percent
			drawRectangle(size); // draw a rectangle
		} else {
			drawSquare(size); // else draw square and than draw normal polygon
			super.draw(sides, size);// using SmartTurtle draw method
		}
	}

	private void drawRectangle(double size) { // draw rectangle
		for (int i = 0; i < 4; i++) {
			if (i % 2 == 0) { // if i is even move double the size
				this.moveForward(size * 2);
				this.turnRight(90);
			} else {
				this.moveForward(size); // else move by the size
				this.turnRight(90);
			}
		}
	}

	private void drawSquare(double size) { // draw a square
		super.draw(4, size); // using SmartTurtle draw method

	}
}
