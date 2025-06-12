import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = null;
        String[] AvailIDBuku = {"B001", "B002", "B003"};

        try {
            input = new Scanner(System.in);

            System.out.print("Masukkan Nama Anda: ");
            String namaPengguna = input.nextLine();

            System.out.print("Masukkan ID Buku: ");
            String idBuku = input.nextLine();

            boolean idValid = false;
            for (String id : AvailIDBuku) {
                if (id.equalsIgnoreCase(idBuku)) {
                    idValid = true;
                    break;
                }
            }

            if (!idValid) {
                throw new Exception("ID Buku tidak valid. Hanya boleh: B001, B002, B003.");
            }

            System.out.print("Masukkan Lama Peminjaman (dalam hari): ");
            int lamaPeminjaman = input.nextInt();

            if (lamaPeminjaman < 1 || lamaPeminjaman > 14) {
                throw new Exception("Lama peminjaman harus antara 1 - 14 hari.");
            }

            // Tulis ke file
            try (FileWriter writer = new FileWriter("peminjaman.txt", true);
                 BufferedWriter bufferedWriter = new BufferedWriter(writer);
                 PrintWriter printWriter = new PrintWriter(bufferedWriter)) {

                printWriter.println("Nama Pengguna: " + namaPengguna);
                printWriter.println("ID Buku: " + idBuku);
                printWriter.println("Lama Peminjaman: " + lamaPeminjaman + " hari");
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
            System.out.println("Program selesai.");
        }
    }
}
