package StudiKasus;

// TiketPesawat juga mewarisi dari kelas abstrak Tiket
public class TiketPesawat extends Tiket {
    private String maskapai; // Menyimpan nama maskapai penerbangan

    // Konstruktor untuk mengisi tujuan, harga, dan maskapai
    public TiketPesawat(String tujuan, int harga, String maskapai) {
        super(tujuan, harga); // Memanggil konstruktor kelas induk
        this.maskapai = maskapai;
    }

    // Implementasi method cetakTiket() untuk tiket pesawat
    @Override
    public void cetakTiket() {
        System.out.println("=== Tiket Pesawat ===");
        System.out.println("Tujuan  : " + tujuan);
        System.out.println("Maskapai: " + maskapai);
        System.out.println("Harga   : Rp" + harga);
    }
}
