public class Operators {
    public static void main(String[] args) {

        // Variables of different data types
        int a = 10;
        int b = 20;
        double c = 25.5;
        char d = 'X';
        String e = "Hello";

        // Arithmetic Operators
        int sum = a + b;
        int difference = b - a;
        double product = a * c;
        double quotient = c / a;
        int remainder = b % a;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        
        // Relational Operators
        System.out.println("a is equal to b: " + (a == b));
        System.out.println("a is not equal to b: " + (a != b));
        System.out.println("a is greater than b: " + (a > b));
        System.out.println("a is less than b: " + (a < b));
        
        // Logical Operators
        System.out.println("a is less than b AND a is less than c: " + ((a < b) && (a < c)));
        System.out.println("a is less than b OR a is greater than c: " + ((a < b) || (a > c)));
        System.out.println("NOT a is equal to b: " + !(a == b));
        
        // Displaying variables of different data types
        System.out.println("Character d: " + d);
        System.out.println("String e: " + e);
    }
}
