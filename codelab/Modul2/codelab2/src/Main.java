import java.util.Scanner;

// Definisi kelas utama (main class)
public class Main {
    // Metode utama sebagai titik awal eksekusi program
    public static void main (String[] args) {
        // Membuat objek rekening1 dari kelas 'rekeningBank'
        rekeningBank rekening1 = new rekeningBank();
        // Membuat objek rekening2 dari kelas 'rekeningBank'
        rekeningBank rekening2 = new rekeningBank();
        Scanner objInput = new Scanner(System.in);

        // Mengisi atribut 'rekening1' dengan nilai awal
        rekening1.nomorRekening = "202410370110324"; // Nomor rekening untuk rekening1
        rekening1.namaPemilik = "Faza"; // Nama pemilik rekening1
        rekening1.saldo = 200000; // Saldo awal rekening1

        // Mengisi atribut 'rekening2' dengan nilai awal
        rekening2.nomorRekening = "202410370110290"; // Nomor rekening untuk rekening2
        rekening2.namaPemilik = "Ardhi"; // Nama pemilik rekening2
        rekening2.saldo = 1000000; // Saldo awal rekening2

        // Memanggil metode tampilkanInfo untuk menampilkan informasi rekening1
        rekening1.tampilkanInfo();
        // Memanggil metode tampilkanInfo untuk menampilkan informasi rekening2
        rekening2.tampilkanInfo();

        // Setoran uang ke rekening1 dan rekening2
        System.out.print("masukan jumlah setor: Rp.");//minta user untuk memasukan jumlah setor
        double setor1 = objInput.nextDouble(); // Jumlah uang yang akan disetor ke rekening1
        rekening1.setorUang(setor1); // Memanggil metode setorUang untuk rekening1
        System.out.print("masukan jumlah setor: Rp.");//minta user untuk memasukan jumlah setor
        double setor2 = objInput.nextDouble(); // Jumlah uang yang akan disetor ke rekening2
        rekening2.setorUang(setor2); // Memanggil metode setorUang untuk rekening2

        // Penarikan uang dari rekening1 dan rekening2
        System.out.print("masukan jumlah tarik: Rp."); //minta user untuk memasukan jumlah tarik
        double tarik1 = objInput.nextDouble(); // Jumlah uang yang akan ditarik dari rekening1
        rekening1.tarikUang(tarik1); // Memanggil metode tarikUang untuk rekening1

        System.out.print("masukan jumlah tarik: Rp."); //minta user untuk memasukan jumlah tarik
        double tarik2 = objInput.nextDouble(); // Jumlah uang yang akan ditarik dari rekening2
        rekening2.tarikUang(tarik2); // Memanggil metode tarikUang untuk rekening2

        // Menampilkan kembali informasi rekening1 setelah transaksi
        rekening1.tampilkanInfo();
        // Menampilkan kembali informasi rekening2 setelah transaksi
        rekening2.tampilkanInfo();
    }
}
