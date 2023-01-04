// this program creates a file named aa.txt and helps to write the contents into the file and close the file.

import java.util.Scanner;
import java.io.*;

public class main_q1 {
	public static void main(String args[]) {
		try {
			Scanner in = new Scanner(System.in);
			FileOutputStream f = new FileOutputStream("aa.txt", true);
			System.out.println("Enter the content of the file :");
			String str = in.nextLine() + "\n";
			byte b[] = str.getBytes();
			f.write(b);
			f.close();
			System.out.println("Created and entered in the file successfully!");
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}