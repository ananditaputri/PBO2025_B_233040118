package pertemuan10;

//Kelas Lingkaran mewarisi dari Bentuk
public class Lingkaran extends Bentuk {

 // Konstruktor memanggil konstruktor Bentuk
 public Lingkaran(int jari2) {
     super(jari2);
 }

 /*
  * Rumus luas lingkaran: PHI * r * r
  */
 @Override
 
 //Di kelas Lingkaran, method luas() menghitung luas lingkaran menggunakan rumus:
 public double luas() {
     return PHI * jari2 * jari2;
 }
}
