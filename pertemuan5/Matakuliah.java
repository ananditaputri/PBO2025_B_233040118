package pertemuan5;

public class Matakuliah {
    private String kode;
    private String nama;
    private String nilaiHuruf;
    private int sks;

    public Matakuliah(String kode, String nama, String nilaiHuruf, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.nilaiHuruf = nilaiHuruf;
        this.sks = sks;
    }

    public double getIndexNilai() {
        switch (nilaiHuruf) {
            case "A": return 4.0;
            case "AB": return 3.5;
            case "B": return 3.0;
            case "BC": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            case "E": return 0.0;
            default: return 0.0;
        }
    }

    public String display() {
        return String.format("%s - %s - %s - %d", kode, nama, nilaiHuruf, sks);
    }

    /* Getter & Setter */
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String getNilaiHuruf() {
        return nilaiHuruf;
    }

    public int getSks() {
        return sks;
    }
}
