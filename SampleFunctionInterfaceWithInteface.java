package com.capita.java8Interview;

//case 1:-
/*interface Parent
{
public void m1();
}
@FunctionalInterface
interface Child extends Parent{
	
}

//O/p :- valid
*/

//case 2:-
/*interface Parent
{
public void m1();
}
@FunctionalInterface
interface Child extends Parent{

	public void m1();
}
*/
//O/p :- valid


//case 3 :-

/*interface Parent
{
public void m1();
}
@FunctionalInterface
interface Child extends Parent{

	public void m2();
}
*/
//O/p :- invalid,child is not functional interface


// case 4 :-

interface Parent
{
public void m1();
}
interface Child extends Parent{

	public void m2();
}

// O/P :- valid,since we are not using functional interace annotation on child.