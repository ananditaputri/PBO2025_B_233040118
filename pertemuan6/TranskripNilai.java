package pertemuan6;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pertemuan5.Matakuliah;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date();
    }
    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
        hitungIPK();
    }
    public void hitungIPK() {
        double totalNilaiXSks = 0;
        int totalSks = 0;

        for (KartuHasilStudi khs : kartuHasilStudi) {
            for (Matakuliah mk : khs.getDaftarMatakuliah()) {
                totalNilaiXSks += mk.getIndexNilai() * mk.getSks();
                totalSks += mk.getSks();
            }
        }
        ipk = (totalSks > 0) ? totalNilaiXSks / totalSks : 0.0;
    }
    public void display() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        System.out.println("NRP: " + mahasiswa.getNRP() + ", Nama: " + mahasiswa.getNama());
        System.out.println("Tanggal Cetak: " + sdf.format(tglCetak));
        System.out.printf("IPK: %.2f\n", ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }
}
