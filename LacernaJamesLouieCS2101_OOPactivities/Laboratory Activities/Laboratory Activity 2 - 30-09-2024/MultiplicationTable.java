import java.util.Scanner;

public class MultiplicationTable {

    public static void printMultiplicationTable(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();

        printMultiplicationTable(size);

        scanner.close();
    }
}
