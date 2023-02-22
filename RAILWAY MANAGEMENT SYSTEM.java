import java.util.*;
import java.io.*;
public class Project
{
        
    public static void main(String args[])
    {
        String name;
        int age;
        String gender;
        long number;
        String source;
        Scanner sc=new Scanner(System.in);
        {
        System.out.println("...WELCOME TO RAILWAY MANAGEMENT SYSTEM...");
        int ch;
        do
        {
            System.out.println("1.PASSENGER \n 2.TRAIN DETAILS \n 3.PAYMENT \n 4.TICKET DETAILS \n 5.ADMIN \n 6.EXIT");
            System.out.println("enter your choice");
            ch = sc.nextInt();
            switch(ch)
            {
            case 1:
                
                System.out.println("NAME OF THE PASSENGER");
                name=sc.next();
                System.out.println("AGE");
                age=sc.nextInt();
                System.out.println("GENDER :");
                gender=sc.next();
                System.out.println("MOBILE NUMBER :");
                number=sc.nextLong();
                break;
            case 2:
                
                System.out.println("TRAIN NUMBER :");
                number=sc.nextLong();
                System.out.println("TRAIN NAME :");
                name=sc.next();
                System.out.println("SOURCE :");
                name=sc.next();
                System.out.println("DESTINATION :");
                name=sc.next();
                break;
            case 3:
                
                System.out.println("AMOUNT :");
                number=sc.nextLong();
                System.out.println("TRAIN CODE :");
                number=sc.nextInt();
                break;
            case 4:
                
                System.out.println("TICKET CODE :");
                number=sc.nextInt();
                System.out.println("DATE OF JOURNEY :");
                number=sc.nextLong();
                break;
            case 5:
                System.out.println("...WELCOME TO ADMIN PAGE...");
                System.out.println("VIEW TRAIN DETAILS :");
                System.out.println("VIEW PASENGER DETAILS :");
                System.out.println("IEW ALL BOOKINGS :");
                
                System.out.println("CANCEL BOOKINGS :");
                System.out.println("YES");
                break; 
            case 6:
                System.out.println("EXIT");
                System.out.println("THANK YOU FOR YOUR ATTENTION");
          }
    
      }  while(ch!=6);
       
     
    }
} 
}

