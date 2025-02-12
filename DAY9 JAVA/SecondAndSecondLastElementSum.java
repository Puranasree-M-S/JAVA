public class SecondAndSecondLastElementSum {
    public static void main(String[] args) {

        int arr[] = {21, 15, 8, 96, 25};      
        int sum = arr[1] + arr[arr.length - 2];
        
        System.out.println("Sum of Second and Second Last Element is: " + sum);
    }
}