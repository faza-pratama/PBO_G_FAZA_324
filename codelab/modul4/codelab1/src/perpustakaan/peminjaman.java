package perpustakaan;

public interface peminjaman {
    void peminjaman(String JudulBuku);
    void peminjaman(String JudulBuku, int durasiPeminjaman);
    void pengembalian(String JudulBuku);
}
