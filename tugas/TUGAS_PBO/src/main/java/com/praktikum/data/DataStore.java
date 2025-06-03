package main.java.com.praktikum.data;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    private static final List<Item> itemList = new ArrayList<>();
    private static final List<Mahasiswa> mahasiswaList = new ArrayList<>();

    public static List<Item> getItemList() {
        return itemList;
    }

    public static void addItem(Item item) {
        itemList.add(item);
    }

    public static void updateItemStatus(Item item, String status) {
        item.setStatus(status);
    }

    public static List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }

    public static void addMahasiswa(Mahasiswa mhs) {
        mahasiswaList.add(mhs);
    }

    public static void removeMahasiswa(Mahasiswa mhs) {
        mahasiswaList.remove(mhs);
    }

    public static class Mahasiswa {
        private String nama;
        private String nim;

        public Mahasiswa(String nama, String nim) {
            this.nama = nama;
            this.nim = nim;
        }

        public String getNama() { return nama; }
        public String getNim() { return nim; }
    }

    public static class Item {
        private String nama;
        private String lokasi;
        private String status;

        public Item(String nama, String lokasi, String status) {
            this.nama = nama;
            this.lokasi = lokasi;
            this.status = status;
        }

        public String getNama() { return nama; }
        public String getLokasi() { return lokasi; }
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
    }
}