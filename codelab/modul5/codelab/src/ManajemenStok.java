import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ListIterator;

public class ManajemenStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();

        daftarBarang.add(new Barang("Buku", 20));
        daftarBarang.add(new Barang("Pulpen", 30));
        daftarBarang.add(new Barang("Penghapus", 15));

        Scanner scanner = new Scanner(System.in);

        int pilihan = -1;

        try {
            while (pilihan != 0) {
                System.out.println("\n===== Menu Manajemen Stok =====");
                System.out.println("1. Tambah Barang Baru");
                System.out.println("2. Tampilkan Semua Barang");
                System.out.println("3. Kurangi Stok Barang");
                System.out.println("0. Keluar");
                System.out.print("Pilih opsi: ");

                try {
                    pilihan = scanner.nextInt();
                    scanner.nextLine();

                    switch (pilihan) {
                        case 1:
                            System.out.print("Masukkan nama barang: ");
                            String nama = scanner.nextLine();

                            int stokAwal = 0;
                            boolean inputValid = false;

                            while (!inputValid) {
                                try {
                                    System.out.print("Masukkan stok awal: ");
                                    stokAwal = scanner.nextInt();
                                    scanner.nextLine();
                                    inputValid = true;
                                } catch (InputMismatchException e) {
                                    System.out.println("Error: Input stok harus berupa angka!");
                                    scanner.nextLine();
                                }
                            }

                            Barang barangBaru = new Barang(nama, stokAwal);
                            daftarBarang.add(barangBaru);
                            System.out.println("Barang '" + nama + "' berhasil ditambahkan.");
                            break;

                        case 2:
                            System.out.println("\n--- Daftar Barang ---");

                            if (daftarBarang.isEmpty()) {
                                System.out.println("Stok barang kosong.");
                            } else {
                                ListIterator <Barang> listIter = daftarBarang.listIterator();
                                int index = 0;
                                while (listIter.hasNext()) {
                                    Barang barang = listIter.next();
                                    System.out.println(index + ". Nama: " + barang.getNama() + ", Stok: " + barang.getStok());
                                    index++;
                                }
                                System.out.println("----------------------");
                            }
                            break;

                        case 3:
                            System.out.println("\n--- Daftar Barang (Pilih untuk Kurangi Stok) ---");
                            if (daftarBarang.isEmpty()) {
                                System.out.println("Stok barang kosong.");
                                break;
                            }

                            int index = 0;
                            for (Barang barang : daftarBarang) {
                                System.out.println(index + ". " + barang.getNama() + " (Stok: " + barang.getStok() + ")");
                                index++;
                            }

                            try {
                                System.out.print("Masukkan nomor indeks barang: ");
                                int indeksBarang = scanner.nextInt();
                                scanner.nextLine();

                                if (indeksBarang < 0 || indeksBarang >= daftarBarang.size()) {
                                    throw new IndexOutOfBoundsException();
                                }

                                Barang barang = daftarBarang.get(indeksBarang);

                                System.out.print("Masukkan jumlah stok yang akan diambil: ");
                                int jumlahDiambil = scanner.nextInt();
                                scanner.nextLine();

                                if (jumlahDiambil > barang.getStok()) {
                                    throw new StokTidakCukupException("Stok untuk " + barang.getNama() +
                                            " hanya tersisa " + barang.getStok());
                                }

                                barang.setStok(barang.getStok() - jumlahDiambil);
                                System.out.println("Stok barang '" + barang.getNama() + "' berhasil dikurangi. Sisa stok: " +
                                        barang.getStok());

                            } catch (InputMismatchException e) {
                                System.out.println("Error: Input harus berupa angka!");
                                scanner.nextLine();
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Error: Indeks tidak valid untuk daftarBarang!");
                            } catch (StokTidakCukupException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                            break;

                        case 0:
                            System.out.println("Terima kasih! Program berakhir.");
                            break;

                        default:
                            System.out.println("Error: Pilihan tidak valid!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Input harus berupa angka!");
                    scanner.nextLine();
                }
            }
        } finally {
            scanner.close();
        }
    }
}