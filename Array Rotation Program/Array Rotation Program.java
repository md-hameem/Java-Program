import java.util.Arrays;


public class RotateElement {

    public static void main(String[] args) {
        int[] originalArray = {2, 3, 5, 7, 11, 13};

        System.out.println("Original array: " + Arrays.toString(originalArray));

        rotateArrayToLeft(originalArray);

        System.out.println("Rotated array: " + Arrays.toString(originalArray));
    }

    public static void rotateArrayToLeft(int[] array) {
        int firstElement = array[0];
        System.arraycopy(array, 1, array, 0, array.length - 1);
        array[array.length - 1] = firstElement;
    }
}