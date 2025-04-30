package perpustakaan;

public class NonFiksi extends Buku{
    private String bidang;

    public NonFiksi(String Judul, String Penulis, String bidang) {
        super(Judul, Penulis);
        this.bidang = bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Buku non fiksi: " + getJudul() + "ditulis oleh " + getPenulis() + "(bidang:" +getBidang()+ ")");
    }
}
