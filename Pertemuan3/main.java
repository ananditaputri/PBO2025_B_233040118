package Pertemuan3;

public class main {
	public static void main(String[] args) {
	
		Mahasiswa m1 = new Mahasiswa("233040126", 4.0, true);
		Mahasiswa m11 = m1;
		Mahasiswa m2 = new Mahasiswa("233040127", 3.0, false);
		Mahasiswa m22 = m2;
		
		m2.nim="9000";
		m1.nim="9999";
		System.out.println(m22.nim);
		System.out.println(m11.nim);
	}
}
