package com.prodapt.daytwo.inheritanceexample;

//Subclass or child class or derived class from PrintInformation
public class Display extends PrintInformation implements DisplayGreetings{
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;
	
	public void displayMessage() {
		System.out.println("I am display message from Display class");
	}

	@Override
	public void displayGreetingsToChitChatters() {
		System.out.println("Chit chat maat karo aur jage raho");
	}
}
