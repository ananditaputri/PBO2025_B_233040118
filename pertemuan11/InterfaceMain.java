package pertemuan10;

//Kelas utama untuk menguji KartuElektronik
public class InterfaceMain {
 public static void main(String[] args) {
     // Membuat objek kartu dengan kode bank "IF111" dan pin "123"
     KartuElektronik kartu = new KartuElektronik("IF111", "123");

     // Mencetak hasil otentikasi dengan PIN "123"
     System.out.println("Otentikasi: " + kartu.otentikasi("123"));
 }
}
