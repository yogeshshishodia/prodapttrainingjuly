/**
 * 
 */
package com.prodapt.helloworld.main;

/**
 * @author UD SYSTEMS
 *
 */
public class EmployeeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Creating an employee object by invoking or calling default constructor
		Employee employee = new Employee();// Using new keyword we invoking constructor
		employee.displayEmployeeDetails();
		
		Employee emp = new Employee(1,"Rathi",null,"Associate",null,50000.00);
		emp.displayEmployeeDetails();
		System.out.println("************************************************");
		emp.setDesignation("Sr Associate");
		emp.displayEmployeeDetails();
		
		System.out.println("************************************************");
		System.out.println(emp.getEmpId());
		
		System.out.println("************************************************");
		double incrSal = emp.increasedSalary(.5, emp.getSalary());
		emp.displayEmployeeDetails();
		
		System.out.println("************************************************");
		emp.setSalary(incrSal);
		emp.displayEmployeeDetails();
		System.out.println(emp);
	}

}
