import java.util.Scanner;

public class PenjualanProses {
    public static void main(String args[]) {
        String cek;
        Scanner input = new Scanner(System.in);
        Penjualan penjualanBaru = new Penjualan();

        do {
            System.out.print("Kode barang : ");
            penjualanBaru.kode = input.nextLine();
            System.out.print("Nama barang : ");
            penjualanBaru.nama = input.nextLine();
            System.out.print("Harga barang : ");
            penjualanBaru.harga = input.nextInt();
            System.out.print("Jumlah Pembelian : ");
            penjualanBaru.jumlah = input.nextInt();

            penjualanBaru.getTotalPembelian();
            penjualanBaru.getBonus();
            penjualanBaru.cetakNota();

            System.out.print("Input data lagi ? [Y/T] : ");
            cek = input.next();
        } while (cek.equalsIgnoreCase("Y"));
    }
}
