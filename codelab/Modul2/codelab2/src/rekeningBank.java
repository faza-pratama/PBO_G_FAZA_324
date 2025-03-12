// Definisi kelas 'rekeningBank'
public class rekeningBank {
    // Atribut kelas untuk menyimpan data rekening bank
    String nomorRekening; // Menyimpan nomor rekening
    String namaPemilik; // Menyimpan nama pemilik rekening
    double saldo; // Menyimpan saldo dalam rekening

    // Metode untuk menampilkan informasi rekening
    void tampilkanInfo() {
        // Menampilkan nomor rekening
        System.out.println("Nomor rekening: " + nomorRekening);
        // Menampilkan nama pemilik rekening
        System.out.println("Nama pemilik: " + namaPemilik);
        // Menampilkan saldo rekening
        System.out.println("Saldo: Rp." + saldo + "\n");
    }

    // Metode untuk menyetor uang ke rekening
    void setorUang(double jumlah) {
        // Menambahkan jumlah uang yang disetor ke saldo
        saldo += jumlah;
        // Menampilkan informasi setelah setoran
        System.out.println(namaPemilik + " menyetor Rp." + jumlah + " saldo saat ini: Rp." + saldo + "\n");
    }

    // Metode untuk menarik uang dari rekening
    void tarikUang(double jumlah) {
        // Memeriksa apakah jumlah yang ditarik valid (tidak melebihi saldo dan lebih dari nol)
        if ((jumlah <= saldo) && (jumlah > 0)) {
            // Mengurangi saldo dengan jumlah yang ditarik
            saldo -= jumlah;
            // Menampilkan informasi setelah penarikan
            System.out.println(namaPemilik + " menarik Rp." + jumlah + " saldo saat ini: Rp." + saldo + "\n");
        } else {
            // Menampilkan pesan kesalahan jika saldo tidak mencukupi atau jumlah tidak valid
            System.out.println(namaPemilik + " menarik Rp." + jumlah + " (gagal saldo tidak mencukupi)" + " saldo saat ini: Rp." + saldo + "\n");
        }
    }
}
