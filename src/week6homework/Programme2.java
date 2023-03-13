package week6homework;

public class Programme2 {
    /**.2. Write a Java programme using the following steps.
     2.1 Declare two static variables
     2.2 Declare one static method
     2.3 Call both static variables into the static method inside the print statement.
     2.4 Declare the Main method.
     2.5 Call the static method into the Main method and Run the programme.

     *
 */
    static int x=10;//static variable1
    static int y=20;//static variable2
    public static void main(String[] args)//declare main method
    {
        myMethod();// call method in main method
    }
    public static void myMethod()//declare static method
    {
        //call static variable in method
        System.out.println(x);
        System.out.println(y);
    }



}
