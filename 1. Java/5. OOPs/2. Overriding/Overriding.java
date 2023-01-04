/*

This program is an example of Overriding concept, where the function under 
both the classes are same and overrides while calling it. Here the function
details() is overridden.


*/


class vitian {
   public void details() {
      System.out.println("Im a student at VIT");
   }
}

class intern extends vitian {
   public void details() {
      super.details();   // invokes the super class method
      System.out.println("I have got a internship at ISS from VIT");
   }
}

public class Overriding {

   public static void main(String args[]) {
      vitian v = new intern();   // Vitian reference but intern object
      v.details();   // runs the method in Intern class
   }
}