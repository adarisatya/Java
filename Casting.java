public class Casting    
    {
        public static void main (String args[])
            {
                // Conversion / Casting - It is the process of converting one data type into other data type.
                // Implicit conversion - Widening - COnverting smaller data type into larger data type which will be performed automatically.
                // Explicit conversion - Narrowing - COnverting larger data type into smaller data type to be performed manually.
                byte b = 120;
                int a = b; // It will work as smaller range getting assigned to larger value , by menas of implicit conversion.
                    System.out.println(a);
                int i = 130;
                //byte j = i; - It results in possible lossy conversion from int to byte , as it is smaller range value unable to convert to larger range value.
                byte j = (byte) i; // During the explicit conversion or casting , it will perform modulus operation which means it will compare from the highest reference value of the storing data type - byte and then it will gives the remainder.
                    System.out.println(j); // byte - range value - 256 , the initialized value is 130 , so it will divide the value = 256 - 130 = 126 , in negative due to the reduced value.
                int k = 258;
                byte l = (byte) k;
                    System.out.println(l); // Increased value , so it is returning the positive value.
                float f = 5.69f;
                int g = (int) f;
                    System.out.println(g); // During casting operation from float to int , as int can store non decimal values , so it will consider only value before decimal and stores into the int variable and prints the result.
                int m = 20;
                byte n = (byte) m;
                    System.out.println(n); // During the Casting operation , as the stored value within the range , so it will print the stored value.
            }
    }
