// This program demonstrates about looping and decision making, where it loops through certain numbers and at each step it makes decision based on certain conditions given in the code as odd or even.

import java.util.Scanner;

public class Countevenodd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = in.nextInt();
		int count1 =0;
		int count2 =0;
		int[] arr = new int[n];
		int i=0;
		System.out.print("Enter array elements: ");
		for(i=0;i<n;i++)
		{
			 arr[i] = in.nextInt();
			 if(arr[i]%2==0) {
				 count1++;
			 }
			 else {
				 count2++;
			 }
		}
		System.out.println("Total no of Even elements: "+ count1);
		System.out.println("Total no of Odd elements: "+ count2);

	}

}
