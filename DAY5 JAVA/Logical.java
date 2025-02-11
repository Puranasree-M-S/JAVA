public class Logical {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("a is less than b AND a is less than c: " + ((a < b) && (a < c)));  // Logical AND
        System.out.println("a is less than b OR a is greater than c: " + ((a < b) || (a > c)));  // Logical OR
        System.out.println("NOT a is equal to b: " + !(a == b));  // Logical NOT    

    }

}
