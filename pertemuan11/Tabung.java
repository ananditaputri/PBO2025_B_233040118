package pertemuan10;

//Kelas Tabung mewarisi dari Bentuk
public class Tabung extends Bentuk {
 private int tinggi;

 // Konstruktor default (tidak digunakan di soal)
 public Tabung() {
     super(0);
 }

 // Konstruktor dengan parameter jari-jari dan tinggi
 public Tabung(int jari2, int tinggi) {
     super(jari2);
     this.tinggi = tinggi;
 }

 /*
  * Rumus luas permukaan tabung: 2 * PHI * r * (r + t)
  */
 @Override
 
 //Di kelas Tabung, method luas() menghitung luas permukaan tabung dengan rumus
 public double luas() {
     return 2 * PHI * jari2 * (jari2 + tinggi);
 }

 // Getter tinggi
 public int getTinggi() {
     return tinggi;
 }

 // Setter tinggi
 public void setTinggi(int tinggi) {
     this.tinggi = tinggi;
 }
}

//Jika method luas() di kelas Tabung tidak diimplementasikan, 
//maka akan muncul error pada saat kompilasi.

//Karena luas() adalah method abstrak dari kelas Bentuk, 
//maka setiap kelas turunan non-abstrak seperti Tabung wajib mengimplementasikannya. 
//Jika tidak, maka Tabung juga harus dibuat menjadi kelas abstrak.
