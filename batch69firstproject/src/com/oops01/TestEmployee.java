package com.oops01;

public class TestEmployee {

	public static void main(String[] args) {
		System.out.println("main method staretd ");

		Employee emp2 = new Employee(7, "Dhoni", 88776677777L, 987576547.00, 43);
		System.out.println(emp2.getEid());
		System.out.println(emp2.getEname());
		System.out.println(emp2.getMobile());
		System.out.println(emp2.getSalary());
		System.out.println(emp2.getAge());

		System.out.println("*********************************");
		Employee emp1 = new Employee();
//		emp1.salary = 500000.00;//The field Employee.salary is not visible

		// Accessing the data directly, we should stop !!
		// For Stopping direct access, we must need to keep the data as private.
//		System.out.println(emp1.eid);// The field Employee.eid is not visible
//		System.out.println(emp1.ename);// The field Employee.ename is not visible
//		System.out.println(emp1.mobile);// The field Employee.mobile is not visible
//		System.out.println(emp1.salary);// The field Employee.salary is not visible

		emp1.setEid(18);
		emp1.setEname("Virat");
		emp1.setSalary(1000000.00);
		emp1.setMobile(9999999999L);
		emp1.setAge(17);

		System.out.println("EMP ID: " + emp1.getEid());
		System.out.println("EMP Name: " + emp1.getEname());
		System.out.println("Mobile NO : " + emp1.getMobile());
		System.out.println("Salary : " + emp1.getSalary());
		System.out.println("Age :  " + emp1.getAge());

	}
}
