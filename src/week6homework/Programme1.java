package week6homework;

public class Programme1 {
           /**
         * Write a Java programme using the following steps
         * 1.1 Declare two instance variables
         * 1.2 Declare one instance method.
         * 1.3 Call both instance variables into the instance method inside the print statement.
         * 1.4 Declare the Main method.
         * 1.5 Call the above instance method into the Main method and Run the programme.
         */
        int x=10;//instance variables1
        int y=20;//instance variables2
        public static void main(String [] args)//declare main method
        {
            Programme1 obj = new Programme1();
            obj.myMethod();//calling method
        }
        public void myMethod()//instance method
        {
            Programme1 obj = new Programme1();
            //call both variables in to instance method
            System.out.println(obj.x);
            System.out.println(obj.y);
        }

    }


