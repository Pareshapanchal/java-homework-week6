package week6homework;

import java.util.Scanner;

public class Programme19 {
    /**19. Write a Java program to convert a given string into lowercase.
     Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
     Output: the quick brown fox jumps over the lazy dog.
     *
     */
    public static void main(String[] args)
    {
        Scanner scanobj = new Scanner(System.in);
        String uname,lname;
        System.out.println("Enter string in Uppercase: ");
        lname = scanobj.nextLine();
        System.out.println("Convert to lower case:  "+ lname.toLowerCase());

        scanobj.close();


    }
}
