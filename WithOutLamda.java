package com.capita.java8Interview;

@FunctionalInterface
interface inter1
{
public void m1();	
}

interface Intef2 {
	public void add(int a, int b);
}

class interImpl implements inter1
{
	public void m1()
	{
		System.out.println("Normal way of implementing interface");
	}
}

class interImpl2 implements Intef2
{
	public void add(int a,int b)
	{
		System.out.println("Sum is"+ (a+b));
	}
}
public class WithOutLamda {
		public static void main(String[] args) {
			
			inter1 i1 = new interImpl();
			i1.m1();
			
			Intef2 i2 = new interImpl2();
					i2.add(20, 40);
		}
}
