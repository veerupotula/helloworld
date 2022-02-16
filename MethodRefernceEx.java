package com.capita.java8Interview;

interface MethodRefInterface
{
public void m1();	
}
public class MethodRefernceEx {

	public static void m2()
	{
		System.out.println("this is m2()");
	}
	public static void main(String[] args) {
		// this is called static method refernce.Here m2 is static method
		MethodRefInterface mrf = MethodRefernceEx :: m2; // Im method reference both methods should have same parameters
		mrf.m1();
	}

}
