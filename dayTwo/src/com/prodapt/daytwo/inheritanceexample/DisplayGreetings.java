package com.prodapt.daytwo.inheritanceexample;

public interface DisplayGreetings {
	
	public void displayGreetingsToChitChatters();
	
	default void displayGreeting() {
		System.out.println("Good Afternoon");
	}

}
