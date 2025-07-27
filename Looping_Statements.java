public class Looping_Statements 
    {
        public static void main(String[] args) {
            {
                // Looping Statements - It is used to execute a block of code repeatedly until the specified condition is false.
                // For Loop - It is used when the number of iterations is known.
                // Syntax : for (initialization; condition; increment/decrement) { // code to be executed }
                for (int i = 0; i < 5; i++) 
                    {
                        System.out.println("For Loop Iteration: " + i);
                    }
                for (int l = 0; l<=5; l++)
                    {
                        System.out.println("DAY : " + l);
                            for (int m = 0; m<=8; m++)
                                {
                                    System.out.println(" " + (m+9) + " - " + (m+10));
                                }
                    }
                // Print the numbers between 1 to 50 which are even.
                for (int n = 1; n <= 50; n++)
                    {
                        if (n % 2 == 0)
                            {
                                System.out.println(n);
                            }
                    }
                //Print the count of numbers between 1 to 20 which are even.
                int count = 0;
                for (int o = 1; o <= 20; o++)
                    {
                        if(o%2==0)
                            {
                                count++;
                            }
                    }
                    System.out.println("Final count is : " + " " + count);
                //Print the sum of numbers between 1 to 10 which are even.
                int sum = 0;
                for (int p=1; p<=10; p++)
                    {
                        if (p%2==0)
                            {
                                sum++; // sum = sum + p | sum + = p
                            }
                    }
                        System.out.println("Final sum is : " + " " + sum);
                //Print the product of numbers between 1 to 10 which are even.
                int product = 1;
                for (int q=1; q<=10; q++)
                    {
                        if (q%2==0)
                            {
                                product = product * q; // sum = sum + p | sum + = p
                            }
                    }
                        System.out.println("Final value is : " + " " + product);
                //Print the count , sum , product of numbers between 11 to 17 which are  not divisible in 5
                int p1 = 1 , s1 =0 , c1 =0 ;
                for (int r=11; r<=17; r++)
                    {
                        if (r%5!=0)
                            {
                                p1 *= r;
                                s1 +=r;
                                c1 +=1;
                            }
                    }
                        System.out.println("Final value of p1 is : " + " " + p1);
                        System.out.println("Final sum of s1 is : " + " " + s1);
                        System.out.println("Final count of c1 is : " + " " + c1);
                // Print the multiples of 5 in the format of multiplication.
                int s = 5 , t,u;
                for (t=1; t<=12; t++)
                    {
                        u=0;
                        u = s * t;
                        System.out.println(s + " " + "*" + " " + t + " " + "=" + " " + u);                                      
                    }  
                //Print the reverse value of the number
                int num = 123 , rev = 0 , rem ;
                while (num >0)
                    {                           // 123 > 0 | 12 > 0 | 1 > 0
                        rem = num % 10;         // 123 % 10 = 3 | 12 % 10 = 2 | 1 % 10 = 1 
                        num = num / 10;         // 123 / 10 = 12 | 12 / 10 = 1 | 1/ 10 = 0
                        rev = rev * 10 + rem;   // 0 * 10 + 3 = 3 | 3 * 10 + 2 = 32 | 32 * 10 + 1 = 321 
                    }
                        System.out.println(rev);
                // Print and validate the number 121 is palindrome number.
                //Palindrome number - A palindrome number is a number that remains the same when its digits are reversed. 
                int num1 = 121 , rev1 = 0 , rem1;
                int temp = num1;
                while (num1 > 0)
                    {
                        rem1 = num1 % 10;
                        num1 = num1 / 10;
                        rev1 = rev1 * 10 + rem1;
                    }
                        if (temp == rev1)
                            {
                                System.out.println(temp + " " + "is a palindrome number");
                            }
                        else 
                            {
                                System.out.println(temp + " " + "is not a palindrome number");
                            }
                //Fibnocci series - A Fibonacci series is a series of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1.
                int f1 = 0 , f2 = 1, f3;
                    System.out.print(f1 + " " + f2);
                        for(int i = 1; i <= 8; i++)
                            {
                                f3 = f1 + f2;
                                System.out.print(" " + f3);
                                f1 = f2;
                                f2 = f3;
                            } 
                                System.out.println(" ");
                // Print to check 7 is prime number.
                int num2 = 7 ,count2=0;
                for (int v = 1; v <= 7; v++)
                            {
                                if(num2 % v == 0)
                                    {
                                        count2++;
                                    }
                            }
                                if(count2 == 2)
                                    {
                                        System.out.println(num2 + " " + "is a prime number");
                                    }
                                else
                                    {
                                        System.out.println(num2 + " " + "is a composite number");

                                    }
                // Print the numbers excluding the multiples of 7.
                int x;
                for (x = 1; x <= 100; x++)
                    {
                        if (x % 7 != 0)
                        {
                            System.out.println(x);
                        }
                    }
                // Print all the prime numbers between 1 to 15.
                int y1;
                for (y1 = 1 ; y1 <= 15 ; y1++)
                    {
                        int count1 = 0;
                        int z;
                        for (z = 1;z <= y1 ; z++)
                            {
                                if (y1 % z ==0)
                                {
                                    count1++;
                                }
                            }
                        if(count1 == 2)
                            {
                                System.out.println(y1);
                            }
                    }
                // While Loop - It is used when the number of iterations is not known.
                int j = 0;
                while (j < 5) 
                    {
                        System.out.println("While Loop Iteration: " + j);
                        j++;
                    }
                // Print -20 to -11 & 45 to 20
                int y = -20;
                while (y <= -11)
                    {
                        System.out.println(y);
                        y++;
                    }
                int z = 45;
                while (z >= 20)
                    {
                        System.out.println(z);
                        z--;
                    }
                // Armstrong number - An Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits.
                int num3 = 153 , rem3 , arm = 0;
                int temp1 = num3;
                while (num3 > 0)
                    {
                        rem3 = num3 % 10; // 153 % 10 = 3 | 15 % 10 = 5 | 1 % 10 = 1
                        arm = arm + (rem3 * rem3 * rem3); // 0 + (3 * 3 * 3) = 27 | 27 + (5 * 5 * 5) = 152 | 152 + (1 * 1 * 1) = 153
                        num3 = num3 / 10; //153 / 10 = 15 | 15 / 10 = 1 | 1 /10 =0
                    }
                        if (arm == temp1)
                            {
                                System.out.println(temp1 + " " + "is an Armstrong number");
                            }
                        else 
                            {
                                System.out.println(temp1 + " " + "is not an Armstrong number");
                            }
                // Print the numbers between 1 to 100 which are divisible by 3 and 5.
                for (int a = 1; a <= 100; a++)
                    {
                        if (a % 3 == 0 && a % 5 == 0)
                            {
                                System.out.println(a);
                            }
                    } 
                // Print A to Z alphabets using ASCII values.
                /*char ch='A';
                 while(ch<='Z')
                    {
                        System.out.println(ch);
                        ch++;
                    }*/
                char ch1='A';
                    while(ch1<='Z')
                       {
                            if (ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O'|| ch1 == 'U') 
                                {
                                    System.out.println(ch1);
                                }   
                                    ch1++;            
                       }
                // Print the sum of even digits for the below number.
                //num = 234567 || O/P = 12 || LOGIC = 2+4+6
                int num4 = 234567 , rem4 , sum4 = 0;
                while (num4 > 0)
                       {
                        rem4 = num4 % 10;
                        if (rem4 % 2 == 0)
                            {
                                sum4 = sum4 + rem4;
                            }
                                num4 = num4 / 10;
                       }
                            System.out.println(sum4);
                // Do-While Loop - It is similar to while loop but it executes at least once even if the condition is false.
                int k = 0;
                do 
                    {
                        System.out.println("Do-While Loop Iteration: " + k);
                        k++;
                    } 
                while (k < 0);
            }
        }
    }