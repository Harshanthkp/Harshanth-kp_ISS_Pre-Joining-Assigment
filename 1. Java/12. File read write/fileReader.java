// this program reads the contents from the file and displays it in console.

import java.io.*;

public class main_q2 {
	public static void main(String args[]) {
		try {
			FileReader fr = new FileReader("aa.txt");
			int i;
			System.out.println("Contents of file aa.txt : ");
			while ((i = fr.read()) != -1)
				System.out.print((char) i);
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
