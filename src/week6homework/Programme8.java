package week6homework;

import java.util.Scanner;

public class Programme8 {
    /**
     * 8. Write a program to calculate the area of a triangle
     * triangle area =1/2*b*h
     */
    static int h,b; static double area;
    public static void main(String [] args)
    {
        Scanner scanobj = new Scanner(System.in);
        Programme8 obj = new Programme8();

        System.out.println("Enter Height of Triangle:--> ");
        h = scanobj.nextInt();
        System.out.println("Enter Base of Triagle:-->  " );
        b = scanobj.nextInt();

        area = obj.triArea(h,b);
        System.out.println("Area of Triangle(1/2*B*H):  " + area);

        scanobj.close();

    }
    public double triArea(int h, int b)
    {
        double area1 = 0.5 *h*b;
        return area1;
    }

}
