package com.kmp.test;

public class InchesToFeetConverter {
	private int inches;
	private int feet;
	private int rInches;
	public void SetInches(int inches)
	{
		this.inches=inches;
		Convert(inches);
	}
	public void Convert(int inches)
	{
		feet = inches/12;
		rInches = inches%12;
	}
	public String toString()
	{
		return feet+"ft"+"&"+rInches+"inches";
	}
}
