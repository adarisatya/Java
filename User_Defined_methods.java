public class User_Defined_methods // User Defined Method : It is a block of code that performs a specific task. It is defined by the user and can be called whenever needed. It helps in code reusability and makes the program more organized.
    {
        // Method to add two numbers & Method with Return Type
        static int add(int a, int b) // Method Signature
        {
            return a + b; // Method Body
        }

        // Method to subtract two numbers
        static int subtract(int a, int b) // Method Signature
        {
            return a - b; // Method Body
        }
        public static void main (String args[])
            {
                int a = 5 , b = 7 ;
                System.out.println("Addition of " + a + " and " + b + " is: " + add(a, b)); // Calling the add method
                System.out.println("Subtraction of " + a + " and " + b + " is: " + subtract(a, b)); // Calling the subtract method
                areaOfRectangle();
                area_rec(5,4);
                area_square(5);
                area_circle(4,5);
                customer("Alpha","Prawns",200);
                restaurant(12);
                rider("Hyderabad", 8453637456l);
                System.out.println("areaOfCircle with return Type and Arguments");
                float areac = areaOfCircle(4);
                System.out.println(areac);
                float areac1 = areaOfCircle(5);
                System.out.println(areac1);
                System.out.println("areaofcircle , areaoftriangle , areaofsquare  with return Type and Arguments");
                float areac2 = areaofcircle(6);
                System.out.println(areac2);
                float areac3 = areaoftriangle(7.54f,8);
                System.out.println(areac3);
                int areac4 = areaofsquare(9);
                System.out.println(areac4);
                String areac5 = areas(9,10,11,12);
                System.out.println(areac5);
                System.out.println("Validation of Validate method");
                String s = validate("john99","145");
                System.out.println(s);
                areac ac1 = new areac();
                String s1 = ac1.areaOfC(2);
                System.out.println(s1);
                double ac = ac1.areaofC(6.5);
                System.out.println(ac);
            }
        // Print the Area of Rectangle  
        //Input parameters : L - Length , B - Breadth
        //Logic : L * B
        static void areaOfRectangle() // Without Arguments // Method with non return type
            {
                int l1 = 4 , b1 = 5 ;
                int area = l1 * b1; 
                System.out.println("Area of Rectangle is: " + area);
            }   
        public static void area_rec (int l2 , int b2) // With Arguments
            {
                int area_1;
                area_1 = l2 * b2;
                System.out.println(area_1);

            }
        public static void area_square(int side)
            {
                int area_2; 
                area_2 = side * side;
                System.out.println(area_2);
            }
        public static void area_circle(int radius, int radius_1)
            {
                int area_3;
                float f = 3.141f;
                int g = (int) f;
                area_3 = radius * radius * g;
                double area_4 = radius_1 * radius_1 * 3.141;
                System.out.println(area_3);
                System.out.println(area_4);
            }
        // Create a class for food order.
        public static void customer (String restaurant, String item_name , int payment)
            {
                System.out.println("Restaurant is :" + " " + restaurant);
                System.out.println("Item Name is :" + " " + item_name);
                System.out.println("Payment is :" + " " + payment);
            }
        public static void restaurant(int order_id)
            {
                System.out.println("Order id is :" + " " + order_id);
            }
        public static void rider(String Address, long cust_contact)
            {
                System.out.println("Customer address is :" + " " + Address);
                System.out.println("Contact number is :" + " " + cust_contact);
            }
        public static float areaOfCircle (int radius)
            {
                return 3.141f * radius * radius;
            }
        public static float areaofcircle (int radius)
            {
                return 3.141f * radius * radius;
            }
        public static float areaoftriangle (float b , int h)
            {
                return 0.5f * b * h;
            }
        public static int areaofsquare (int side)
            {
                return side*side;
            }
        public static String areas(int r , int l3 , int b3 , int s1)
            {
                return "Circumference of Circle : " + " " + (2 * 3.141f * r ) + "\nArea of Rectangle : " + " " + (l3 * b3) + "\nArea of Square : " + " " + (s1 * s1);
            }
        public static String validate (String uname , String pwd)
            {
                if (uname=="john" && pwd=="123")
                    {
                        return "Valid User";
                    }
                else
                    {
                        return "Invalid User";
                    }
            }
                   
    }
class areac
    {
        public String areaOfC(int radius1)
            {
                return "Area of Circle";
            }
        double areaofC(double radius2)
            {
                return 3.141 * radius2 * radius2;
            }
    }
// The above code defines a class User_Defined_methods that contains various methods to perform different tasks such as calculating the area of shapes, validating user credentials, and printing customer details. The main method calls these methods and prints the results. The areac class is used to demonstrate the use of methods with return types and arguments. 
// The code also includes comments explaining the purpose of each method and its parameters. The methods are static, meaning they can be called without creating an instance of the class. The code demonstrates the concept of user-defined methods in Java, which allows for code reusability and better organization.
// The code is well-structured and follows good programming practices such as using meaningful variable names, proper indentation, and comments for clarity. It also demonstrates the use of different data types such as int, float, and String. Overall, the code is a good example of how to create and use user-defined methods in Java.