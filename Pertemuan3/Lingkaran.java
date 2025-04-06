package Pertemuan3;

public class Lingkaran {
	public double jari;
	public final static double PHI = 3.14;
	public double luas;
	
	public Lingkaran (double jari){
		this.jari = jari;
	}
	
	public double hitungLuas() {
		return luas = PHI * jari * jari;
	}
	
	public static void main(String[] args) {
		Lingkaran l1 = new Lingkaran(20.0);
		
		double luas = l1.hitungLuas();
		
		System.out.println(luas);
		l1.jari = luas;
		System.out.println(luas);
	}
	
}
