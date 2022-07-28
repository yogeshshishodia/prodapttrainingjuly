package com.prodapt.daythree.exercise;

public class StudentDemo {

	public static void main(String[] args) {
		Student student = new Student();
		Student[] studentArr = new Student[5];
		studentArr[0] = new Student(1,"Jyoti","Doon");
		studentArr[1] = new Student(2,"Bisht","Garhwal");
		studentArr[2] = new Student(3,"Sharma","Haridwar");
		studentArr[3] = new Student(4,"Trivedi","Kanpur");
		studentArr[4] = new Student(5,"Nagar","Gurgaon");
		//1
		/**
		for(Student stud : studentArr) {
			System.out.println(stud);
		}**/
		DisplayStudent display = new DisplayStudent();
		display.displayStudents(studentArr);
		
	}
	/**
	public static void displayStudents(Student[] studentArr) {
		for(Student stud : studentArr) {
			System.out.println(stud);
		}
	}**/
}
