// Here the package util is used for importing the scanner class for inputting from the user.

import java.util.Scanner; // import the Scanner class 

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String userName;
    
    // Enter username and press Enter
    System.out.println("Enter Name: "); 
    userName = myObj.nextLine();   
       
    System.out.println("Your name is: " + userName);        
  }
}