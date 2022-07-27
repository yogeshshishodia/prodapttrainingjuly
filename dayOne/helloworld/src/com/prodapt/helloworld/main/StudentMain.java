package com.prodapt.helloworld.main;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);
		student.setStudentID(15);
		student.setStudentName("Sharma");
		System.out.println(student);
	}

}
