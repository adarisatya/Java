public class Global_Variables 
    {
        static int staticVar = 10;      // Static variable
        int nonStaticVar = 20;          // Non-static (instance) variable
            public static void main(String[] args) 
                {
                    Global_Variables obj1 = new Global_Variables();
                    Global_Variables obj2 = new Global_Variables();

                    // Accessing static variable
                    System.out.println(staticVar); // Output: 10

                    // Accessing non-static variable
                    System.out.println(obj1.nonStaticVar); // Output: 20
                    System.out.println(obj2.nonStaticVar); // Output: 20

                    // Changing values
                    Global_Variables.staticVar = 100;
                    obj1.nonStaticVar = 200;

                    // Static variable changes for all objects
                    System.out.println(Global_Variables.staticVar); // Output: 100

                    // Non-static variable changes only for obj1
                    System.out.println(obj1.nonStaticVar); // Output: 200
                    System.out.println(obj2.nonStaticVar); // Output: 20
                }
    }