package pertemuan9;

public class InheritanceMain {
    public static void main(String[] args) {
        Manajer mnj = new Manajer("Anandita Putri", "Bandung", "Keuangan");
        Staf stf = new Staf("Hagen Alexdra", "Jakarta", "Malam");

        System.out.println("Data Manajer");
        System.out.println("Nama       : " + mnj.getNama());
        System.out.println("Alamat     : " + mnj.getAlamat());
        System.out.println("Departemen : " + mnj.getDepartemen());

        System.out.println("\n===========================\n");

        System.out.println("Data Staf");
        System.out.println("Nama   : " + stf.getNama());
        System.out.println("Alamat : " + stf.getAlamat());
        System.out.println("Shift  : " + stf.getShift());
    }
}
