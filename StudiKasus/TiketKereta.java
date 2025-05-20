package StudiKasus;

// TiketKereta mewarisi kelas abstrak Tiket
public class TiketKereta extends Tiket {
    private String kelas; // Menyimpan kelas kereta (misal: ekonomi)

    // Konstruktor untuk mengisi tujuan, harga, dan kelas kereta
    public TiketKereta(String tujuan, int harga, String kelas) {
        super(tujuan, harga); // Memanggil konstruktor kelas induk
        this.kelas = kelas;
    }

    // Implementasi method abstrak cetakTiket()
    @Override
    public void cetakTiket() {
        System.out.println("=== Tiket Kereta ===");
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Kelas : " + kelas);
        System.out.println("Harga : Rp" + harga);
    }
}
