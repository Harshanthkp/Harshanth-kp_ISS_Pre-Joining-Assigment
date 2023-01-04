
import java.util.Scanner;

public class Calculator {
	public static void main(String args[]){
		
	 int op1,op2;
	 Scanner in = new Scanner(System.in);
	 System.out.print("Enter num 1 : ");
	 String a = in.next();
	 System.out.print("Enter num 2 : ");
	 String b = in.next();
	 System.out.print("Enter operator : ");
	 String op = in.next();
	 try {
		 op1 = Integer.parseInt(a);
		 op2 = Integer.parseInt(b);
		  switch(op)
		  {
			 case "+": System.out.println("Addition : "+(op1+op2));
			 break;
			 case "-": System.out.println("Subtraction : "+(op1-op2));
			 break;
			 case "*": System.out.println("Multiplication : "+(op1*op2));
			 break;
			 case "/" : System.out.println("Division : "+(op1/op2));
			 break;
		  }
	 	}catch(NumberFormatException e)
		 {
		 System.out.print(e + " . Input is non numeric.");
		 }
 in.close();
}
}

