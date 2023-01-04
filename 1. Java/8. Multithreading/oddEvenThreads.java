// with 2 classes and showing the multithreading with synchronization

import java.util.Random;

public class OddEvenThread
{
	public static void main(String[] args)
    {
        int num[] =new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = new Random().nextInt(10); 
        }
        System.out.println("Randomly generated array:");
        System.out.print("\n");
          for(int i=0;i<10;i++)
       {
           
           {
               System.out.print(num[i]+",");
        }        
    }
    System.out.print("\n");
    System.out.print("\n");
   
        Odd t1= new Odd(num);
        Even t2= new Even(num);
        t1.start();
        t2.start();
        }
}

 class Odd extends Thread
{
    int num[];
    
    Odd( int a[])
    {
        num=a;
     }
    synchronized public void run()
    {
       for(int i=0;i<10;i++)
       {
           if(num[i]%2!=0)
           {
               System.out.println("Odd Number-> "+num[i]);
        }        
    }
}
}

 class Even extends Thread
{
    int num[];
    
    Even( int a[])
    {
       num=a;
       
    }
    synchronized public void run()
    {
          for(int i=0;i<10;i++)
       {
           if(num[i]%2==0)
           {
               System.out.println("Even Number-> "+num[i]);
        }
        }
      } 
}

 