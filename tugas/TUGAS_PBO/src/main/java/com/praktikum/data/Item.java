package main.java.com.praktikum.data;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private static final List<Item> itemList = new ArrayList<>();
    private String nama;
    private String lokasi;
    private String status;

    public static List<Item> getItemList() {
        return itemList;
    }

    public static void addItem(Item item) {
        itemList.add(item);
    }

    public static void updateItemStatus(Item item, String status) {
        item.setStatus(status);
    }

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