package week6homework;

import java.util.Scanner;

public class Programme18 {
    /**18. Write a Java program to print the sum (addition), multiply, subtract, divide and
     remainder of two numbers.*/
    public static void main(String[] args)
    {
        double num1,num2;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter Number1:-->");
        num1= scanobj.nextDouble();
        System.out.println("Enter Number2:-->");
        num2 = scanobj.nextDouble();

        Programme18 obj = new Programme18();

        obj.Addition(num1,num2);
        obj.Substraction(num1,num2);
        multiplication(num1,num2);
        division(num1,num2);
        mod(num1,num2);

        scanobj.close();
    }
    public void Addition(double num1, double num2)//instance method1
    {
        double add = num1+num2;
        System.out.println(num1+ " + "+ num2 + " = " + add);
    }
    public void Substraction(double num1, double num2)//instance method2
    {   double sub = num1 -num2;
        System.out.println(num1 + " - "+ num2 + " = " + sub);
    }
    public static void multiplication(double num1, double num2)//static method1
    {   double mul = num1*num2;
        System.out.println(num1 + " * " + num2 + " = " + mul);
    }
    public static void division(double num1, double num2)//static method2
    {
        double div = num1/num2;
        System.out.println(num1 + " / " + num2 + " = " + div);
    }
    public static void mod(double num1,double num2)
    {
        double mod = num1%num2;
        System.out.println(num1+"mod"+num2+"="+mod);
    }
}
