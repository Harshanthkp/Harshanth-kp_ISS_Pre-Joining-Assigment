// Example with a employee class

class employee{
	String name;
	int year;
	String addr;
	void setdata(String a , int b, String c) {
		name =a;
		year = b;
		addr = c;
	}
	void disp() {
		System.out.println(name + "\t" + year + "\t" + addr);
	}
}
public class Employeeclass {

	public static void main(String[] args) {
		employee e = new employee();
		System.out.println("Name\tyear of joining\taddress\n");
		e.setdata("Kumar", 1994,"64C-WallsStreet");
		e.disp();
		e.setdata("Rajan", 2000,"68D-WallsStreet");
		e.disp();
		e.setdata("Suresh", 1999,"69C-WallsStreet");
		e.disp();
		

	}

}

