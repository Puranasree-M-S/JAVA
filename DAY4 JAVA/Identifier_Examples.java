public class Identifier_Examples {
    public static void main(String[] args) {

        String userName = "Puranasree"; // Starts with camelcase (camelcase=uppercase+lowercase)
        int age = 25; // Starts with an lowercase
        int _count = 100;  // Starts with an underscore
        int $price = 50;  // Starts with a dollar sign
        int num1 = 5;      // Contains letters and digits
        double total_price = 99.99;  // Contains underscore
        String $currency = "USD";  // Contains dollar sign
        final double PI_VALUE = 3.14159;  // Constant in uppercase
        final int MAX_USERS = 100;  // UPPER_CASE with underscores

        System.out.println("User Name:" + userName);  // Prints the User Name
        System.out.println("Age:" + age); // Prints the Age      
        System.out.println("Count:" + _count); // Prints the Count
        System.out.println("Price:" + $price); // Prints the Price
        System.out.println("Num1:" + num1); // Prints the num1 value
        System.out.println("Total Price:" + total_price); // Prints the Total Price
        System.out.println("Currency:" + $currency); // Prints the Currency
        System.out.println("Value of PI:" + PI_VALUE); // Prints the Value of PI
        System.out.println("Maximum no of Users:" + MAX_USERS); // Prints the Maximum no of Users
        
    }    
    
}
