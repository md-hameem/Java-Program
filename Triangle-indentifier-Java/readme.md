# Rectangle Direction Checker

This project implements a Java program to determine the orientation of a rectangle based on the coordinates of two opposite corners. The program reads the coordinates from user input and then calculates whether the rectangle is a square, horizontal, or vertical.

## Files

- `Problem1.java`: Contains the implementation of the rectangle orientation checker.

## Functionality

### Main Function

The `main` function performs the following steps:

1. Prompts the user to enter the x and y coordinates of the first corner of the rectangle.
2. Prompts the user to enter the x and y coordinates of the second corner of the rectangle.
3. Calculates the width and height of the rectangle.
4. Determines the orientation of the rectangle:
   - If the width and height are equal, it prints "The rectangle is a square."
   - If the width is greater than the height, it prints "The rectangle is in a horizontal direction."
   - If the height is greater than the width, it prints "The rectangle is in a vertical direction."

### Example Usage

```java
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of the first corner: ");
        int xCoordinate1 = inputScanner.nextInt();
        System.out.print("Enter the y-coordinate of the first corner: ");
        int yCoordinate1 = inputScanner.nextInt();

        System.out.print("Enter the x-coordinate of the second corner: ");
        int xCoordinate2 = inputScanner.nextInt();
        System.out.print("Enter the y-coordinate of the second corner: ");
        int yCoordinate2 = inputScanner.nextInt();

        int width = Math.abs(xCoordinate2 - xCoordinate1);
        int height = Math.abs(yCoordinate2 - yCoordinate1);

        if (width == height) {
            System.out.println("The rectangle is a square.");
        } else if (width > height) {
            System.out.println("The rectangle is in a horizontal direction.");
        } else {
            System.out.println("The rectangle is in a vertical direction.");
        }

        inputScanner.close();
    }
}
```

## Compilation and Execution

To compile and run the program, use the following commands:

```sh
javac Problem1.java
java Problem1
```

## Acknowledgments

- This program uses the `Scanner` class to handle user input.
- The `Math.abs` function is used to calculate the absolute difference between coordinates, ensuring that width and height are positive values regardless of input order.