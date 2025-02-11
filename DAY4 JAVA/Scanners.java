import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); 

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        input.close();
    }
}