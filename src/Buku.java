
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Buku {
    private String judul;
    private String penulis;
    private int harga;

    // Constructor
    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    // Mengembalikan harga asli buku
    public int hargaAkhir() {
        return harga;
    }

    // Menampilkan informasi dasar buku
    public void tampilkanInfo() {
        System.out.println(judul + " (" + penulis + ")");
        System.out.println("  Harga       : " + formatRupiah(harga));
    }

    // Format angka menjadi Rupiah
    protected static String formatRupiah(int angka) {
        DecimalFormatSymbols simbol = new DecimalFormatSymbols();
        simbol.setGroupingSeparator('.');

        DecimalFormat format = new DecimalFormat("#,##0", simbol);

        return "Rp" + format.format(angka);
    }
}
