import java.text.DecimalFormat;
import java.util.Scanner;
public class Salon {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        Perawatan perawatan = new Perawatan("", 0, 0,0);
        Sewa sewa = new Sewa("", 0, 0,0);
        int totalHargaPerawatan = 0;
        int totalHargaSewa = 0;
        String nama , nohp ,pilihan;
        int pilihanmenu;

        System.out.println("---- Selamat Datang di Salon Cantika ----");
        System.out.println("=========================================");
        System.out.print("Masukkan Nama Pelanggan    : ");
        nama = sc.nextLine();
        System.out.print("Masukkan No Telp Pelanggan : ");
        nohp = sc.nextLine();
        
        char lanjutkan = 'y';

        
        System.out.println("------------------ o0o -------------------");
        System.out.print("lakukan transaksi [y/t] ?? : ");
        lanjutkan = sc.next().charAt(0);
        
        while (lanjutkan == 'y' || lanjutkan == 'Y') {
            
            
            System.out.println("------------------ o0o -------------------");
            System.out.println("Menu Pilihan : ");
            System.out.println("1. Jenis Perawatan");
            System.out.println("2. Jenis Penyewaan");
            System.out.println("------------------ o0o -------------------");
            System.out.print("Pilihan Anda (Ketik 1/2): ");
            pilihanmenu = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            if (pilihanmenu == 1) {
                perawatan.pilihPerawatan(sc);
                
                int hargaPerawatan = perawatan.hitungHargaPerawatan();
                totalHargaPerawatan += hargaPerawatan;
                System.out.println("Harga Sebesar : " + hargaPerawatan);
            }else if (pilihanmenu == 2) {
                sewa.pilihSewa(sc);
                int hargaSewa = sewa.hitungHargaSewa();
                totalHargaSewa += hargaSewa;
                System.out.println("Harga Sebesar : " + hargaSewa);
            }

            System.out.println("------------------ o0o -------------------");
            System.out.print("Input lagi [y/t]? : ");
            lanjutkan = sc.next().charAt(0);
        }
        String totalharga = df.format(totalHargaPerawatan + totalHargaSewa);
        System.out.println("Total Yang Harus Dibayar : Rp."+totalharga);
        System.out.println("\nTerimakasih "+nama+" Sudah datang di Salon Cantika\nMembuat Anda Cantik Adalah Keahlian Kami");
        
        sc.close();
    }
    
}
