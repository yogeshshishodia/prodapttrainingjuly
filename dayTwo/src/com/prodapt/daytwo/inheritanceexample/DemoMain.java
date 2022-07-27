package com.prodapt.daytwo.inheritanceexample;

public class DemoMain {

	public static void main(String[] args) {
		//Object of Parent class
		PrintInformation pi= new PrintInformation();
		//Object of derived class
		Display display = new Display();
		
		pi.getPrintMessage();
		pi.printInformation();
		pi.printMessage("Please don't do chit chats");
		
		display.displayMessage();
		display.getMessage();
		display.getPrintMessage();
		display.printInformation();
		display.printMessage("Please sona maat");
		display.displayGreetingsToChitChatters();
		display.displayGreeting();
	}

}
