# Triangle Analyzer

This project implements a Java program to analyze the type of a triangle based on its angles. The program reads the angles from user input and determines whether the triangle is a right-angle triangle, an obtuse triangle, or an acute triangle. It also checks if the input angles form a valid triangle.

## Files

- `TriangleAnalyzer.java`: Contains the implementation of the triangle analysis functions and the `main` function to demonstrate their usage.

## Functionality

### Main Function

The `main` function performs the following steps:

1. Prompts the user to enter the three angles of the triangle.
2. Checks if the input angles form a valid triangle using the `isValidTriangle` method.
3. Determines the type of triangle:
   - If one of the angles is 90 degrees, it prints "The triangle is a right-angle triangle."
   - If one of the angles is greater than 90 degrees, it prints "The triangle is an obtuse triangle."
   - If all angles are less than 90 degrees, it prints "The triangle is an acute triangle."
4. If the angles do not form a valid triangle, it prints "Invalid input. The angles do not form a valid triangle."

### Helper Functions

#### `private static boolean isValidTriangle(double angleA, double angleB, double angleC)`

This function checks if the sum of the three angles is equal to 180 degrees, which is a condition for a valid triangle.

##### Parameters:
- `double angleA`: The first angle of the triangle.
- `double angleB`: The second angle of the triangle.
- `double angleC`: The third angle of the triangle.

##### Returns:
- `boolean`: `true` if the angles form a valid triangle, `false` otherwise.

#### `private static boolean isRightAngleTriangle(double angleA, double angleB, double angleC)`

This function checks if any of the three angles is exactly 90 degrees.

##### Parameters:
- `double angleA`: The first angle of the triangle.
- `double angleB`: The second angle of the triangle.
- `double angleC`: The third angle of the triangle.

##### Returns:
- `boolean`: `true` if the triangle is a right-angle triangle, `false` otherwise.

#### `private static boolean isObtuseTriangle(double angleA, double angleB, double angleC)`

This function checks if any of the three angles is greater than 90 degrees.

##### Parameters:
- `double angleA`: The first angle of the triangle.
- `double angleB`: The second angle of the triangle.
- `double angleC`: The third angle of the triangle.

##### Returns:
- `boolean`: `true` if the triangle is an obtuse triangle, `false` otherwise.

### Example Usage

```java
import java.util.Scanner;

public class TriangleAnalyzer {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the first angle of the triangle: ");
        double angleA = inputScanner.nextDouble();

        System.out.print("Enter the second angle of the triangle: ");
        double angleB = inputScanner.nextDouble();

        System.out.print("Enter the third angle of the triangle: ");
        double angleC = inputScanner.nextDouble();

        if (isValidTriangle(angleA, angleB, angleC)) {
            if (isRightAngleTriangle(angleA, angleB, angleC)) {
                System.out.println("The triangle is a right-angle triangle.");
            } else if (isObtuseTriangle(angleA, angleB, angleC)) {
                System.out.println("The triangle is an obtuse triangle.");
            } else {
                System.out.println("The triangle is an acute triangle.");
            }
        } else {
            System.out.println("Invalid input. The angles do not form a valid triangle.");
        }

        inputScanner.close();
    }

    private static boolean isValidTriangle(double angleA, double angleB, double angleC) {
        return angleA + angleB + angleC == 180;
    }

    private static boolean isRightAngleTriangle(double angleA, double angleB, double angleC) {
        return angleA == 90 || angleB == 90 || angleC == 90;
    }

    private static boolean isObtuseTriangle(double angleA, double angleB, double angleC) {
        return angleA > 90 || angleB > 90 || angleC > 90;
    }
}
```

## Compilation and Execution

To compile and run the program, use the following commands:

```sh
javac TriangleAnalyzer.java
java TriangleAnalyzer
```

## Acknowledgments

- The program uses the `Scanner` class to handle user input.
- The methods `isValidTriangle`, `isRightAngleTriangle`, and `isObtuseTriangle` are used to determine the properties of the triangle based on its angles.