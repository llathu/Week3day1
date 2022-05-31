package org.student;

public class Student extends org.department.Department {
	
	public void studentName() {
		System.out.println("Student Name is Danny"); 
		
	}
	

	public void studentId() {
		System.out.println("Student Id is 1001"); 
		
	}
	

	public void studentDepartment() {
		System.out.println("Student Department is IT"); 
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Student stu = new Student();
		
		stu.studentDepartment();
		stu.studentId();
		stu.studentName();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();

	}

}
