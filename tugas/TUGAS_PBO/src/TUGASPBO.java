import java.util.Scanner;

public class TUGASPBO {
    public static void main (String[] args){
        int login;
        Scanner objInput = new Scanner(System.in);

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukan pilihan :");
        login = objInput.nextInt();
        objInput.nextLine();

        if (login == 1) {
            String userAdmin = "Admin324";
            String passAdmin = "password324";

            String usernameInput;
            System.out.print("Masukan username:");
            usernameInput = objInput.nextLine();

            String passwordInput;
            System.out.print("Masukan password:");
            passwordInput = objInput.nextLine();

            if (usernameInput.equals(userAdmin) && passwordInput.equals(passAdmin)) {
                System.out.println("login admin berhasil");
            } else {
                System.out.println("login gagal!! username atau password salah");
            }

        } else if (login == 2) {
                String userMahasiswa = "alinno faza pratama";
                String passMahasiswa = "202410370110324";

                String userMahasiswaInput;
                System.out.print("Masukan nama:");
                userMahasiswaInput = objInput.nextLine();

                String passMahasiswaInput;
                System.out.print("Masukan password:");
                passMahasiswaInput = objInput.nextLine();

                if (userMahasiswaInput.equals(userMahasiswa) && passMahasiswaInput.equals(passMahasiswa)) {
                    System.out.println("login mahasiswa berhasil");
                } else {
                    System.out.println("login gagal!! nama atau password salah");
                }

        } else {
                System.out.println("pilihan tidak valid");
        }
        objInput.close();
    }
}