class Intern {  // Class defining
    // Instance Variables -> State
    String name;
    String dept;
    int age;
    String project;

  
    // Methods Declaration
    public String getInfo() {
        return ("Name is: "+name+" \nDepartment is:"+dept +" \nAge is:"+age+" \nBusiness Unit is: "+project);
    }
}
public class BasicJava{
    public static void main(String[] args) {
        // Object defining
        Intern iss = new Intern();
        // Allocation
        iss.name="Harshanth";
        iss.dept="Development";
        iss.age=22;
        iss.project="Governance Solutions";
        // Calling the Method with the object
        System.out.println(iss.getInfo());
    }
}