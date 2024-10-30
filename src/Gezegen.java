// Gezegen Enum sınıfı
public enum Gezegen {
    MERKÜR(1, 57.9, 2439.7, 58.6),
    VENÜS(2, 108.2, 6051.8, -243),
    DÜNYA(3, 149.6, 6371.0, 1.0),
    MARS(4, 227.9, 3389.5, 1.03),
    JÜPİTER(5, 778.5, 69911.0, 0.41),
    SATÜRN(6, 1434.0, 58232.0, 0.45),
    URANÜS(7, 2871.0, 25362.0, -0.72),
    NEPTÜN(8, 4497.1, 24622.0, 0.67);

    // Özellikler
    private final int sira;
    private final double uzaklik; // milyon km cinsinden Güneş'e uzaklık
    private final double yaricap; // km cinsinden yarıçap
    private final double donmeSuresi; // gün cinsinden dönme süresi

    // Constructor
    Gezegen(int sira, double uzaklik, double yaricap, double donmeSuresi) {
        this.sira = sira;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    // Özellikleri ekrana yazdırma metodu
    @Override
    public String toString() {
        return String.format("%s -> Sıra: %d, Uzaklık: %.1f milyon km, Yarıçap: %.1f km, Dönme Süresi: %.2f gün",
                this.name(), sira, uzaklik, yaricap, donmeSuresi);
    }

    // Main metodu
    public static void main(String[] args) {
        System.out.println("Güneş Sistemi Gezegenleri:");
        for (Gezegen gezegen : Gezegen.values()) {
            System.out.println(gezegen);
        }
    }
}
