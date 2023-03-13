package week6homework;

import java.util.Scanner;

public class Programme5 {
    /**5. Write a program for a calculator with addition, subtraction, multiplication
     and division methods all with parameters and use string concatenation
     methods.(Note: Two static and Two instance methods.)
     *
     */
    public static void main(String[] args)
    {   double num1,num2;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter Number1:-->");
        num1= scanobj.nextDouble();
        System.out.println("Enter Number2:-->");
        num2 = scanobj.nextDouble();

        Programme5 obj = new Programme5();

        obj.Addition(num1,num2);
        obj.Substraction(num1,num2);
        multiplication(num1,num2);
        division(num1,num2);

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
}
