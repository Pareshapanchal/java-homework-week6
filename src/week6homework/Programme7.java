package week6homework;

import java.util.Scanner;

public class Programme7 {
    /**7. Write a program to insert any temperature value in degree Fahrenheit and
     convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     *
     */
    static double fah,cel;
    public static void main(String [] args)
    {
        Scanner scanobj = new Scanner(System.in);
        Programme7  obj = new Programme7();

        System.out.println("Enter Temperature in Fahrenheit:-->");
        fah = scanobj.nextDouble();
        obj.degreeCel(fah);

        double result = obj.degreeCel(fah);
        System.out.println("Temperature convert from Fahrenheit:  "+ fah + " to Celsius:   "+ result);
        scanobj.close();

    }
     public double degreeCel(double f)
    {
        double cel = ((f - 32)*5/9);
        return cel;
    }

}
