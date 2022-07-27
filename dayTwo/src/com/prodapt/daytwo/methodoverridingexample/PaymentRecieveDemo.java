package com.prodapt.daytwo.methodoverridingexample;

public class PaymentRecieveDemo {

	public static void main(String[] args) {
			PaymentMethod paymentMethod = new PaymentMethod();
			paymentMethod.setPaymentType(PaymentType.CreditCard);
			if(paymentMethod.getPaymentType().equals(PaymentType.CreditCard)) {
				CardPayment cardPayment = new CardPayment();
				cardPayment.getPayments("Visa");
				System.out.println(cardPayment.getPayments("Visa"));
			}else if(paymentMethod.getPaymentType().equals(PaymentType.UPI)) {
				UPIPayment upiPayment = new UPIPayment();
				System.out.println(upiPayment.getPayments("Phone Pe"));
			}
	}
}
