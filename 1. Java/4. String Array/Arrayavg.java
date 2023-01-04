// Array average of numerical elements

import java.util.Arrays;
import java.util.Scanner;

public class Arrayavg {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int sum =0;
		int avg =0;
		int n = in.nextInt();
		int[] arr = new int[n];
		int i=0;
		System.out.print("Enter array elements: ");
		for(i=0;i<n;i++)
		{
			 arr[i] = in.nextInt();
			 sum = sum + arr[i];
		}
		avg = sum/n;
		System.out.println("average of elements: " +avg);
	}

}
