package com.capita.generics;

class Gen<T> {
	T object;

	Gen(T object) {
		this.object = object;
	}

	public void show() {
		System.out.println("The type of object is" + object.getClass().getName());
	}

	public T getObject() {
		return object;
	}
}

public class GenericsDemo {

	public static void main(String[] args) {
		Gen<String> stringType = new Gen<String>("vinayaka");
		stringType.show();
		System.out.println("String value is" + stringType.getObject());

		Gen<Integer> integerType = new Gen<Integer>(100);
		integerType.show();
		System.out.println("integervalue is" + integerType.getObject());

		Gen<Double> doubleType = new Gen<Double>(1852.25D);
		doubleType.show();
		System.out.println("double value is" + doubleType.getObject());
		
		Gen<Character> charType = new Gen<Character>('V');
		charType.show();
		System.out.println("Char value is "+ charType.getObject());
		charType.getObject();
	}

}
