/*
This program demonstrates about the concept of abstraction using abstract keyword for a program for calculating the different shape areas defined as each shapes.
*/

package javaAbstract;

abstract class Shape {
	abstract void RectangleArea(int l, int b);

	abstract void SquareArea(int a);

	abstract void CircleArea(int r);
}

class Area extends Shape {
	void RectangleArea(int l, int b) {
		int area = l * b;
		System.out.println("Area of the rectangle : " + area);
	}

	void SquareArea(int a) {
		int area = a * a;
		System.out.println("Area of the square : " + area);
	}

	void CircleArea(int r) {
		double area = 3.14 * r * r;
		System.out.println("Area of the circle : " + area);
	}
}

public class main_q2 {
	public static void main(String args[]) {
		Shape r = new Area();
		Shape s = new Area();
		Shape c = new Area();
		r.RectangleArea(3, 4);
		s.SquareArea(4);
		c.CircleArea(7);
	}
}
