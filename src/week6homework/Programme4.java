package week6homework;

public class Programme4 {
    /**4. Write a Java programme using the following steps.
     4.1 Declare two instance and two static variables.
     4.2 Declare one instance method.
     4.3 Declare one static method.
     4.4 Call all four instance and static variables into both instance and static methods inside the
     print statement.
     4.5 Declare the Main method.
     4.6 Call both instance and static methods into the Main method and run the programme.
     *
     */
    int a =10; int b =20;// two instance variables
    static int x =30; static int y =40;// two static variables
    public static void main(String[] args)//declare the main method
    {
        Programme4 obj = new Programme4();
        System.out.println("Calling 2 Instance 2 Static variables from Instance Method");
        obj.myMethod();//calling instance method
        System.out.println("Calling 2 Instance 2 Static variables from Static Method");
        myMethod1();//calling static method
    }
    public void myMethod()//declare instance method
    {
        Programme4 obj = new Programme4();
        System.out.println("Instance_variable: "+obj.a);//calling instance variables in instance method
        System.out.println("Instance_variable: "+obj.b);
        System.out.println("Static_variable:  "+ x);//calling static variables in instance method
        System.out.println("Static_variable:  "+y);


    }
    public static void myMethod1()//declare static method
    {
        Programme4 obj = new Programme4();
        System.out.println("Instance_variable: "+obj.a);//calling instance variables in static method
        System.out.println("Instance_variable: "+obj.b);
        System.out.println("Static_variable:  "+x);//calling static variables in static method
        System.out.println("Static_variable:  "+y);
    }

}
