import java.util.Scanner;

public class SumOfOddPositionElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = scan.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        
        int sum = 0;
        for (int i = 1; i < size; i += 2) {
            sum += array[i];
        }
        
        System.out.println("Sum of odd positions in the array: " + sum);
        
        scan.close();
    }
}
