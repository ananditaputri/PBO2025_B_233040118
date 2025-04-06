package Pertemuan3;

public class Mahasiswa {
	String nim;
	Double ipk;
	boolean statusPerwalian;
	
// Simbol OR (|) simbol AND (&) simbol XOR (^) Simbol NOT (~)\
	public void perwalian() {
		statusPerwalian = true;
	}
	
	public Mahasiswa(String nim, Double ipk, boolean statusPerwalian) {
		this.nim = nim;
		this.ipk = ipk;
		this.statusPerwalian = false;
	}
	
	
}
