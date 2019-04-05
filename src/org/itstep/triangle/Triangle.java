package org.itstep.triangle;

import org.itstep.AbstractShape;

public class Triangle extends AbstractShape {

	private double side;
	private double height;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Triangle(double side, double height) {
		super();
		this.side = side;
		this.height = height;
	}
	
	public Triangle() {
	}

	@Override
	public double getArea() {
		return side*height/2;
	}
}
