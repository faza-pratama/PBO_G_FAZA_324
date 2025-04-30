package app;
import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;
import perpustakaan.Anggota;
public class Main {
    public static void main(String[] args){
        Fiksi fiksi = new Fiksi("one piece", "oda sensei", "anime");
        NonFiksi nonFiksi = new NonFiksi("", "", "");
        Anggota anggota1 = new Anggota("", "", 0);
        Anggota anggota2 = new Anggota("", "", 0);
        //set atribut judul penulis genre dan bidang
        fiksi.setJudul("One piece");
        fiksi.setPenulis("Oda Sensei");
        fiksi.setGenre("anime");
        nonFiksi.setJudul("Cosmos");
        nonFiksi.setPenulis("Carl Sagan");
        nonFiksi.setBidang("sains");
        //set nama idAnggota dan durasi
        anggota1.setNama("faza");
        anggota1.setIdAanggota("G324");
        anggota2.setNama("ardhi");
        anggota2.setIdAanggota("G290");
        anggota2.setDurasiPeminjaman(7);

        fiksi.DisplayInfo();
        nonFiksi.DisplayInfo();

        anggota1.infoAnggota();
        anggota2.infoAnggota();

        anggota1.peminjaman(fiksi.getJudul());
        anggota2.peminjaman(nonFiksi.getJudul(), anggota2.getDurasiPeminjaman());

        anggota1.pengembalian(fiksi.getJudul());
        anggota2.pengembalian(nonFiksi.getJudul());
    }
}
