package com.example.robots;

public class Plateau {
	private final int gridX;
	private final int gridY;

	public Plateau(final int gridX, final int gridY) {
		super();
		this.gridX = gridX;
		this.gridY = gridY;
		System.out.println(String.format("Setting Plateau: (%d, %d)", gridX, gridY));
	}

	public int getGridX() {
		return gridX;
	}

	public int getGridY() {
		return gridY;
	}
}
