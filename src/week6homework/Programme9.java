package week6homework;

import java.util.Scanner;
public class Programme9 {
    /**
     * 9. Write a program to convert the upper case to lower case.
     */
   public static void main(String[] args)
   {
       Scanner scanobj = new Scanner(System.in);
       String uname,lname;
       System.out.println("Enter Name in Uppercase: ");
       lname = scanobj.nextLine();
       System.out.println("Convert to lower case:  "+ lname.toLowerCase());
       System.out.println("Enter Name in lowercase:  ");
       uname = scanobj.nextLine();
       System.out.println("Convert to UpperCase: "+ uname.toUpperCase());
       scanobj.close();


   }
}
