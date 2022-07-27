package com.prodapt.daytwo.inheritanceexample;
//Parent Class or Super class
public class PrintInformation {
	
	private String printMessage;
	
	public String getPrintMessage() {
		return printMessage;
	}

	public void setPrintMessage(String printMessage) {
		this.printMessage = printMessage;
	}

	public void printInformation() {
		System.out.println("Hello from Print Information method if PrintInformation class");
	}
	
	public void printMessage(String message) {
		System.out.println("Message from printMessage method ---"+message);
	}
	
	
}
