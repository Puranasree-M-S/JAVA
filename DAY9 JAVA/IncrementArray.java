public class IncrementArray {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;  
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + n;
        }
        
        System.out.print("Incremented array: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}