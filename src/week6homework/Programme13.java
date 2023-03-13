package week6homework;
import java.util.Scanner;
public class Programme13 {
    /**
     * 13. Write a Java program that takes three numbers as input to calculate and
     * print the average of the numbers.
     */
    public static void main(String[] args)
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter Number1: ");
        double num1 = scanobj.nextDouble();
        System.out.println("Enter Number2: ");
        double num2 = scanobj.nextDouble();
        System.out.println("Enter Number3: ");
        double num3 = scanobj.nextDouble();

        double avg = ((num1+num2+num3)/3);

        System.out.println("Average:  "+ avg);

        scanobj.close();
    }
}
