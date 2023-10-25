import java.util.Scanner;
class transaksi{
    Scanner sc = new Scanner(System.in);

    int daftar, obat, vitamin, dokter, biayadokter,total;
    
    void transaksi(int daftar, int obat, int vitamin, int dokter, int total){
    this.daftar=daftar;
    this.obat=obat;
    this.vitamin=vitamin;
    this.dokter=dokter;
    this.total=total;
    }
    
   void hitung(){
       System.out.print("\nMasukkan biaya pendaftaran   Rp. ");
       daftar=sc.nextInt();
       System.out.print("Masukkan biaya Obat            Rp. ");
       obat=sc.nextInt();
       System.out.print("Masukkan biaya Vitamin         Rp. ");
       vitamin=sc.nextInt();
       System.out.print("Masukkan biaya Dokter          Rp. ");
       biayadokter=sc.nextInt();
       System.out.println("------------------|||-------------------");
       System.out.println("========================================\n");
       total =  daftar + obat + vitamin + biayadokter;
    }
     
}
