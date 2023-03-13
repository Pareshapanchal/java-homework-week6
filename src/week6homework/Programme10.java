package week6homework;

import java.util.Scanner;
public class Programme10 {
    /**10. Write a Java program that takes a number as input and prints its
     multiplication table up to 10.
     Test Data: Input a number: 8
     Expected Output :
     8 x 1 = 8
     8 x 2 = 16
     8 x 3 = 24
     ...
     8 x 10 = 80
     *
     */
    static int num;
    public static void main(String[] args)
    {
        Scanner scanobj= new Scanner(System.in);
        System.out.println("Enter a number");
        num = scanobj.nextInt();

        System.out.println(num+ " * "+  " 1 "+ " = " + num);
        System.out.println(num+ " * "+  " 2 "+ " = " + num*2);
        System.out.println(num+ " * "+  " 3 "+ " = " + num*3);
        System.out.println(num+ " * "+  " 4 "+ " = " + num*4);
        System.out.println(num+ " * "+  " 5 "+ " = " + num*5);
        System.out.println(num+ " * "+  " 6 "+ " = " + num*6);
        System.out.println(num+ " * "+  " 7 "+ " = " + num*7);
        System.out.println(num+ " * "+  " 8 "+ " = " + num*8);
        System.out.println(num+ " * "+  " 9 "+ " = " + num*9);
        System.out.println(num+ " * "+  " 10 "+ " = " + num*10);
        scanobj.close();


    }
}
