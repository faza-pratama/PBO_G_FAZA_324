package app;

import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;
import perpustakaan.Anggota;

public class Main {
    public static void main(String[] args){
        Fiksi fiksi = new Fiksi("", "", "");
        NonFiksi nonFiksi = new NonFiksi("", "", "");
        Anggota anggota = new Anggota("", "", 0);

        fiksi.setJudul("one piece");
        fiksi.setPenulis("masashi kisimoto");
        fiksi.setGenre("action");
        fiksi.DisplayInfo();

        nonFiksi.setJudul("madilog");
        nonFiksi.setPenulis("tan malaka");
        nonFiksi.setBidang("sejarah");
        nonFiksi.DisplayInfo();

        System.out.println();

        anggota.setNama("faza");
        anggota.setIdAanggota("324");
        anggota.infoAnggota();
        anggota.setNama("ardhi");
        anggota.setIdAanggota("290");
        anggota.infoAnggota();

        System.out.println();

        anggota.setNama("faza");
        anggota.setIdAanggota("324");
        anggota.peminjaman(fiksi.getJudul());
        
        anggota.setDurasiPeminjaman(10);
        anggota.setNama("ardhi");
        anggota.setIdAanggota("290");
        anggota.peminjaman(nonFiksi.getJudul(), anggota.getDurasiPeminjaman());

        System.out.println();

        anggota.setNama("faza");
        anggota.pengembalian(fiksi.getJudul());
        anggota.setNama("ardhi");
        anggota.pengembalian(nonFiksi.getJudul());
    }
}
