// Mechanism to achieve abstraction, There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

interface Display{      // declared by using the interface keyword
	void display();  
}

class Interfaces implements display{  
	public void display(){
		System.out.println("ISS Governance");
	}  
  
public static void main(String args[]){  
		Interfaces obj = new Interfaces();  
		obj.display();  
 	}  
}
