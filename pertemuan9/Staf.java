package pertemuan9;

public class Staf extends Karyawan {
    private String shift;

    public Staf(String nama, String alamat, String shift) {
        setNama(nama);
        setAlamat(alamat);
        this.shift = shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }
}
