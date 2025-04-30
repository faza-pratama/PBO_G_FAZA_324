package perpustakaan;

public class Anggota implements peminjaman{
    private String nama;
    private String idAanggota;
    private int durasiPeminjaman;

    public Anggota(String nama, String idAanggota, int durasiPeminjaman){
        this.nama = nama;
        this.idAanggota = idAanggota;
        this.durasiPeminjaman = durasiPeminjaman;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setIdAanggota(String idAanggota) {
        this.idAanggota = idAanggota;
    }
    public String getIdAanggota() {
        return idAanggota;
    }
    public void infoAnggota(){
        System.out.println("Anggota: " + getNama() + "(ID:" + getIdAanggota() + ")");
    }
    public void setDurasiPeminjaman(int durasiPeminjaman) {
        this.durasiPeminjaman = durasiPeminjaman;
    }
    public int getDurasiPeminjaman() {
        return durasiPeminjaman;
    }

    @Override
    public void peminjaman(String JudulBuku){
        System.out.println(getNama() + " meminjam buku: " + JudulBuku);
    }

    @Override
    public void peminjaman(String JudulBuku, int durasiPeminjaman){
        System.out.println(getNama() + " meminjam buku: " + JudulBuku + "dalam durasi " + durasiPeminjaman + " hari");
    }

    public void pengembalian(String JudulBuku) {
        System.out.println(getNama() + " mengembalikan buku berjudul: " + JudulBuku);
    }
}
