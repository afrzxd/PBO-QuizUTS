import java.util.Scanner;
public class pinjaman {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    karung karung =new karung();
    paperbag paperbag= new paperbag();

    int pilihpaket;
        System.out.println("===============<>===============");
        System.out.println("WELCOME TO THE SOLUTION OF MONEY");
        System.out.println("================<>==============");
        System.out.println("Silahkan pilih Paket Pinjaman : ");
        System.out.println("1. PAKET KARUNG");
        System.out.println("2. PAKET PAPER BAG");
        System.out.print("Masukkan pilihan Paket : ");
        pilihpaket=sc.nextInt();
        if (pilihpaket==1){
            karung.datapembeli();
            karung.pilihkarung();
            karung.totalpinjaman();
        
}
        else if (pilihpaket==2){
            paperbag.datapembeli();
            paperbag.pilihkarung();
            paperbag.totalpinjaman();
    }
        else {
            System.out.println("Pilihan Tidak Tersedia");
        }
        sc.close();
}
}

