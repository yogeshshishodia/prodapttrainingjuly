package com.prodapt.daytwo.singleton;

import com.prodapt.daytwo.main.Student;

public class SingletonClassDemo {

	public static void main(String[] args) {
		SingletonClass object = SingletonClass.getInstance();
		System.out.println(object instanceof SingletonClass);
		System.out.println(object.hashCode());
		SingletonClass object1 = SingletonClass.getInstance();
		System.out.println(object1 instanceof SingletonClass);
		System.out.println(object1.hashCode());
		Student stud = new Student();
		Student stud1 = new Student();
		System.out.println(stud.hashCode());
		System.out.println(stud1.hashCode());
	}

}
