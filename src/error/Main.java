package error;

public class Main {
    public static void main(String[] args) {
        try {
            long[] data = new long[Integer.MAX_VALUE]; // mencoba mengalokasikan array besar
        } catch (OutOfMemoryError e) {
            System.out.println("Memori tidak cukup: " + e.getMessage());
        }
    }
}
