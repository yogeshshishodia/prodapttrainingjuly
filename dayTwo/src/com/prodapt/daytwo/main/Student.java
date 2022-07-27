package com.prodapt.daytwo.main;

import java.time.LocalDate;

public class Student {
	private int studentId;
	protected String studentName;
	LocalDate dateOfBirth;
	/**
	 * 
	 */
	public Student() {
	}
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	protected String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	protected void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the dateOfBirth
	 */
	LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
