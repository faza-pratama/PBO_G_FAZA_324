import java.time.LocalDateTime; // Mengimpor kelas LocalDateTime untuk mendapatkan tanggal dan waktu saat ini
import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class modul1 {
    public static void main (String[] args){
        String nama; // Deklarasi variabel nama untuk menyimpan nama pengguna
        String jenisKelamin; // Deklarasi variabel jenisKelamin untuk menyimpan jenis kelamin pengguna
        int tahunLahir; // Deklarasi variabel tahunLahir untuk menyimpan tahun lahir pengguna

        LocalDateTime time = LocalDateTime.now(); // Mendapatkan tanggal dan waktu saat ini
        Scanner objInput = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

        System.out.print("Masukan nama: "); // Menampilkan pesan untuk meminta input nama
        nama = objInput.nextLine(); // Membaca input nama dari pengguna
        System.out.print("Masukan jenis kelamin P/L: "); // Menampilkan pesan untuk meminta input jenis kelamin
        jenisKelamin = objInput.nextLine(); // Membaca input jenis kelamin dari pengguna
        System.out.print("Masukan tahun lahir: "); // Menampilkan pesan untuk meminta input tahun lahir
        tahunLahir = objInput.nextInt(); // Membaca input tahun lahir dari pengguna

        System.out.println("Data diri:"); // Menampilkan judul "Data diri:"
        System.out.format("Nama          : %s\n", nama); // Menampilkan nama pengguna

        // Blok kondisional untuk menentukan jenis kelamin berdasarkan input
        if (jenisKelamin.equals("l")|| jenisKelamin.equals("L")) {
            jenisKelamin = "Laki Laki";
            System.out.format("Jenis Kelamin : %s\n", jenisKelamin); // Menampilkan "Laki Laki" jika input adalah 'l' atau 'L'
        } else if (jenisKelamin.equals("p")|| jenisKelamin.equals("P")) {
            jenisKelamin = "Perempuan";
            System.out.format("Jenis Kelamin : %s\n", jenisKelamin); // Menampilkan "Perempuan" jika input adalah 'p' atau 'P'
        } else {
            System.out.println("input tidak valid"); // Menampilkan pesan kesalahan jika input tidak valid
        }

        int umur = time.getYear() - tahunLahir; // Menghitung umur pengguna
        System.out.format("Umur          : %d", umur); // Menampilkan umur pengguna
    }
}