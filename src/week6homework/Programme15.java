package week6homework;

public class Programme15 {
    /**15. Write a Java program to swap two variables.
     */
    public static void main(String[] args)
    {
        int a =10; int b =20;
        int c;

        System.out.println("Number1: "+a);
        System.out.println("Number2: "+b);
        System.out.println("After Swapping numbers");
        System.out.println("-----------------------");
        c= a;
        a=b;
        b=c;
        System.out.println("Value of Number1: "+ a);
        System.out.println("Value of Number2: "+b);

    }
}
