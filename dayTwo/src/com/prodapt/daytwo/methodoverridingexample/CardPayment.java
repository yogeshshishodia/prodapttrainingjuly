package com.prodapt.daytwo.methodoverridingexample;

public class CardPayment extends Payment{
	
	public String getPayments(String paymentType) {
		return "Payment received by using  cards--"+paymentType;
	}
}
