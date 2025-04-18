package com.modul3.datauser;

public class Admin extends User {
    private String adminuser;
    private String password;

    public Admin (String nama, String nim, String adminuser, String password){
        super(nama, nim);
        this.adminuser = adminuser;
        this.password = password;
    }

    public String getAdminuser() {
        return adminuser;
    }

    public void setAdminuser(String adminuser) {
        this.adminuser = adminuser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override

    public void displayinfo(){
        System.out.println("Data admin:");
        System.out.println("username:" + getAdminuser());
        System.out.println("Nama:" + getNama());
        System.out.println("NIM:" + getNim());
    }

    public boolean login(String adminuser, String password){
        if(getAdminuser().equals(adminuser) && getPassword().equals(password)){
            System.out.println("login berhasil");
            displayinfo();
            return true;
        } else {
            System.out.println("login gagal, nama atau nim salah coba lagi");
            return false;
        }
    }
}
