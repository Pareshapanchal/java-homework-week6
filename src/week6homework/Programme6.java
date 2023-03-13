package week6homework;

import java.util.Scanner;
public class Programme6 {
    /**6. Write a program to enter any radius value of the circle and find out the
     area.(Formula of Area A=PI*r*r).
     *
     */
    static double r;
    static double pi=3.14;

    public static void main(String[] args)
    {
        Scanner scanobj = new Scanner(System.in);
        Programme6 obj = new Programme6();

        System.out.println("Enter radius:  ");
        r  = scanobj.nextDouble();
        areaCircle(r);

        double area = areaCircle(r);
        System.out.println("Area of Circle:  "+ area);
        scanobj.close();
    }
    public static double areaCircle(double r)//static method
    {
        double area1 = pi *r*r;

        return area1;

    }
}
