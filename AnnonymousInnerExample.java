package com.capita.java8Interview;

public class AnnonymousInnerExample {

	public static void main(String[] args) {

		// Below code is for Annonymous inner class example
	/*	Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <=10; i++) {
						System.out.println("Child thread");					
				}
				
			}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main thread");
		}*/
		// Using lamda expression
		/*Runnable r = () -> {
			
			for (int i = 0; i <=10; i++) {
				System.out.println("Child thread");					
		}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main thread");
		}*/
		
		// Using lambda expression as a argument
		Thread t = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("child-1 thread");
			}

		});
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("Main-1no thread");
		}
	}

}
