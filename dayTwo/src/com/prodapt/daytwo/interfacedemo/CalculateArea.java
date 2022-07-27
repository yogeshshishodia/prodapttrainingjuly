package com.prodapt.daytwo.interfacedemo;

public interface CalculateArea {
	//method declaration by default its an abstract method
	public int calculateArea(int length,int breadth);
	default int calculatePermiter(int length,int breadth) {
		return length+breadth;
	}
}
