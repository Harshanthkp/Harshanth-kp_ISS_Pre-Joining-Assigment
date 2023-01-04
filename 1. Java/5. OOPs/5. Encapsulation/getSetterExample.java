// The get method returns the variable value, and the set method sets the value, provide public get and set methods to access and update the value of a private variable

public class GetSetter {
	public static void main(String[] args){  
		//Instance Creation for the class

		Encapsulation1 s=new Encapsulation1();  
		//Set a value with object  
		s.setCompanyName("ISS");  

		//retrieving the value with get.  
		System.out.println(s.getCompanyName());
	}
}
