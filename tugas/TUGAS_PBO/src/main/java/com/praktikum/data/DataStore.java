package main.java.com.praktikum.data;

import java.util.ArrayList;
import java.util.List;
import main.java.com.praktikum.users.Mahasiswa;

public class DataStore {
    private static final List<Mahasiswa> mahasiswaList = new ArrayList<>();

    public static List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }

    public static void addMahasiswa(Mahasiswa mhs) {
        mahasiswaList.add(mhs);
    }

    public static void removeMahasiswa(Mahasiswa mhs) {
        mahasiswaList.remove(mhs);
    }


}