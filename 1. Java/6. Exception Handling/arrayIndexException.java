import java.util.Scanner;
import java.util.Random;
public class Arrayindex {

	public static void main(String[] args) {
		int[] arr = new int[100];
		Random rand = new Random();
		for(int i=0;i<100;i++)
			 arr[i] = rand.nextInt(1000);
		Scanner in = new Scanner(System.in);
		
			try {
				System.out.println("\tAn array of 100 numbers !");
				System.out.println("Enter the index: ");
				int a = in.nextInt();
				int s = arr[a];
				System.out.println("Element of array is : "+s);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
		}
}

