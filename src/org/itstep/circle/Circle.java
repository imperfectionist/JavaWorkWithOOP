package org.itstep.circle;

import org.itstep.AbstractShape;

//import org.itstep.AbstractShape;

public class Circle extends AbstractShape {
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {

	}

	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}

}
