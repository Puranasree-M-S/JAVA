
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of the array:");

        int n = scan.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter the elements:");

        for(int i=0; i<arr.length; i++)
        {
        arr[i] = scan.nextInt();
        sum += arr[i];
        }
       
        System.out.println("The sum of array is:" +sum);
        scan.close();
    }
}