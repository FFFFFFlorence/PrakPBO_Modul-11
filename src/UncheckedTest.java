public class UncheckedTest {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3};

        try {
            System.out.println(angka[5]); // indeks diluar array
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } 

        try {
            int hasil = 10 / 0; // pembagian dengan nol
            System.out.println("hasil: " + hasil);
        } catch (NullPointerException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
