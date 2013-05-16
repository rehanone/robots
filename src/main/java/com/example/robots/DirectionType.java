package com.example.robots;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public enum DirectionType {
	N(0),
	E(1),
	S(2),
	W(3);
	
	private final Integer value;

	private static final Map<Integer, DirectionType> map =
            new HashMap<Integer, DirectionType>();

	static {
		for (DirectionType type : DirectionType.values()) {
			map.put(type.value, type);
		}
	}

	private DirectionType(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public static DirectionType fromInt(Integer val) {
		if (map.containsKey(val)) {
			return map.get(val);
		}
		throw new NoSuchElementException(val + "not found");
	}
}
