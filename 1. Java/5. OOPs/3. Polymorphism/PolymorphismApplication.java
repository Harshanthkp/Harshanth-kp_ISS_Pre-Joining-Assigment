// This is a example application of polymorphism.

// created class bank and create banks class which extend the function ROI for getting the interst rates of each bank.

class Bank{  
	float getROI(){
		return 0;
	}  
}  
class HDFC extends Bank{  
	float getROI(){
		return 8.4f;
	}  
}  
class KVB extends Bank{  
	float getROI(){
		return 7.3f;
	}  
}  
class KOTAK extends Bank{  
	float getRateOfInterest(){
		return 9.7f;
	}  
}  
class Polymorphism{  
	public static void main(String args[]){  
	Bank b;  
	b=new HDFC();  
	System.out.println("HDFC Rate of Interest: "+b.getROI());  
	b=new KVB();  
	System.out.println("KVB Rate of Interest: "+b.getROI());  
	b=new KOTAK();  
	System.out.println("KOTAK Rate of Interest: "+b.getROI());  
	}  
}