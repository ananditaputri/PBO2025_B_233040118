package Pertemuan14;

public class Mahasiswa {
 // Variabel final untuk NIM yang tidak bisa diubah setelah diinisialisasi
 private final String nim;
 private String nama;
 
 // Variabel static untuk menghitung total mahasiswa
 private static int totalMahasiswa = 0;
 
 // Konstanta static final untuk maksimum SKS
 public static final int MAX_SKS = 24;

 public Mahasiswa(String nim, String nama) {
     this.nim = nim;
     this.nama = nama;
     totalMahasiswa++; // Menambah counter setiap objek dibuat
 }

 public void displayInfo() {
     System.out.println("NIM: " + nim);
     System.out.println("Nama: " + nama);
     System.out.println("Maksimum SKS: " + MAX_SKS);
 }

 // Method static untuk mendapatkan total mahasiswa
 public static int getTotalMahasiswa() {
     return totalMahasiswa;
 }
}

