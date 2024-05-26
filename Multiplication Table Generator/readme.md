# Multiplication Table Generator

This project implements a Java program to generate a multiplication table of a given size. The program prints a table header with numbers from 1 to the table size and then generates the multiplication table.

## Files

- `MultiplicationTable.java`: Contains the implementation of the multiplication table generator.

## Functionality

### Main Function

The `main` function initializes the table size and calls two helper functions to print the table header and generate the multiplication table.

### Helper Functions

#### `private static void printTableHeader(int size)`

This function prints the header of the multiplication table, displaying numbers from 1 to the specified table size.

#### `private static void printMultiplicationTable(int size)`

This function generates the multiplication table up to the specified size and prints it row by row.

### Example Usage

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 10;

        printTableHeader(tableSize);
        printMultiplicationTable(tableSize);
    }

    private static void printTableHeader(int size) {
        System.out.print("\t"); 

        for (int multiplier = 1; multiplier <= size; multiplier++) {
            System.out.print(multiplier + "\t");
        }

        System.out.println(); 
    }

    private static void printMultiplicationTable(int size) {
        for (int row = 1; row <= size; row++) {
            System.out.print(row + "\t"); 

            for (int col = 1; col <= size; col++) {
                System.out.print((row * col) + "\t");
            }
            System.out.println(); 
        }
    }
}
```

## Compilation and Execution

To compile and run the program, use the following commands:

```sh
javac MultiplicationTable.java
java MultiplicationTable
```

## Acknowledgments

- This program demonstrates basic Java programming concepts such as loops and nested loops.
- The generated multiplication table provides a visual representation of the multiplication operation up to the specified size.