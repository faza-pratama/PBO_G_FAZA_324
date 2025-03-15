// Definisi kelas 'hewan'
public class hewan {
    // Deklarasi atribut kelas (atau variabel instance)
    // 'nama' untuk menyimpan nama hewan
    String nama;
    // 'jenis' untuk menyimpan jenis hewan
    String jenis;
    // 'suara' untuk menyimpan suara yang dibuat oleh hewan
    String suara;

    // Metode untuk menampilkan informasi hewan
    void tampilkanInfo() {
        // Menampilkan nilai atribut 'nama'
        System.out.format("nama: %s\n", nama);
        // Menampilkan nilai atribut 'jenis'
        System.out.format("jenis: %s\n", jenis);
        // Menampilkan nilai atribut 'suara'
        System.out.format("suara: %s\n\n", suara);
    }
}
