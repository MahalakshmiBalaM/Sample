package org.dropdown;

public class Department extends Employee {

	@Override
	public void EmployeeDesination() {
		System.out.println("ghvj");		
	}
	private void departmentName() {
		System.out.println("bca");
	}
	public static void main(String[] args) {
		Department d = new Department();
		d.EmployeeName();
		d.EmployeeDesination();
		d.departmentName();
	}
		
}
