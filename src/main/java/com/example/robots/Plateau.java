package com.example.robots;

public class Plateau {
	private final int gridX;
	private final int gridY;
	
	private final Robot robot;

	public Plateau(int gridX, int gridY, Robot robot) {
		super();
		this.gridX = gridX;
		this.gridY = gridY;
		this.robot = robot;
	}

	public Position processCommand(CommandType commandType){
		switch(commandType){
			case M:
				return move();
			case L:
				return left();
			case R:
				return right();
			default:
				throw new RuntimeException("Unexpected command");
		}
	}

	private Position move() {
		Position pos = robot.getPosition();
		int x = pos.getX();
		int y = pos.getY();
		switch (pos.getDirectionType()){
		case N:
			y = (y < gridY) ? y + 1 : y;
			break;
		case E:
			x = (x < gridX) ? x + 1 : x;
			break;
		case S:
			y = (y > 0) ? y - 1 : y;
			break;
		case W:
			x = (x > 0) ? x + 1 : x;
			break;
		default:
			break;
		}
		pos.setX(x);
		pos.setY(y);
		return pos;
	}

	private Position right() {
		return robot.right();
	}

	private Position left() {
		return robot.left();
	}
}
