# Array Rotation Program

This Java program rotates the elements of an array to the left. It shifts each element of the array one position to the left, with the first element moving to the last position.

## Files

- `RotateElement.java`: Contains the implementation of the array rotation program.

## Functionality

### Main Function

The `main` function initializes an array with integer elements, prints the original array, calls the `rotateArrayToLeft` function to rotate the array to the left, and then prints the rotated array.

### `rotateArrayToLeft` Function

This function performs the rotation of the array elements to the left. It first stores the value of the first element of the array, then uses `System.arraycopy` to shift all elements one position to the left, and finally assigns the stored value to the last position of the array.

## Example Usage

```java
public class RotateElement {
    public static void main(String[] args) {
        int[] originalArray = {2, 3, 5, 7, 11, 13};

        System.out.println("Original array: " + Arrays.toString(originalArray));

        rotateArrayToLeft(originalArray);

        System.out.println("Rotated array: " + Arrays.toString(originalArray));
    }

    // Other functions are similar to those described in the Functionality section
}
```

## Compilation and Execution

To compile and run the program, use the following commands:

```sh
javac RotateElement.java
java RotateElement
```

## Acknowledgments

- This program utilizes Java's `System.arraycopy` method to perform array manipulation efficiently.
- The program demonstrates basic Java programming concepts such as arrays and functions.