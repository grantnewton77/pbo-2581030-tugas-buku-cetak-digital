
public class TokoBuku {

    public static void main(String[] args) {

        // Membuat objek buku
        BukuCetak buku1 = new BukuCetak(
                "Pemrograman Java", "John Doe", 120000, 750
        );

        BukuCetak buku2 = new BukuCetak(
                "Algoritma Dasar", "Jane Smith", 95000, 400
        );

        BukuDigital buku3 = new BukuDigital(
                "Belajar OOP", "Ani Wijaya", 80000, 12.5
        );

        // Menyimpan buku dalam array
        Buku[] keranjang = {buku1, buku2, buku3};

        int totalBayar = 0;

        System.out.println("============== KERANJANG ==============");

        // Menampilkan informasi dan menghitung total
        for (Buku buku : keranjang) {
            buku.tampilkanInfo();

            totalBayar += buku.hargaAkhir();

            System.out.println();
        }

        System.out.println("---------------------------------------");
        System.out.println("Total bayar : " + Buku.formatRupiah(totalBayar));
    }
}
