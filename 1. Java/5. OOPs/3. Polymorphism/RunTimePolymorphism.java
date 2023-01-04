/*
This program is an example of Run time Polymorphism concept, We are calling the run method by the reference variable of Parent class. Since it refers to the subclass object and subclass method overrides the Parent class method, the subclass method is invoked at runtime.
Here the function details() is overridden and invoked at run time.


*/

class Student{  
    void details(){
        System.out.println("Im a Student at VIT");
        
    }  
} 

class Cse extends Student{  
    void details(){
        System.out.println("I have joined Cse branch at VIT");
        
    }  
}  

class Core extends Student{  
    void details(){
        System.out.println("Taken Cse Core instead of other branches");
        
    }  
}  

class Internship extends Student{  
    void details(){
        System.out.println("Got an Internship at ISS Mumbai");
        
    }  
}  

public class RunTimePolymorphism{  
    public static void main(String[] args){  
        Student s;  // creating a ref variable of parent class - Student
        s=new Cse();  
        s.details();  
        s=new Core();  
        s.details();  
        s=new Internship();  
        s.details();  
    }
}  