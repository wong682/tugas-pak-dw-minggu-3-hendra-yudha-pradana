package masukan.nama.anda;

// 1. Import harus diletakkan di luar class (paling atas)
import java.util.Scanner;

public class MasukanNamaAnda {

    // 2. Fungsi utama (main method)
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari terminal
        Scanner scanner = new Scanner(System.in);

        // Meminta input angka pertama
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        // Meminta input angka kedua
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Melakukan operasi aritmatika
        double penjumlahan = angka1 + angka2;
        double pengurangan = angka1 - angka2;
        double perkalian   = angka1 * angka2;
        double pembagian   = angka1 / angka2;

        // Menampilkan hasil
        System.out.println("\n=== Hasil Operasi ===");
        System.out.println("Penjumlahan (" + angka1 + " + " + angka2 + ") = " + penjumlahan);
        System.out.println("Pengurangan (" + angka1 + " - " + angka2 + ") = " + pengurangan);
        System.out.println("Perkalian   (" + angka1 + " * " + angka2 + ") = " + perkalian);
        System.out.println("Pembagian   (" + angka1 + " / " + angka2 + ") = " + pembagian);

        // Menutup scanner
        scanner.close();
    }
}