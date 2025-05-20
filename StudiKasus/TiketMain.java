package StudiKasus;

// Kelas utama untuk menjalankan program
public class TiketMain {
    public static void main(String[] args) {
        // Membuat objek TiketKereta dengan tujuan Bandung, harga 75.000, kelas Ekonomi
        Tiket kereta = new TiketKereta("Bandung", 75000, "Ekonomi");

        // Membuat objek TiketPesawat dengan tujuan Bali, harga 450.000, maskapai Garuda
        Tiket pesawat = new TiketPesawat("Bali", 450000, "Garuda");

        // Membuat objek pembayaran tunai
        Pembayaran bayar = new BayarTunai();

        // Menampilkan data dan pembayaran tiket kereta
        kereta.cetakTiket();
        bayar.prosesBayar(kereta.getHarga());

        System.out.println(); // Baris kosong untuk pemisah output

        // Menampilkan data dan pembayaran tiket pesawat
        pesawat.cetakTiket();
        bayar.prosesBayar(pesawat.getHarga());
    }
}
