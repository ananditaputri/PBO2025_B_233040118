package pertemuan10;

//Kelas KartuElektronik mengimplementasikan interface Kartu
public class KartuElektronik implements Kartu {

 // Atribut kode bank dan PIN disimpan secara privat
 private String kodeBank;
 private String pin;

 // Konstruktor menerima kodeBank dan PIN saat pembuatan objek
 public KartuElektronik(String kodeBank, String pin) {
     super();
     this.kodeBank = kodeBank;
     this.pin = pin;
 }

 // Implementasi method otentikasi dari interface
 // Akan mengembalikan true jika input sama dengan pin tersimpan
 @Override
 public boolean otentikasi(String pinInput) {
     if (pin.equals(pinInput))
         return true;
     else
         return false;
 }

 // Implementasi method encode
 // Sementara hanya return null (sesuai modul), nanti bisa dikembangkan
 @Override
 public String encode(String pin) {
     // melakukan enkripsi inputan PIN (simulasi)
     return null;
 }
}
