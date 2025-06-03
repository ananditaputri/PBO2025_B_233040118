package Pertemuan14;

public class TestMahasiswa {
 public static void main(String[] args) {
     // Membuat beberapa objek Mahasiswa
     Mahasiswa mhs1 = new Mahasiswa("12345", "Budi Santoso");
     Mahasiswa mhs2 = new Mahasiswa("12346", "Ani Wijaya");
     Mahasiswa mhs3 = new Mahasiswa("12347", "Citra Dewi");

     // Menampilkan info masing-masing mahasiswa
     System.out.println("Informasi Mahasiswa 1:");
     mhs1.displayInfo();
     
     System.out.println("\nInformasi Mahasiswa 2:");
     mhs2.displayInfo();
     
     System.out.println("\nInformasi Mahasiswa 3:");
     mhs3.displayInfo();

     // Menampilkan total mahasiswa
     System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
     System.out.println("Maksimum SKS untuk semua mahasiswa: " + Mahasiswa.MAX_SKS);
 }
}