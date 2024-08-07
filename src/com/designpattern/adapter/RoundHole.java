package com.designpattern.adapter;

public class RoundHole {

	private double radius;

	public RoundHole(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public boolean isFits(RoundPeg peg) {
		return this.radius >= peg.getRadius();
	}
}
