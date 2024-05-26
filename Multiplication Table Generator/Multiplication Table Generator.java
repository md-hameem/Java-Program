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