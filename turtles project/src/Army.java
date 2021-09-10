import java.util.Scanner;

import Turtle.*;

public class Army {

	public static void main(String[] args) {

		Turtle[] playerArmy = new Turtle[5];
		buildArmy(playerArmy);
		setInLine(playerArmy);
		tailDownForAll(playerArmy);
		allMoveTogether(playerArmy, 65);
		allTurnLeft(playerArmy);
		allMoveTogether(playerArmy, 75);
		allDraw(playerArmy);
		allHide(playerArmy);
		System.exit(1);

	}

	private static void buildArmy(Turtle[] army) {// build the army
		Scanner sc = new Scanner(System.in);
		printMenu(); // print menu
		for (int i = 0; i < 5; i++) { // choosing turtles with if statements
			int choice = sc.nextInt();// player pick
			if (choice == 1) {
				army[i] = new Turtle();
			}
			if (choice == 2) {
				army[i] = new SmartTurtle();
			}
			if (choice == 3) {
				army[i] = new DrunkTurtle();
			}
			if (choice == 4) {
				army[i] = new JumpyTurtle();
			}
			if (choice == 5) {
				army[i] = new BoxTurtle();
			}
			if (choice == 6) {
				army[i] = new GrumpyTurtle();
			}

		}
	}

	private static void printMenu() { // print the menu
		System.out.println("Choose the type of a turtle:");
		System.out.println("1. Simple");
		System.out.println("2. Smart");
		System.out.println("3. Drunk");
		System.out.println("4. Jumpy");
		System.out.println("5. Box");
		System.out.println("6. Grumpy");
	}

	private static void setInLine(Turtle[] army) { // set in line all turtles
		int distance = 120;
		for (int i = 0; i < 5; i++) {
			army[i].tailUp(); // tail up for current turtle
			if (army[i] instanceof DrunkTurtle) {
				lineDrunkTurtle((DrunkTurtle)army[i], distance);// line current drunk turtle
			}
			else {
				lineTurtle(army[i], distance); // line current turtle
			}
			distance += 120;// increase distance by 120
		}
	}

	private static void tailDownForAll(Turtle[] army) {// tail down for all turtles
		for (int i = 0; i < 5; i++) {
			army[i].tailDown();
		}
	}

	private static void allMoveTogether(Turtle[] army, int distance) { // all turtles move together
		for (int i = 0; i < 5; i++) {
			army[i].moveForward(distance);// using each turtle move forward method
		}
	}

	private static void allTurnLeft(Turtle[] army) { // all turn left together
		for (int i = 0; i < 5; i++) {
			army[i].turnLeft(40);// using each turtle turn left method
		}
	}

	private static void allDraw(Turtle[] army) { // all draw together

		for (int i = 0; i < 5; i++) {
			if (army[i] instanceof SmartTurtle) {
				((SmartTurtle) army[i]).draw(6, 40);// Because only smart turtle draw
			}
		}
	}
	
	private static void lineDrunkTurtle (DrunkTurtle drunky, int distance) {// Lining drunk turtles
		drunky.turnRightSober(90);
		drunky.moveSober(distance);
		drunky.turnLeftSober(90);
	}
	
	private static void lineTurtle ( Turtle turtle , int distance) { // Lining turtles
		turtle.turnRight(90);
		turtle.moveForward(distance);
		turtle.turnLeft(90);
	}

	private static void allHide(Turtle[] army) { // hiding all turtles
		for (int i = 0; i < 5; i++) {
			army[i].hide();
		}
	}

}
