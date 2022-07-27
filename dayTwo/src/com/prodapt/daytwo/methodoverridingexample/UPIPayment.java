package com.prodapt.daytwo.methodoverridingexample;

public class UPIPayment extends Payment{
	
	public String getPayments(String paymentType) {
		return "Payment received by UPI using --"+paymentType;
	}
}
