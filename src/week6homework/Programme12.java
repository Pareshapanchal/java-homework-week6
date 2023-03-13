package week6homework;
import java.util.Scanner;
public class Programme12 {
    /**
     * 12. Write a Java program to compute the specified expressions and print the
     * output.
     * Test Data:
     * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     * Expected Output : 2.138888888888889
     */
    public static void main(String[] args)
    {
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter Num 1: ");
        double num1 = scanobj.nextDouble();
        System.out.println("Enter Num 2: ");
        double num2 = scanobj.nextDouble();
        System.out.println("Enter Num 3: ");
        double num3 = scanobj.nextDouble();
        System.out.println("Enter Num 4: ");
        double num4 = scanobj.nextDouble();
        double form = (num1*num2-num2*num2)/(num3-num4);
        System.out.println("Formula[(Num 1* Num 2 - Num2 * Num2)/(Num3 - Num 4)]:  " + form);
        scanobj.close();


    }
}
