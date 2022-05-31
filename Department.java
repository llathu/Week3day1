package org.department;

public class Department extends org.college.College  {
	
	public void deptName() {
		
		System.out.println("My Department name is Physics");
	}
	
	
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		
	Department dep = new Department();
		dep.deptName();
		dep.collegeCode();
		dep.collegeName();
		dep.collegeRank();		
		

	}

}
