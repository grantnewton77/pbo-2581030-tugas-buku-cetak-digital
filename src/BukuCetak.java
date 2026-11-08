
public class BukuCetak extends Buku {

    private int beratGram;

    // Constructor
    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    // Menghitung ongkir berdasarkan berat buku
    public int hitungOngkir() {
        return (int) Math.ceil(beratGram / 500.0) * 5000;
    }

    // Override hargaAkhir()
    @Override
    public int hargaAkhir() {
        return super.hargaAkhir() + hitungOngkir();
    }

    // Override tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();

        System.out.println("  Berat       : " + beratGram + " gram");
        System.out.println("  Ongkir      : " + formatRupiah(hitungOngkir()));
        System.out.println("  Harga akhir : " + formatRupiah(hargaAkhir()));
    }
}

