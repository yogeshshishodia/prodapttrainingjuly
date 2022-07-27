package com.prodapt.daytwo.enumexample;

public class EnumExample {

	public static void main(String[] args) {
		System.out.println(Days.Monday);
		if((Days.Friday).equals(DaysConstant.FRIDAY)) {
			System.out.println(MessageConstants.TGIF);
		}else {
			System.out.println(MessageConstants.WE_HAVE_TO_WORK_HARDER);
		}
		
		if(DaysConstant.FRIDAY.equals("Friday")) {
			System.out.println("Thank God Its Friday");
		}else {
			System.out.println("Chup chaap kaam karlo first benchers");
		}

	}

}
