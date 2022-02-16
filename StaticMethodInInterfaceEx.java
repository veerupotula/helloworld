package com.capita.java8Interview;


interface StaticExInterface
{
	public static void m1() {
		System.out.println("This is static method from interface");
	}
}

public class StaticMethodInInterfaceEx implements StaticExInterface{
	/* public static void m1() {
			System.out.println("This is static method from class");

	 }*/

	public static void main(String[] args) {
		StaticMethodInInterfaceEx obj = new StaticMethodInInterfaceEx();
		//	obj.m1();
	//	StaticMethodInInterfaceEx.m1(); //we cannot call static method by using object or implementation class as well
		// interface static method by default to clasees, so not applicable to overriding
			StaticExInterface.m1();
	}

}
