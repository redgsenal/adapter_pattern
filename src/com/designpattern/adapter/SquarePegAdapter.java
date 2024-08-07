package com.designpattern.adapter;

public class SquarePegAdapter extends RoundPeg {

	private SquarePeg peg;

	public SquarePegAdapter(SquarePeg peg) {
		super(peg.getWidth() * Math.sqrt(2) / 2);
		this.peg = peg;
	}

	public double getRadius() {
		return peg.getWidth() * Math.sqrt(2) / 2;
	}
}
