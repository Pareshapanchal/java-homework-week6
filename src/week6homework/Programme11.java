package week6homework;

import java.util.Scanner;
public class Programme11 {
    /**11. Write a Java program to display the following pattern.
     Sample Pattern :
     J a v v a
     J a a v v a a
     J J aaaaa V V aaaaa
     J J a a V a a
     *
     */
    public static void main(String[] args)
    {
        String a,b,c;
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter a Character 1:  ");
        a = scanobj.nextLine();
        System.out.println("Enter a Character 2:  ");
        b = scanobj.nextLine();
        System.out.println("Enter a Character 3:  ");
        c = scanobj.nextLine();
        System.out.println(a.toUpperCase()+" "+b.toLowerCase()+" "+c.toLowerCase()+" "+c.toLowerCase()+" "+b.toLowerCase());
        System.out.println(a.toUpperCase()+" "+b.toLowerCase()+" "+b.toLowerCase()+" "+c.toLowerCase()+" "+c.toLowerCase()+" "+b.toLowerCase()+" "+b.toLowerCase());
        System.out.print(a.toUpperCase()+" "+a.toUpperCase()+" "+b.toLowerCase()+b.toLowerCase()+b.toLowerCase()+b.toLowerCase()+b.toLowerCase()+" "+c.toUpperCase()+c.toUpperCase());
        System.out.println(" "+b.toLowerCase()+b.toLowerCase()+b.toLowerCase()+b.toLowerCase()+b.toLowerCase());
        System.out.println(a.toUpperCase()+" "+a.toUpperCase()+" "+b.toLowerCase()+"  "+b.toLowerCase()+" "+c.toUpperCase()+" "+b.toLowerCase()+"  "+b.toLowerCase());

        System.out.println("-----------------------------------");

        System.out.println("J a v v a");
        System.out.println("J a a v v a a");
        System.out.println("J J aaaaa VV aaaaa");
        System.out.println("J J a  a V a  a");
        scanobj.close();
    }
}
