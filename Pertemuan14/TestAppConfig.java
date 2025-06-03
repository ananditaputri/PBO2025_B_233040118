package Pertemuan14;


public class TestAppConfig {
    public static void main(String[] args) {
        // Mencetak nilai-nilai konstanta dari AppConfig
        System.out.println("Base URL: " + AppConfig.BASE_URL);
        System.out.println("App Version: " + AppConfig.APP_VERSION);
        System.out.println("Default Timeout: " + AppConfig.DEFAULT_TIMEOUT + " ms");
    }
}