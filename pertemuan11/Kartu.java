package pertemuan10;

public interface Kartu {
    // Method untuk otentikasi: mengembalikan true jika PIN benar
    public boolean otentikasi(String pin);

    // Method untuk encode data, mengembalikan informasi encode
    public String encode(String pin);
}
