import java.util.Scanner;
public class Soal4 {
    
    public static void main(String[] args) {
        
        int gajiPokok = 500000;
        int hargaItem = 50000;
        double gajiTotal;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah penjualan bulan ini: ");
        int jumlahPenjualan = scanner.nextInt();
        
        if (jumlahPenjualan >= 80) {
            gajiTotal = gajiPokok + (0.35 * hargaItem * jumlahPenjualan);
        } else if (jumlahPenjualan >= 40) {
            gajiTotal = gajiPokok + (0.25 * hargaItem * jumlahPenjualan);
        } else if (jumlahPenjualan < 15) {
            double minusPenjualan = 0.15 * (15-jumlahPenjualan) * hargaItem;
            gajiTotal = gajiPokok - minusPenjualan;
        } else {
            gajiTotal = gajiPokok + (0.10 * hargaItem * jumlahPenjualan);
        }
        
        System.out.println("Gaji total yang diterima: Rp. " + gajiTotal);
        
        scanner.close();
    }
}


