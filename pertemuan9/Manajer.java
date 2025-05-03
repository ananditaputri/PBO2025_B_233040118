package pertemuan9;

public class Manajer extends Karyawan {
    private String departemen;

    public Manajer(String nama, String alamat, String departemen) {
        setNama(nama);
        setAlamat(alamat);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }
}
