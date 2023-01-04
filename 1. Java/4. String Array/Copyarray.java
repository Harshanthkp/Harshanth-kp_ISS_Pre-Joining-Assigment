// Copying the array elements from one to another array

import java.util.Scanner;

public class Copyarray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		int[] copy = new int[n];
		int i=0;
		System.out.print("Enter array elements: ");
		for(i=0;i<n;i++)
		{
			 arr[i] = in.nextInt();
		}
		System.out.println("Copying array elements to another array !");
		for(i=0;i<n;i++)
		{
			 copy[i] = arr[i];
		}
		System.out.println("Copied array elements in copy[] array: ");
		for(i=0;i<n;i++)
		{
			System.out.print(copy[i]+ " ");
		}

	}

}
