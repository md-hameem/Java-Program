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