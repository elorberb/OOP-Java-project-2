import Turtle.*;

public class TwoTurtles {

	private static void paintC(Turtle corona) { // painting c
		corona.turnLeft(90);
		corona.moveForward(100);
		corona.turnRight(90);
		corona.moveForward(100);
		corona.turnRight(90);
		corona.moveForward(100);
		corona.hide();
	}

	private static void paintV(Turtle virus) { // painting v
		virus.turnRight(90);
		virus.tailUp();
		virus.moveForward(100);
		virus.tailDown();
		virus.turnLeft(90);
		virus.turnLeft(30);
		virus.moveForward(100);
		virus.moveBackward(100);
		virus.turnRight(60);
		virus.moveForward(100);
		virus.moveBackward(100);
		virus.hide();
	}

	public static void main(String[] args) {

		Turtle corona = new Turtle(); // creating two turtles
		Turtle virus = new Turtle();

		paintC(corona); // painting on screen
		paintV(virus);

	}

}
