public class MiddleElement {
    public static void main(String[] args) {
        int arr[] = {15,34,28,90,57};
        
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        
        int midElement = arr[arr.length / 2];
        System.out.println("Middle element is: " + midElement);
    }
}