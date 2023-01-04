/**
 * 
 */
package oopsConcepts;

import java.util.*;
import java.io.*;


/**
 * @author harsh
 * This is a code for demonstration of Inheritance concept - Interns, Employees, Managers are seperate classes to explain the functions and datas of each persons.
 *
 */
class intern{
	int age;
	String phone;
	double salary;
	String name,address;
	intern(String n,int a,String ph,String add,double sal){
		name = n;
		age = a;
		phone = ph;
		address = add;
		salary = sal;
	}
	void displaySalary() {
		System.out.println("Salary : "+ salary);
	}
}

class employee extends intern{
	String special;
	employee(String n,int a,String ph,String add,double sal,String s){
		super(n,a,ph,add,sal);
		special = s;
	}
	void display() {
		System.out.println("Name :"+name + "\nAge: "+age + "\nphone: "+ phone + "\naddress: "+address);
		displaySalary();
		System.out.println("Specialization : "+ special);
	}
}

class manager extends intern{
	String depart;
	manager(String n,int a,String ph,String add,double sal,String d){
		super(n,a,ph,add,sal);
		depart = d;
	}
	void display() {
		System.out.println("Name :"+name + "\nAge: "+age + "\nphone: "+ phone + "\naddress: "+address);
		displaySalary();
		System.out.println("Department : "+ depart);
	}
}



public class Inheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				employee e = new employee("Sathya",22,"913456987","Chennai",60000,"Technical");
				manager m = new manager("Arun",44,"987654321","Bangalore",80000,"Administrator");
				System.out.println("Employee details!!---- ");
				e.display();
				System.out.println("\nManager details!!---- ");
				m.display();

	}

}

