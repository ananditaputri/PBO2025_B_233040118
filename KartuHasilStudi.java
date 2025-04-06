package pertemuan6;
import java.util.ArrayList;
import java.util.List;
import pertemuan5.Matakuliah;
public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }
    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
        hitungIPS();
    }
    public void hitungIPS() {
        double totalNilaiXSks = 0;
        int totalSks = 0;
        for (Matakuliah mk : daftarMatakuliah) {
            totalNilaiXSks += mk.getIndexNilai() * mk.getSks();
            totalSks += mk.getSks();
        }
        ips = (totalSks > 0) ? totalNilaiXSks / totalSks : 0.0;
    }
    public String display() {
        StringBuilder sb = new StringBuilder();
        for (Matakuliah mk : daftarMatakuliah) {
            sb.append(mk.display()).append("\n");
        }
        return sb.toString();
    }
    /* Getter & Setter */
    public double getIps() {
        return ips;
    }
    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }
}
