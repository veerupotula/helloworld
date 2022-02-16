package com.capita.java8Interview;

/*class myRunnable implements Runnable{
	
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("Child thread");
		}
	}
}

public class LamdaUsingThreads {
	
	public static void main(String[] args) {
		 Runnable r = new myRunnable();
		 
		 Thread t = new Thread(r);
		 t.start();
		 
		 for(int i=0;i<=10;i++) {
		 System.out.println("Main thread");
	}
		 
	}
}
*/
// Using lamda functions

 public class LamdaUsingThreads{
	 
	public static void main(String[] args) {
		  Runnable r = () ->{
			  for(int i=0;i<=10;i++) {
				  System.out.println("Child thread");
			  }
		  };
		  
		  Thread t = new Thread(r);
		  t.start();
		  for(int i=0;i<=10;i++) {
			  System.out.println("Parent thread");
		  }
		
	} 
 }