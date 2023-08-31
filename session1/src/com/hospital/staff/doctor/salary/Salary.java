package com.hospital.staff.doctor.salary;

public class Salary {
	protected void calculateSalary(double AMT, double Tax) {
		System.out.println(AMT - Tax);
	}

	public static void main(String[] args) {
		Salary ob1 = new Salary();
		ob1.calculateSalary(1200000, 32423);

	}

}
