// This program demonstrates about the comparator operator for collection List.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class list_comparable {
public class StudentNameCompare implements Comparator<Student_helper2>{
		public int compare(Student_helper2 student1, Student_helper2 student2){
	        return student1.getName().compareTo(student2.getName());
	    }
	}
	
	public static void main(String[] args)
    {
        ArrayList<Student_helper2> list = new ArrayList<Student_helper2>();
    
        list_comparable mycomm = new clist_comparable();
        list.add(new Student_helper2(33,"Harshanth"));   
        list.add(new Student_helper2(03, "Avi"));
        list.add(new Student_helper2(20, "khushi"));
        list.add(new Student_helper2(32, "harsha"));
        list.add(new Student_helper2(93, "amal"));
        list.add(new Student_helper2(55, "arun"));
        list.add(new Student_helper2(29, "kavi"));
        
        System.out.println("List before sorting");
        
        System.out.println("\n List after sorting");
 
        StudentNameCompare ratingCompare = mycomm.new StudentNameCompare();

        Collections.sort(list, ratingCompare);
        for (Student_helper2 student: list)
            System.out.println(student.getId() + " " + student.getName());
             
        System.out.println("\n List after sorting by ID");
        Collections.sort(list);
        for (Student_helper2 student: list)
            System.out.println(student.getId() + " " + student.getName());
    }

}
