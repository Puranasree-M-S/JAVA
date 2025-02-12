public class FourthAndFourthLastElementSum {
    
    public static void main(String[] args) {

        int arr[] = {21, 15, 18, 96, 25, 50, 65, 75, 90};      
        int sum = arr[3] + arr[arr.length - 4];
        
        System.out.println("Sum of Second and Second Last Element  is: " + sum);
    }

}
