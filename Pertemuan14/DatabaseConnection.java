package Pertemuan14;


public class DatabaseConnection {
 public static String connectionString; // Variabel static untuk menyimpan URL koneksi

 // Static block untuk inisialisasi
 static {
     connectionString = "jdbc:mysql://localhost:3306/mydatabase";
     System.out.println("Static block executed: Database connection initialized");
 }
}
