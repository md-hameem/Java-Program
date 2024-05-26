# Calendar Printing Program

This Java program prints a calendar for a specified month and year. It displays the days of the month in a format similar to a typical calendar, with the days of the week labeled from Sunday to Saturday.

## Files

- `CalendarPrint.java`: Contains the implementation of the calendar printing program.

## Functionality

### Main Function

The `main` function initializes the target month and year and calls the `printCalendar` function to print the calendar for the specified month and year.

### `printCalendar` Function

This function prints the calendar for the specified month and year. It calculates the number of days in the month and the day of the week for the first day of the month using helper functions (`getNumberOfDaysInMonth` and `getFirstDayOfWeek`). It then prints the days of the month in a grid format, starting from the appropriate day of the week.

### Helper Functions

- `getNumberOfDaysInMonth`: Returns the number of days in the specified month and year.
- `getFirstDayOfWeek`: Returns the day of the week for the first day of the specified month and year.

## Example Usage

```java
public class CalendarPrint {
    public static void main(String[] args) {
        int targetMonth = Calendar.DECEMBER;
        int targetYear = 2023;
        printCalendar(targetMonth, targetYear);
    }

    // Other functions are similar to those described in the Functionality section
}
```

## Compilation and Execution

To compile and run the program, use the following commands:

```sh
javac CalendarPrint.java
java CalendarPrint
```

## Acknowledgments

- This program utilizes Java's `Calendar` class to handle date and time operations.
- The program demonstrates basic Java programming concepts such as loops and functions.