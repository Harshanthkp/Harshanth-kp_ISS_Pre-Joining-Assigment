
import java.util.*;

public class Userinput {
int a,b;
	void num1()
	{
	 try{
	 Scanner in = new Scanner(System.in);
	 System.out.print("Enter first integer : ");
	 a = in.nextInt();
	 }catch(InputMismatchException e)
	 {
	 System.out.println("\n"+e + " . Enter the number again.\n");
	 num1();
	 }
	}
	void num2()
	{
	 try{
	 Scanner in = new Scanner(System.in);
	 System.out.print("\nEnter second integer : ");
	 b = in.nextInt();
	 }catch(InputMismatchException e)
	 {
	 System.out.println("\n"+e + " . Enter the number again.\n");
	 num2();
	 }
	}
	public static void main(String args[])
	{
	Userinput obj = new Userinput();
	 obj.num1();
	 obj.num2();
	 System.out.print("\nAddition of "+obj.a+" and "+obj.b+" is : "+(obj.a + obj.b));
	}
}
