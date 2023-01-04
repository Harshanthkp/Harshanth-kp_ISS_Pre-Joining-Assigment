// All the string operations are included in this java prgm.

import java.util.Scanner;

public class Allstringoperations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the strings!");
		String s1 = in.next();
		String s2 = in.next();
		System.out.println("Is string 1 empty : " + s1.isEmpty());
		System.out.println("Is string 2 empty : " + s2.isEmpty());
		System.out.println("Length of string 1 : " + s1.length());
		System.out.println("Length of string 2 : " + s2.length());
		System.out.println("uppercase of string 1 : " + s1.toUpperCase());
		System.out.println("uppercase of string 2 : " + s2.toUpperCase());
		System.out.println("lowercase of string 1 : " + s1.toLowerCase());
		System.out.println("lowercase of string 2 : " + s2.toLowerCase());
		System.out.println("Concatenation of two strings : " + s1.concat(s2));
		System.out.println("2nd Character of string 1 : " + s1.charAt(1));
		System.out.println("Index of 't' in string 2 : " + s2.indexOf('r'));
		byte[] sb = s1.getBytes();
		System.out.println("converting string 2 into bytes : ");
		for (int i = 0; i < sb.length; i++)
			System.out.print(sb[i] + " ");
		System.out.print("\n");
		System.out.println("converting string into characters : ");
		char[] arr = s2.toCharArray();
		for (int j = 0; j < arr.length; j++)
			System.out.print(arr[j] + " ");
	}

}
