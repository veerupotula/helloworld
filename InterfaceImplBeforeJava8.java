package com.capita.java8;


interface iface
{
	void m1();
}

/*class ifaceImpl implements iface
{
	public void m1(){
		System.out.println("Inside m1()");
	}
}*/
public class InterfaceImplBeforeJava8 {

	public static void main(String[] args) {
					System.out.println("Inside main()");
					iface iface1 = () -> System.out.println("using lambda");
					iface1.m1();
	}
}
