package pertemuan10;

// Kelas abstrak Bentuk
public abstract class Bentuk {
    // Konstanta PHI untuk perhitungan luas
    protected double PHI = 3.14;

    // Atribut jari-jari untuk bentuk
    protected int jari2;

    // Konstruktor
    public Bentuk(int jari2) {
        super();
        this.jari2 = jari2;
    }

    // ===============================
    // JAWABAN PERTANYAAN 1:
    // Method abstrak yang terdapat di kelas Bentuk adalah:
    // public abstract double luas();
    // Method ini tidak memiliki isi dan wajib diimplementasikan oleh semua subclass.
    // ===============================
    public abstract double luas();

    // Getter jari-jari
    public int getJari2() {
        return jari2;
    }

    // Setter jari-jari
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }

    // ===============================
    // JAWABAN PERTANYAAN 2:
    // - Di kelas Bentuk: method luas() hanya deklarasi (abstrak, tanpa isi).
    // - Di kelas Lingkaran & Tabung: method luas() diimplementasikan sesuai rumus masing-masing.
    //    - Lingkaran: PHI * jari2 * jari2
    //    - Tabung: 2 * PHI * jari2 * (jari2 + tinggi)
    // ===============================

    // ===============================
    // JAWABAN PERTANYAAN 3:
    // Jika method luas() tidak diimplementasikan di kelas Tabung,
    // maka akan terjadi error saat kompilasi.
    // Karena kelas Tabung adalah turunan dari kelas abstrak,
    // maka ia wajib mengimplementasikan semua method abstrak dari induknya.
    // ===============================
}
