package com.prodapt.dayfive.datenumbercurrencyapi;

import java.util.Currency;
import java.util.Locale;

public class CurrencyApi {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		System.out.println(Locale.getAvailableLocales().toString());
		
		Currency c = Currency.getInstance(Locale.GERMANY);
		System.out.println(c.getCurrencyCode());
		System.out.println(c.getSymbol());
		System.out.println(c.getDisplayName());
	}

}
