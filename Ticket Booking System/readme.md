# Ticket Booking System

This Java program simulates a ticket booking system for a theater seating arrangement. The theater seating arrangement is represented as a two-dimensional array of fares, where each fare corresponds to a seat. Users can select either a seat number or a ticket price, and the program marks the selected seat as reserved by changing the fare to 0.

## Files

- `TicketBooking.java`: Contains the implementation of the ticket booking system.

## Functionality

### Main Function

The `main` function displays the current seating arrangement, prompts the user to enter a fare or seat number, and marks the selected seat as reserved if it is available.

### `markBits` Function

This function marks the selected seat as reserved by changing the fare to 0 in the seating arrangement array. It also prints a confirmation message with the seat number and fare.

### `displaySeatingArrangement` Function

This function displays the current seating arrangement, showing the fares for each seat in the theater.

## Example Usage

```java
public class TicketBooking {
    public static void main(String[] args) {
        displaySeatingArrangement();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fare or seat number (1 to 90): ");
        int input = scanner.nextInt();
        scanner.close();

        // Implementation of seat booking is similar to the one described in the Functionality section
    }

    // Other functions are similar to those described in the Functionality section
}
```

## Compilation and Execution

To compile and run the program, use the following commands:

```sh
javac TicketBooking.java
java TicketBooking
```

## Acknowledgments

- This program demonstrates basic Java programming concepts such as arrays, loops, and conditional statements.
- It simulates a simple ticket booking system for a theater seating arrangement.