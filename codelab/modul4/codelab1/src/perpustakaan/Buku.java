package perpustakaan;

public abstract class Buku {
    private String Judul;
    private String Penulis;

    public Buku(String Judul, String Penulis){
        this.Judul = Judul;
        this.Penulis = Penulis;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getJudul() {
        return Judul;
    }

    public void setPenulis(String penulis) {
        Penulis = penulis;
    }

    public String getPenulis() {
        return Penulis;
    }

    public abstract void DisplayInfo();
    }