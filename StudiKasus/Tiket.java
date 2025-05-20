package StudiKasus;

// Kelas abstrak Tiket yang menjadi induk dari TiketKereta dan TiketPesawat
public abstract class Tiket {
    protected String tujuan; // Menyimpan tujuan tiket
    protected int harga;     // Menyimpan harga tiket

    // Konstruktor untuk mengisi nilai tujuan dan harga
    public Tiket(String tujuan, int harga) {
        this.tujuan = tujuan;
        this.harga = harga;
    }

    // Method abstrak yang wajib diimplementasikan oleh subclass
    public abstract void cetakTiket();

    // Getter untuk mengambil nilai harga
    public int getHarga() {
        return harga;
    }
}
