// This is an application for array data type

import java.util.Scanner;
import java.util.Arrays;
public class Studenttutor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("No of batches: ");
		int n = in.nextInt();
		int arr[] = new int[n];
		int c[] = new int[n];
		System.out.println("No of slow learners in batches: ");
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		int arr1[][] = new int[n][];
		for(int i=0;i<n;i++) {
			int a =arr[i]/4;
			if(arr[i] % 4 !=0)
				a = a +1;
			arr1[i]= new int[a];
		}
		for(int i=0;i<n;i++) {
			int d = arr[i];
			int count = 0;
			for(int j=0;j<arr1[i].length;j++) {
				if(d>=4) {
					arr1[i][j] =4;
					count++;
				}
				else 
					arr1[i][j] = d;
					d = d-4;
					c[i] = count;}
			}
		int y =0;
		System.out.println("Final output !");
		for(int[] i : arr1) {
			System.out.println("\nBatch "+(y+1));
			System.out.println("Total tutors: "+i.length +"\nBatches: ");
			for(int j : i)
				System.out.print(j + " ");
			System.out.println("\nNo of Batches with exactly 4 stds: "+c[y]);
			y++;}
	}
}
