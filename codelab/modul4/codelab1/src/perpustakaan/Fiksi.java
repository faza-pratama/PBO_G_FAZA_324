package perpustakaan;

public class Fiksi extends Buku {
    private String genre;
    public Fiksi(String Judul, String Penulis, String genre){
        super(Judul, Penulis);
        this.genre = genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Buku fiksi: " + getJudul() + " ditulis oleh " + getPenulis() + "(genre:" +getGenre()+ ")");
    }
}
