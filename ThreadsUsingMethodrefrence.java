package com.capita.java8Interview;

public class ThreadsUsingMethodrefrence {
	
	public void m1()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("child method using methodrefence");
		}
	}

	public static void main(String[] args) {
		
		ThreadsUsingMethodrefrence objectRef = new ThreadsUsingMethodrefrence();
		Runnable r = objectRef :: m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main theread");
		}

	}

}
