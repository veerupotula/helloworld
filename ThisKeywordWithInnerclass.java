package com.capita.java8Interview;

interface ibase{
	public void m1();
}

/*class ibaseImpl
{
	int x=888;
	Below method is like annonymous inner class. where we create this keyword 
	public void m2() {
		ibase i1 = new ibase() {
			int x=999;
			public void m1()
			{
				System.out.println(this.x); // current inner class expression
				System.out.println(ibaseImpl.this.x);
			}
		};
		
		i1.m1();
	};
}*/
class ibaseImpl
{
	int x=888;
	/*Below method is like lambd expression. where we create this keyword */
	public void m2() {
		int z=11;
		ibase i1 = () ->{
			int x=999;
			
				System.out.println(this.x);  // calls outclass x value
				System.out.println(x);
				System.out.println(ibaseImpl.this.x);
				x=99;
				System.out.println(x);
				System.out.println(z);
				z=111; // local varaibles from lambd expressions of methods cannot be changed. it is final or implicity finalized

		};
		
		i1.m1();
	};
}
public class ThisKeywordWithInnerclass {

	public static void main(String[] args) {
            ibaseImpl ibase = new ibaseImpl();
              ibase.m2();
	}

}
