package javaLabStrings;
// String comparison is demonstrated in this program

import java.util.Scanner;

public class Comparestrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to compare !");
		String s1 = in.next();
		String s2 = in.next();
		System.out.println("Is there any similarities with "+ s1 + " and " + s2 + "->>" + s1.equals(s2));
	}

}


