package com.designpattern.adapter;

public class Main {
	public static void main(String[] args) {
		RoundHole hole = new RoundHole(5);
		RoundPeg rpeg = new RoundPeg(5);

		System.out.println(hole.isFits(rpeg)); // true

		SquarePeg small_sqpeg = new SquarePeg(5);
		SquarePeg large_sqpeg = new SquarePeg(10);
		// hole.isFits(small_sqpeg); // this won't compile (incompatible types)

		SquarePegAdapter small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg);
		SquarePegAdapter large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg);
		System.out.println(hole.isFits(small_sqpeg_adapter)); // true
		System.out.println(hole.isFits(large_sqpeg_adapter)); // false
	}
}
