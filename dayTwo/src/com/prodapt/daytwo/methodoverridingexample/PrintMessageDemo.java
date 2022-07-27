package com.prodapt.daytwo.methodoverridingexample;

public class PrintMessageDemo {

	public static void main(String[] args) {
		DisplayMessage displayMsg = new DisplayMessage();
		displayMsg.displayMessageWithExtraGreetings("Good Afternoon");
		
		PrintMessage printMsg = new PrintMessage();
		printMsg.displayMessageWithExtraGreetings("Good Afternoon");
		
	}

}
