public class ThirdAndThirdLastElementSum {

        public static void main(String[] args) {
    
            int arr[] = {11, 24, 37, 44, 53, 60, 70};      
            int sum = arr[2] + arr[arr.length - 1];
            
            System.out.println("Sum of First and Last Element is: " + sum);
        }

}