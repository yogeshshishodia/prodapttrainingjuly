package com.prodapt.daytwo.singleton;

public class SingletonClass{
	
		//Static member holds only on instance of the SingletonClass class.
		private static SingletonClass singletonClass;
		
		//Private Constructor
		private SingletonClass() {
			
		}

		//Now we are going to provide access 
			public static SingletonClass getInstance() {
				if(singletonClass ==null) {
					singletonClass= new SingletonClass();
				}
				
				return singletonClass;
			}
}
