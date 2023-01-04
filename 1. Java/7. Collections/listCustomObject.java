// this program demonstrates about the custom object to access the list 

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;



public class list_custom_object {
	void customObjectList() {
		ArrayList<student_helper> customList = new ArrayList<student_helper>();
		System.out.println(customList);
		
		String[] name = {"harshanth", "avi", "kavi", "jk", "santha"};

		for (int i = 0; i < 5; i++)
			customList.add(new student_helper(i, name[i] ));

		Iterator<student_helper> iterator = customList.iterator();
		System.out.println("CustomList is: " + customList);
		while(iterator.hasNext()) {
			iterator.next().printStudent();
		}

        customList.remove(4);

        System.out.println("Index of 4th elementis: " + customList.indexOf(iterator));
 
        customList.set(1, new student_helper(11, "abhinav"));
        System.out.println("new custom list is " + customList);
        
  
        Object clonedList = customList.clone();
        System.out.println("Cloned copy ArrayList is: " + clonedList);
        
        
        customList.clear();
        System.out.println("ArrayList cleared: " + customList);
        
       
        System.out.println("Checking if ArrayList is empty: " + customList.isEmpty());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list_custom_object customCollections = new list_custom_object();
		customCollections.customObjectList();

	}
}
