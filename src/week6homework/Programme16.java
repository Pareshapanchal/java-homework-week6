package week6homework;
import java.util.Scanner;
public class Programme16 {
    /**16. Write a Java program to add two binary numbers.
     Input Data:
     Input first binary number: 10
     Input second binary number: 11
     Expected Output:
     Sum of two binary numbers: 101
     *
     */
    public static void main(String[] args)
    {
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter Binary number 1: ");
        String b1 = scanobj.next();
        System.out.println("Enter Binary number 2: ");
        String b2 = scanobj.next();
        int d1 = Integer.parseInt(b1,2);
        int d2 = Integer.parseInt(b2,2);
        int add = d1+d2;
        System.out.println("Binary addition: "+ Integer.toBinaryString(add));
        scanobj.close();


    }
}
