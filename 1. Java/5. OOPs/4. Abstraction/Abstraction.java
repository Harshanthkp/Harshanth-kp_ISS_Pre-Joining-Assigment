/*
This program demonstrates about the abstraction, abstract class and working of objects when called in main function.
*/

package javaAbstract;

abstract class Parent {
	abstract void message();
}

class sec extends Parent {
	void message() {
		System.out.print("\nThis is first sub class");
	}
}

class second extends Parent {
	void message() {
		System.out.print("\nThis is second sub class");
	}
}

public class First {
	public static void main(String args[]) {
		Parent p1 = new sec();
		Parent p2 = new second();
		p1.message();
		p2.message();
	}
}
