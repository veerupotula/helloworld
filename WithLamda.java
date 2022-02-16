package com.capita.java8Interview;

interface inter1 {
	public void m1();
}

interface Intef2 {
	public void add(int a, int b);
}

interface Intef3 {
	public int getLenght(String s);
}

public class WithLamda {
	public static void main(String[] args) {
		inter1 i1 = () -> System.out.println("Using lamda expressions");
		i1.m1();

		Intef2 i2 = (a, b) -> System.out.println("Using lamda expressions sum is +" + (a + b));
		i2.add(10, 14);
		
		Intef3 i3 = s->s.length();
		System.out.println("Lenght of string is"+ i3.getLenght("Hello vinayaka"));
		System.out.println("Lenght of string is"+ i3.getLenght("Hello all"));
		System.out.println("Lenght of string is"+ i3.getLenght("Hello java8"));
	}
}
