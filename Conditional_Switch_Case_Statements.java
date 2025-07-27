public class Conditional_Switch_Case_Statements
    {
        public static void main (String args[])
            {
                // Control Flow Statements - It is used to control the flow of execution of the program based on the given condition. 
                // It is divided into three types - Conditional Statements, Looping Statements, Jump Statements.
                // Conditional / Selection Statements - It is used to perform different actions based on different conditions. 
                // If statement - It is used to execute a block of code if the specified condition is true.
                int i = 10;
                    if (i < 20) // As the condition is satisfied , so it will print the value of i.
                        {
                            System.out.println(i);
                        }
                    else
                        {
                            System.out.println("Condition is not satisfied");
                        }
                // If-else statement - It is used to execute one block of code if the specified condition is true and another block of code if the condition is false.
                int j = 30;
                    if (j < 20) // As the condition is not satisfied , so it will print the else part of it.
                        {
                            System.out.println(j);
                        }
                    else
                        {
                            System.out.println("Condition is not satisfied");
                        }
                // Nested If statement - It is used to check multiple conditions by using nested if statements.
                int k = 40;
                    if (k < 50) // As the condition is satisfied , so it will print the value of k.
                        {
                            System.out.println(k);
                            if (k > 30) // As this condition is also satisfied , so it will print the value of k again.
                                {
                                    System.out.println(k);
                                }
                        }
                    else
                        {
                            System.out.println("Condition is not satisfied");
                        }
                // Example of else-if ladder
                    int score = 75;
                        if (score >= 90) 
                            {
                                System.out.println("Grade: A");
                            } 
                        else if (score >= 80) 
                            {
                                System.out.println("Grade: B");
                            }  
                        else if (score >= 70) 
                            {
                                System.out.println("Grade: C");
                            } 
                        else if (score >= 60)  
                            {
                                System.out.println("Grade: D");
                            } 
                        else 
                            {
                                System.out.println("Grade: F");
                            }
               // Example of nested if condition
                    int age = 25;
                        if (age >= 18) 
                            { // Outer condition
                                System.out.println("You are an adult.");
                                if (age >= 21) 
                                    { // Inner condition
                                        System.out.println("You are eligible to drink alcohol.");
                                    } 
                                else 
                                    {
                                        System.out.println("You are not eligible to drink alcohol.");
                                    }
                            } 
                        else 
                            {
                                System.out.println("You are a minor.");
                            }
                // Print if the number is positive or negative
                    int num = -5;
                    if (num > 0)
                        {
                            System.out.println (num + " " + "is a positive number");
                        }
                    else if (num < 0)
                        {
                            System.out.println(num + " " + "is a negative number");
                        }
                    else
                        {
                            System.out.println(num + " " + "is not an integer");
                        }
                // Print the conditional based program
                    int num1 = 12;
                    if (num1 % 2 == 0 && num1 >=10 && num1 <= 25)
                        {
                            System.out.println("TOM");
                        }
                    else if (num1 %2!=0 && num1 >=10 && num1 <= 25)
                        {
                            System.out.println("JERRY");
                        }
                    else
                        {
                            System.out.println("TOM & JERRY");
                        }
                // Swap 2 numbers using third variable.
                    int a = 10 , b = 20 , c;
                        System.out.println("Pre Swap : " + a + " " + b);
                    c = a;
                    a = b;
                    b = c;
                        System.out.println("Post Swap : " + a + " " + b + " " + c);
                // Swap 2 numbers without using third variable.
                    int d = 10 , e = 20;
                        System.out.println("Pre Swap : " + d + " " + e);
                    d =  d + e;
                    e =  d - e;
                    d =  d - e;
                         System.out.println("Post Swap : " + d + " " + e);
                // Switch Statement - It is used to execute one block of code among many alternatives.
                    int day = 3;
                        switch (day) 
                            {
                                case 1:
                                    System.out.println("Monday");
                                    break;
                                case 2:
                                    System.out.println("Tuesday");
                                    break;
                                case 3:
                                    System.out.println("Wednesday");
                                    break;
                                case 4:
                                    System.out.println("Thursday");
                                    break;
                                case 5:
                                    System.out.println("Friday");
                                    break;
                                case 6:
                                    System.out.println("Saturday");
                                    break;
                                case 7:
                                    System.out.println("Sunday");
                                    break;
                                default:
                                    System.out.println("Invalid day");
                            }
                // Example of switch statement
                    int month = 2;
                        switch (month) 
                            {
                                case 1:
                                    System.out.println("January");
                                    break;
                                case 2:
                                    System.out.println("February");
                                    break;
                                case 3:
                                    System.out.println("March");
                                    break;
                                case 4:
                                    System.out.println("April");
                                    break;
                                case 5:
                                    System.out.println("May");
                                    break;
                                case 6:
                                    System.out.println("June");
                                    break;
                                case 7:
                                    System.out.println("July");
                                    break;
                                case 8:
                                    System.out.println("August");
                                    break;
                                case 9:
                                    System.out.println("September");
                                    break;
                                case 10:
                                    System.out.println("October");
                                    break;
                                case 11:
                                    System.out.println("November");
                                    break;
                                case 12:
                                    System.out.println("December");
                                    break;
                                default:
                                    System.out.println("Invalid month");
                            }
                // Example of switch statement with string
                    String dayName = "Monday";
                        switch (dayName) 
                            {
                                case "Monday":
                                    System.out.println("Start of the week");
                                    break;
                                case "Tuesday":
                                    System.out.println("Second day of the week");
                                    break;
                                case "Wednesday":
                                    System.out.println("Midweek");
                                    break;
                                case "Thursday":
                                    System.out.println("Almost weekend");
                                    break;
                                case "Friday":
                                    System.out.println("End of the work week");
                                    break;
                                case "Saturday":
                                    System.out.println("Weekend!");
                                    break;
                                case "Sunday":
                                    System.out.println("Rest day");
                                    break;
                                default:
                                    System.out.println("Invalid day name");
                            }
                // Validate and print if the character is vowel
                        char ch = 'a';
                        switch (ch) 
                            {
                                case 'a':
                                case 'e':
                                case 'i':
                                case 'o':
                                case 'u':
                                    System.out.println(ch + " is a vowel");
                                    break;
                                default:
                                    System.out.println(ch + " is not a vowel");
                            }
            }
    }

