public class Literals
    {
        public static void main (String args[])
            {
                //Syntax : DataType variableName = value;
                boolean b = true;
                boolean c = false;
                    if (b==c) // As in Comparision , values are in mismatch , so the else condition applies on it).
                        {
                            System.out.println("Condition is :" + b);
                        }
                    else
                        {
                            System.out.println("Mismatch in comparision");
                        }
                char d ='K';
                char d1=d++; // Post increment - Initially it will stores the value and then it will increment  based on the clause as it is already stored , so only stored value will be printed.
                    System.out.println(d1);
                char d2=--d1;// Pre decrement - Initially it will decrement the value and stores the value , so decremented stored value will be printed.
                    System.out.println(d2); 
                byte num = 120;
                    if (num >=13) // In this case , num is greater than the compared value , so if condition is satisfied and incrementing by arithmetic operator.
                        {
                            System.out.println(num + 1);
                        }
                    else 
                        {
                            System.out.println("Condition is not satisfied");
                        }
                short s = 32766;
                    if(s>=32767) // It will be qualified for lossy conversion due to the incompatible range value for the short reserved literal keyword , so it is executing else case.
                            {
                                int s1 = s - 1;
                                System.out.println(s1);
                            }
                    else
                        {
                            System.out.println("Incompatible");
                        }
                int i = 32769;
                    System.out.println(i);
                long l = 253748567;
                    System.out.println(l);
                float f = 5.68f;
                    System.out.println(f);
                double e = 6.84f;
                    System.out.println(e);
                double num1 = 12e10;
                System.out.println(num1);
            }
    }
