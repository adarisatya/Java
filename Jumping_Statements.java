public class Jumping_Statements{

    // Demonstration of 'break' statement
    public static void breakExample() {
        System.out.println("break statement example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exits the loop when i equals 5
            }
            System.out.println("i = " + i);
        }
        System.out.println("Exited the loop using break.\n");
    }

    // Demonstration of 'continue' statement
    public static void continueExample() {
        System.out.println("continue statement example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue; // Skips the rest of the loop when i equals 3
            }
            System.out.println("i = " + i);
        }
        System.out.println("Completed loop using continue.\n");
    }

    // Demonstration of 'return' statement
    public static void returnExample() {
        System.out.println("return statement example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                System.out.println("Returning from the method at i = " + i);
                return; // Exits the method when i equals 4
            }
            System.out.println("i = " + i);
        }
        System.out.println("This line will not be executed if return is called above.");
    }

    public static void main(String[] args) {
        // Call each example one by one
        breakExample();
        continueExample();
        returnExample();

        System.out.println("End of main method.");
    }
}