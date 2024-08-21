public class Escseq {
    public static void main(String[] args) {
        // Loop to print multiples of 7
        for (int i = 1; i <= 5; i++) {
            int multiple = i * 7;
            // Print the number followed by either a tab or a new line
            if (i % 2 == 0) {
                System.out.println("\t" + multiple);
            } else {
                System.out.println(multiple);
            }
        }
    }
}

