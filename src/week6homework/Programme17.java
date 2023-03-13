package week6homework;
import java.util.Scanner;
public class Programme17 {
    /**17. Write a Java program to convert a decimal number to binary number.
     Input Data:
     Input a Decimal Number : 5
     Expected Output
     Binary number is: 101
     *
     */

    public static void main(String [] args)
    {
        Scanner scanobj= new Scanner(System.in);
        System.out.println("Enter a Decimal number ");
        int num = scanobj.nextInt();
        System.out.println("Convert Decimal number: "+ num);
        System.out.print("To Binary number: "+Integer.toBinaryString(num));
        scanobj.close();

    }

 }