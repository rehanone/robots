package com.example.robots;

public class Robot {
	private final Plateau plateau;

	private final Position pos;

	public Robot(final int x, final int y, final DirectionType directionType, final Plateau plateau) {
		super();
		this.plateau = plateau;
		pos = new Position(x, y, directionType);
	}

	public Position getPosition() {
		return pos;
	}

	public Position right() {
		final DirectionType oldDir = pos.getDirectionType();
		int val = oldDir.getValue() + 1;
		if (val > 3) {
			val = 0;
		}
		final DirectionType newDir = DirectionType.fromInt(val);
		System.out.println(String.format("Turning right from %s. new Position (%d, %d, %s)", oldDir, pos.getX(),
				pos.getY(), newDir));
		pos.setDirectionType(newDir);
		return pos;
	}

	public Position left() {
		final DirectionType oldDir = pos.getDirectionType();
		int val = oldDir.getValue() - 1;
		if (val < 0) {
			val = 3;
		}
		final DirectionType newDir = DirectionType.fromInt(val);
		System.out.println(String.format("Turning left from %s. new Position (%d, %d, %s)", oldDir, pos.getX(),
				pos.getY(), newDir));
		pos.setDirectionType(newDir);
		return pos;
	}

	public Position move() {
		int x = pos.getX();
		int y = pos.getY();
		final DirectionType dir = pos.getDirectionType();

		switch (dir) {
		case N:
			y = (y < plateau.getGridY()) ? y + 1 : y;
			break;
		case E:
			x = (x < plateau.getGridX()) ? x + 1 : x;
			break;
		case S:
			y = (y > 0) ? y - 1 : y;
			break;
		case W:
			x = (x > 0) ? x - 1 : x;
			break;
		default:
			break;
		}
		System.out.println(String.format("Moving from (%d, %d, %s) to new Position (%d, %d, %s)", pos.getX(),
				pos.getY(), dir, x, y, dir));
		pos.setX(x);
		pos.setY(y);
		return pos;
	}
}
