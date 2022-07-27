package com.prodapt.daytwo.methodoverridingexample;
//Parent class
public class DisplayMessage {
	public void displayMessageWithExtraGreetings(String message) {
		System.out.println("Good to know that you all know core java--"+message);
	}
	
	public String returnMessage() {
		return "How to spend the first salary?";
	}
}
