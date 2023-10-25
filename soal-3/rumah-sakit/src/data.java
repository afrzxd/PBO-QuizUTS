import java.util.Scanner;
class data{
    Scanner sc = new Scanner(System.in);

    int daftar, obat, vitamin, dokter, pilihdokter, pilihpoli;
    String nama, alamat,nohp, namadokter, poli , keterangan;
    
    void pasien(){

        System.out.println("*Masukkan Data Pasien*");
        System.out.print("Masukkan Nama : ");
        nama=sc.nextLine();
        System.out.print("Masukkan Alamat : ");
        alamat=sc.nextLine();
        System.out.print("Masukkan No.HP : ");
        nohp=sc.nextLine();
    
    }
    
    void poli(){
        System.out.println("\n*Nama Poli*");
        System.out.println("1. Gigi");
        System.out.println("2. Anak");
        System.out.println("3. Umum");
        System.out.print("\nPilih Poli: ");
        pilihpoli =sc.nextInt();
        if (pilihpoli==1){
            poli = "Gigi";
        }
        else if (pilihpoli==2){
           poli="anak";
       }
        else if (pilihpoli==3){
           poli="Umum";
       }
        else{
           System.out.println("Pilihan tidak Tersedia");
       }
    }
    void dokter(){
        System.out.println("\n*Nama Dokter*");
        System.out.println("1. drg. Ahmad Affandi");
        System.out.println("2. dr. Arif Wicaksono, Sp.A");
        System.out.println("3. dr. Alfia Putri");

        System.out.print("\nPilih Dokter : ");
         pilihdokter = sc.nextInt();
        if (pilihdokter==1){
            namadokter = "drg. Ahmad Affandi";
            
        }
        else if (pilihdokter==2){
           namadokter="dr. Arif Wicaksono, Sp.A";
           
       }
        else if (pilihdokter==3){
           namadokter="dr. Alfia Putri";
           
       }
       else{
           System.out.println("Pilihan tidak Tersedia");
       }
       sc.nextLine();
    }
    void keterangan(){
        
        System.out.println("\nBerikan Keterangan Dokter : ");
        keterangan = sc.nextLine();
    }
}
