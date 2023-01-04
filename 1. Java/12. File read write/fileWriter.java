// This program helps to write the contents to the file with certain line of datas.

import java.io.*;
import java.util.Scanner;

public class main_q3 {
	public static void main(String args[]) {
		try {
			Scanner in = new Scanner(System.in);
			FileWriter fw = new FileWriter("BankBalanceDetails.txt");
			System.out.print("Enter account number : ");
			String accno = in.nextLine();
			System.out.print("\nEnter Customer name : ");
			String cname = in.nextLine();
			System.out.print("\nEnter Bank name : ");
			String bname = in.nextLine();
			System.out.print("\nEnter IFSC code : ");
			String ifsc = in.nextLine();
			System.out.print("\nEnter date : ");
			String d = in.nextLine();
			fw.write("Bank Balance Details\n");
			fw.write("Account number : " + accno);
			fw.write("\nCustomer Name : " + cname);
			fw.write("\nBank Name : " + bname);
			fw.write("\nIFSC code : " + ifsc);
			fw.write("\nBalance as on Date : " + d);
			System.out.println("\nDetails added successfully!");
			fw.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}