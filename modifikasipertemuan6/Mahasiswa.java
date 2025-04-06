package modifikasipertemuan6;

public class Mahasiswa {

    private String NRP;
    private String nama;

    public Mahasiswa() {
        // TODO Auto-generated constructor stub
    }
    public Mahasiswa(String NRP, String nama) {
        super();
        this.NRP = NRP;
        this.nama = nama;
    }
    public String display() {
        return "NRP: "+ NRP + ", Nama: "+ nama;
    }
    /* Setter & Getter */
    public String getNRP() {
        return NRP;
    }
    public void setNRP(String NRP) {
        this.NRP = NRP;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}
