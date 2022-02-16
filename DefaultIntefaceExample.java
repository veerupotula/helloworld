package com.capita.java8;

@FunctionalInterface
interface Interf1 {
	public void  mm();
	default void m1() {
		System.out.println("Inside inter1 ");
	}
}
interface Inter2 {
	default void m1() {
		System.out.println("Inside inter2 ");
	}

	public static void m3() {
		System.out.println("Static method inside Interface");
	}

	public static void main(String[] args) {
		System.out.println("Inside main(args) in interface");
	}

	public static void main() {
		System.out.println("Inside main() in interace");
	}
}

public class DefaultIntefaceExample {
	public void m1() {
		// System.out.println("overriding default method");
		// Interf1.super.m1();
		// Inter2.super.m1();
	}

	public static void main(String[] args) {
		System.out.println("Inside default method-class");
		DefaultIntefaceExample die = new DefaultIntefaceExample();
		die.m1();
		Inter2.m3();
		Inter2.main(args);
		Inter2.main();
	}

}
