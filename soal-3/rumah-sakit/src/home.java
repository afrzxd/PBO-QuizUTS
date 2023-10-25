
public class home {
    public static void main(String []arags){
        data data = new data();
        transaksi transaksi = new transaksi();

        System.out.println("=== SELAMAT DATANG DI RUMAH SAKIT WARAS ===");
        System.out.println("===========================================");
        System.out.println("--------------------|||--------------------\n");
        
        data.pasien();
        data.poli();
        data.dokter();
        data.keterangan();
        transaksi.hitung();

       System.out.println("Poli                  "+data.poli);
       System.out.println("Dokter                "+data.namadokter);
       System.out.println("Keterangan            "+data.keterangan);
       System.out.println("\nTotal biaya yang dibayarkan pasien     Rp. "+transaksi.total);
       
       System.out.println("Salam Sehat selalu "+data.nama+" dari Rumah Sakit Waras" );
    }
}
