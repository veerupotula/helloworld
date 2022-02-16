package com.capita.java8;

public class AnnonomusInnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		Runnable runnable = new Runnable() {
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("Inside run()");
				}
			}
		};
*/		
		Runnable r = ()->{
			for(int i=0;i<=10;i++)
			{
				System.out.println("using lambda");
			}
		};

		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}

	}

}
