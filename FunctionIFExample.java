package com.capita.java8;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student
{
 String name;
 int marks;
 
Student(String name, int marks)
{
this.name = name;
this.marks = marks;
}
}

public class FunctionIFExample {

	public static void main(String[] args) {

		Function<Integer,Integer> f = i->i*i;
		System.out.println(f.apply(5));
		System.out.println(f.apply(6));

	    Function<String,Integer> f1 = s-> s.length();
	  //  System.out.println(f1.apply("vinayaka"));
	    
	    Function<String,String> f2 = s->s.toUpperCase();
	   // System.out.println(f2.apply("vinayaka"));
	    ArrayList<Student> studentList = new ArrayList<>();
	    studentList.add(new Student("Ramu",45));
	    studentList.add(new Student("Laxman",60));
	    studentList.add(new Student("vinayaka",85));
	    studentList.add(new Student("xxx",30));
	    
		Function<Student, String> f3 = s -> {
			int marks = s.marks;
			String grade = "";
			if (marks >= 80)
				grade = "A[Dictinnction]";
			else if (marks >= 60)
				grade = "B[First class]";
			else if (marks >= 50)
				grade = "C[Second class]";
			else if (marks >= 35)
				grade = "D[Third class]";
			else
				grade = "E[failed]";
			return grade;
		};

		Predicate<Student> p = s -> s.marks >= 60;
		for (Student student : studentList) {
			if (p.test(student)) {
				System.out.println("Student Name" + student.name);
				System.out.println("Student Marks" + student.marks);
				System.out.println("Student Grade" + f3.apply(student));
				System.out.println("=============");
			}
		}
		

// f1.andThen(f2).apply(i);  => first f1 followed by f2
// f1.compose(f2).apply(i);  =>first f2 and then f1
		Function<Integer,Integer>f11 = i->2 *i;
		Function<Integer,Integer> f12 = i-> i*i*i;
		System.out.println(f11.andThen(f12).apply(2));
		System.out.println(f12.andThen(f11).apply(2));
	}

}
