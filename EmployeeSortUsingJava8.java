package com.capita.java8Interview;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
		int eno;
		String ename;
		 Employee(String ename, int eno) {
			 	this.eno = eno;
			 	this.ename = ename;
		 }
		 
		 @Override
		public String toString() {
			
			return this.eno + ":"+this.ename;
		}
	}

public class EmployeeSortUsingJava8 {

	public static void main(String[] args) {
		Employee e1 = new Employee("vinayaka", 1);
		//System.out.println(e1);
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("vinayaka", 185));
		empList.add(new Employee("rama", 815));
		empList.add(new Employee("krishna", 851));
		empList.add(new Employee("krishna", 485));
		empList.add(new Employee("gopi", 385));
		empList.add(new Employee("abhi", 8523));
		System.out.println(empList);
		// Based on ascending order of employee numbers
		Collections.sort(empList,(l1,l2)->(l1.eno<l2.eno)?-1:(l1.eno>l2.eno)?1:0);
		System.out.println(empList);
		//Sort based on empName alphabetical order
		Collections.sort(empList,(l1,l2)-> l1.ename.compareTo(l2.ename));

		System.out.println(empList);
	}

}
