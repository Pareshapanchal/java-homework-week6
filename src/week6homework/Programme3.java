package week6homework;

public class Programme3 {
    /**3. Write a Java programme using the following steps.
     3.1 Declare one instance and one static variable.
     3.2 Declare one instance method.
     3.3 Declare one static method.
     3.4 Call both instance and static variables into both instance and static methods inside the
     print statement.
     3.5 Declare the Main method.
     3.6 Call both instance and static methods into the Main method and run the programme.
     *
     */
    int a =10;//instance variable
    static int b =20;// static variable
    public static void main(String [] args)//declare a main method
    {
        Programme3 obj = new Programme3();
        obj.myMethod1();//calling instance method
        myMethod2();//calling static method

    }
    public void myMethod1()//declare a instance method
    {
        Programme3 obj = new Programme3();
        System.out.println(obj.a);//calling instance variable in instance method
        System.out.println(b);//calling static variable in instance method

    }
    public static void myMethod2()//declare a static method
    {
        Programme3 obj = new Programme3();
        System.out.println(obj.a);//calling instance variable in static method
        System.out.println(b);//calling static variable in static method
    }
}
