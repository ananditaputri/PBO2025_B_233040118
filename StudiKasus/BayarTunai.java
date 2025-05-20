package StudiKasus;

// Kelas BayarTunai mengimplementasikan interface Pembayaran
public class BayarTunai implements Pembayaran {
    
    // Implementasi method prosesBayar dari interface
    @Override
    public void prosesBayar(int jumlah) {
        // Menampilkan pesan pembayaran berhasil
        System.out.println("Pembayaran sebesar Rp" + jumlah + " berhasil secara tunai.");
    }
}
