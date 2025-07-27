public class Operators 
    {
        public static void main (String args[])
            {
                // Operators are special symbols which are used to perform specific operations on operands/values and manipulate their values.
                // Assignment operator '=' - It is used to assign or store the value into a variable.
                int i = 20;
                    System.out.println(i);
                // Aritmetic Operator - It is a symbol or function that performs mathematical operations like addition, subtraction, multiplication, and division.
                int j,k,l,m,n;
                j = 20 + 2;
                k = 20 - 2;
                l = 20 * 2;
                m = 20 / 2;
                n = 20 % 2;
                    System.out.println(j);
                    System.out.println(k);
                    System.out.println(l);
                    System.out.println(m);
                    System.out.println(n);
                // Overloaded Operator - It is called as overloaded operator as it can be used for addition as well as for concatenation. 
                //The '+' sign can be used between strings to add them together to make a new String.
                // Concatenation is the process of joining two or more strings into one larger string.
                int a = 20;
                String b = "is an Integer Value";
                String Concat  = a + " " + b;
                    System.out.println(Concat);
                // Comparision Operator - It is used to compare two values and return a boolean value. It will check the equality and inequality between two values.
                int o = 20, p = 30;
                boolean q = o == p;
                    System.out.println(q);
                boolean r = 10 % 2 == 'A' - 'A';
                    System.out.println(r);
                // Relational Operator - It is used to compare two values and return a boolean value.It will check the relative size or order between two values
                int s = 20, t = 30;
                boolean u = s > t;
                    System.out.println(u);
                boolean v = s < t;
                    System.out.println(v);
                boolean w = s >= t;
                    System.out.println(w);
                boolean x = s <= t;
                    System.out.println(x);
                boolean y = s != t;
                    System.out.println(y);
                boolean z = s == t;
                    System.out.println(z);
                int x1 = 7;
                int y1 = 5;
                int a1 = 6;
                int b1 = 9;
                    boolean result = x1 > y1 || a1 < b1 || a1 < 1;
                    System.out.println(result);
                    System.out.println(!result);
                // Logical Operator - It is used to perform logical operations on boolean values.
                boolean A = true, B = false;
                boolean C = A && B;
                    System.out.println(C);
                boolean D =  ((10==10) && (10+30 != 40));
                    System.out.println(D);
                boolean E = ((10!=10) || (30>26));
                    System.out.println(E);
                /*boolean F = (true > 100); It is commented as the bad operand type is declared for the binary comparision. - Boolean cannot be compared with integer
                    System.out.println(F);*/ // Symbolic representation - boolean !(==) integer     
                /*boolean G = (10 > 20 >30); By means of single operator, it is not possible to compare three values - as it will throw an compile time error.
                    System.out.println(G);*/
                // Increment Operator - It is used to increase the value of an operand by 1.
                // Pre-Increment - It is used to increase the value of an operand by 1 before using it in an expression.
                int H = 10;
                int I = ++H + ++H;
                int J = ++I;
                    System.out.println(H + " " + I + " " + J);
                // Post-Increment - It is used to increase the value of an operand by 1 after using it in an expression.
                int K = 10;
                int L = K++ + K++;
                int M = L++;
                    System.out.println(K + " " + L + " " + M);
                //Decrement Operator -  It is used to decrease the value of an operand by 1.
                //Pre-Decrement - It is used to decrease the value of an operand by 1 before using it in an expression.
                int N = 15;
                int O = --N + --N;
                int P = --O;
                    System.out.println(N + " " + O + " " + P);
                // Post-Decrement - It is used to decrease the value of an operand by 1 after using it in an expression.
                int Q = 20;
                int R = Q-- + Q--;
                int S = R--;
                    System.out.println(Q + " " + R + " " + S);
                //Combination of Operators - It is used to combine two or more operators to perform a single operation.
                int T = 10, U = 20, V = 30;
                System.out.println(T + U * V); // It will perform the multiplication first and then addition as per the operator precedence.
                int W = 20 , X = 30 , Y = 40;
                int Z = W * Y + X; // It is used to add the value of X to W and then assign the result to W.
                System.out.println(Z);
                //Unary Operator - It is used to perform an operation on a single operand.
                int A1 = 10;
                System.out.println(A1++); // It will print the value of A1 and then increment it by 1.
                System.out.println(A1); // It will print the incremented value of A1.
            }
    }



