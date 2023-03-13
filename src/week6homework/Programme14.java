package week6homework;
import java.util.Scanner;
public class Programme14 {
    /**14. Write a Java program to print the area and perimeter of a rectangle.
     Test Data:
     Width = 5.5 Height = 8.5
     Expected Output:
     Area is 5.6 * 8.5 = 47.60
     Perimeter is 2 * (5.6 + 8.5) = 28.20
     *
     */
    public static void main(String[] args)
    {
        Scanner scanobj= new Scanner(System.in);

        System.out.println("Enter Rectangle Width: ");
        double w = scanobj.nextDouble();
        System.out.println("Enter Rectangle Height: ");
        double h = scanobj.nextDouble();

        double area = w*h;
        double peri = 2*(w+h);

        System.out.println("Area of Rectangle:  "+ area);
        System.out.println("Perimeter of Rectangle: "+peri);

        scanobj.close();

    }
}
