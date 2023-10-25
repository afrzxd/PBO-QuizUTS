import java.text.DecimalFormat;
import java.util.Scanner;
class paperbag{

    DecimalFormat df = new DecimalFormat("#,###.00");
    Scanner input=new Scanner(System.in);
    
    private String nama, ktp;
    String paket;
    int pilih, lama, pinjaman;
    int bunga, wajibbulan, totalwajib;
    
    void datapembeli(){
        System.out.println("\nSilahkan Masukkan Data Anda");
        System.out.println("-------------<->-------------");
        System.out.println("Masukkan Nama Peminjam :");
        nama = input.nextLine();
        System.out.println("Masukkan No.KTP Peminjam :");
        ktp = input.nextLine();
}
    void pilihkarung(){
    System.out.println("===========================");
    System.out.println("   PILIH UKURAN PAPERBAG");
    System.out.println("===========================");
    System.out.println("1. XL");
    System.out.println("2. L");
    System.out.println("3. M");
    System.out.print("Masukkan Pilihan : ");
    pilih=input.nextInt();
    if (pilih==1){
        paket="XL";
        pinjaman=30000000;
    }
    if (pilih==2){
        paket="L";
        pinjaman=20000000;
    }
    if (pilih==3){
        paket="M";
        pinjaman=10000000;
    }
    System.out.println("Berapa Lama Pinjam (Bulan) : ");
    lama=input.nextInt();
    System.out.println("\nAnda Memilih Paket : "+paket);
    System.out.println("Dengan Pinjam Rp. "+pinjaman);
    bunga=(int) (0.025*pinjaman);
    System.out.println("Dengan Bunga : "+bunga);
    }
    
    void totalpinjaman(){
        System.out.println("================================");
        System.out.println("==== Total Kewajiban Pinjaman ====");
        System.out.println("Nama Peminjam adalah : "+nama);

        double wajibbulanDouble = (double) (pinjaman + bunga) / lama; // Gunakan double untuk hasil pembagian
        String formatbulanan = df.format(wajibbulanDouble);
        System.out.println("Kewajiban Bulanan    :     Rp. " + formatbulanan);
    
        double totalwajibDouble = (double) (pinjaman + bunga); // Gunakan double untuk hasil totalwajib
        String formatkewajiban = df.format(totalwajibDouble);
        System.out.println("\nTotal Pinjaman       :     Rp. " + formatkewajiban);
    
        System.out.println("\n\nTerimakasih sudah meminjam di THE SOLUTION OF MONEY\nPusing dengan keuangan... Kami Solusinya (*_*)");
    }
}