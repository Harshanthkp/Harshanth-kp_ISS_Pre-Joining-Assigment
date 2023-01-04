// Sorting the elements in array using multithreading concepts

import java.util.Scanner;

public class Sortingthread 
{
	public static void main(String[] args)
    {
        
        int count;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter no of elements array: ");
        count = scan.nextInt();
        int num[] = new int[count];
        System.out.println("Enter elements:");
        for (int i = 0; i < count; i++) 
        {
            num[i]=scan.nextInt();
        }
        Ascending t1= new Ascending(num,count);
        
        t1.start();
        Descending t2= new Descending(num,count);
        t2.start();
        
    }
}

 class Ascending extends Thread
{
    int num[];
    int count;
    Ascending( int a[],int c)
    {
        num=a;
       count=c;
           
    }
    public void run()
    {
       
        int temp;
        
            for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order-> ");
        for (int i = 0; i < count ; i++) 
        {
            System.out.print(num[i] + ", ");
        }
        
    }
}

 class Descending extends Thread
{
    int num[];
    int count;
    Descending( int a[],int c)
    {
       num=a;
       count=c;
    }
    public void run()
    {
        int temp;
        
        
         for (int i = 0; i < count; i++) {     
            for (int j = i+1; j < count; j++) {     
               if(num[i] < num[j]) {    
                   temp = num[i];    
                   num[i] = num[j];    
                   num[j] = temp;    
               }     
            }     
        }    
            
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.print("Array Elements in Descending Order-> ");    
        for (int i = 0; i < count; i++) {     
            System.out.print(num[i] + ", ");    
        }    
        
    } 
}
 
