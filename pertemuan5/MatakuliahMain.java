package pertemuan5;

public class MatakuliahMain {
    public static void main(String[] args) {
        // Membuat objek matakuliah
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        // Tampilkan daftar matakuliah
        System.out.println("--- DAFTAR MATAKULIAH ---");
        System.out.println(mk1.display() + " | SKS: " + mk1.getSks() + " | Bobot: " + mk1.nilaiIndex());
        System.out.println(mk2.display() + " | SKS: " + mk2.getSks() + " | Bobot: " + mk2.nilaiIndex());
        System.out.println(mk3.display() + " | SKS: " + mk3.getSks() + " | Bobot: " + mk3.nilaiIndex());

        // Hitung total nilai dan total SKS
        double totalNilai = (mk1.nilaiIndex() * mk1.getSks()) +
                            (mk2.nilaiIndex() * mk2.getSks()) +
                            (mk3.nilaiIndex() * mk3.getSks());
        int totalSks = mk1.getSks() + mk2.getSks() + mk3.getSks();

        // Hitung IPK
        double ipk = totalNilai / totalSks;

        // Tampilkan hasil IPK
        System.out.println("\n--- HASIL PERHITUNGAN IPK ---");
        System.out.println("Total SKS: " + totalSks);
        System.out.println("IPK: " + String.format("%.2f", ipk));
    }
}
