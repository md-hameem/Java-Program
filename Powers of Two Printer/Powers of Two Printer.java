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