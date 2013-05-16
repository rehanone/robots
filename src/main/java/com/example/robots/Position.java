package com.example.robots;

public class Position {
	private int x = 0;
	private int y = 0;
	
	private DirectionType directionType;

	public Position(int x, int y, DirectionType directionType) {
		super();
		this.x = x;
		this.y = y;
		this.directionType = directionType;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public DirectionType getDirectionType() {
		return directionType;
	}

	public void setDirectionType(DirectionType directionType) {
		this.directionType = directionType;
	}
}
