package com.capita.java8Interview;

class Sample{
	
	Sample(){
		System.out.println("Sample object creation");
	}
}

// this is functional interface
interface constructIface{
	public Sample get();
}

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		// using lamda expression
		/*constructIface i = () ->{
			 Sample s = new Sample();
			 return s;
		};
		i.get();*/
		// using consturctor reference
		
			constructIface i = Sample :: new;
			i.get();
	}

}
