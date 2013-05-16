package com.example.robots;

public class Robot {
	private Position pos;

	public Robot(int x, int y, DirectionType directionType) {
		super();
		pos = new Position(x, y, directionType);
	}

	public Position getPosition(){
		return pos;
	}
	
	public Position right() {
		int val = pos.getDirectionType().getValue() + 1;
		if (val > 3){
			val = 0;
		}
		pos.setDirectionType(DirectionType.fromInt(val));
		return pos;
	}

	public Position left() {
		int val = pos.getDirectionType().getValue() - 1;
		if (val < 0){
			val = 3;
		}
		pos.setDirectionType(DirectionType.fromInt(val));
		return pos;
	} 
}
