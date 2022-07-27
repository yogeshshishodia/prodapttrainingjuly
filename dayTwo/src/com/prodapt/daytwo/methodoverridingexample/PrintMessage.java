package com.prodapt.daytwo.methodoverridingexample;

//Child class or derived class
public class PrintMessage extends DisplayMessage{
	//overridden method
	public void displayMessageWithExtraGreetings(String message) {
		System.out.println("Bad to know that you are notorious--"+message);
	}
	
	public String returnMessage() {
		return "How to spend the first salary?";
	}
	public String returnMessage(String message) {
		return "How to spend the first salary?"+message;
	}
}	
