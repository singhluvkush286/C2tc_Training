package com.tns.abstraction;

public class Square extends Shape {

	private float side;
	public Square()
	{
		side=2.0f;
		
	}
	public Square(float side)
	{
		this.side=side;
	}
	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		super.area=side*side;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
}