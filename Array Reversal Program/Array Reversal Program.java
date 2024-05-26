import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        
        System.err.println("The recorded arrays: "+ Arrays.toString(array));

        reverseArray(array);

        System.out.print("Reversed Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}