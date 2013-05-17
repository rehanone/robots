package com.example.robots;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final Plateau plateau = new Plateau(5, 5);

		final Robot robot = new Robot(1, 2, DirectionType.N, plateau);

		robot.left();
		robot.move();

		robot.left();
		robot.move();

		robot.left();
		robot.move();

		robot.left();
		robot.move();

		robot.move();
	}
}
