package main.java.com.praktikum.users;

public class Mahasiswa extends User {
    private String nim;
    public Mahasiswa(String name, String nim) {
        super(name);
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }
}