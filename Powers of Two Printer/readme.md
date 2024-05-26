# Powers of Two Printer

This project implements a Java program to print powers of two within a specified range. The program calculates and prints powers of two from \(2^2\) to \(2^{20}\).

## Files

- `PrintPowers.java`: Contains the implementation of the powers of two printer.

## Functionality

### Main Function

The `main` function initializes the starting and ending powers of two and then iterates through the range to calculate and print the powers of two using the `Math.pow` function.

### Example Usage

```java
public class PrintPowers {
    public static void main(String[] args) {
        int start = 2;
        int end = 20;

        System.out.println("Powers of 2 from 2^2 to 2^20:");

        for (int i = start; i <= end; i++) {
            long result = (long) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }
}
```

## Compilation and Execution

To compile and run the program, use the following commands:

```sh
javac PrintPowers.java
java PrintPowers
```

## Acknowledgments

- This program utilizes the `Math.pow` function to calculate powers of two.
- The program demonstrates basic Java programming concepts such as loops and type casting.