import java.util.Scanner;

class Sewa {
    // Atribut
    String jenisSewa;
    int hargaSewa;
    int jumlahJamSewa;
    boolean scValid = false;
    // Constructor
    public Sewa(String jenisSewa, int hargaSewa, int jumlahJamSewa, int hitungHargaSewa) {
        this.jenisSewa = jenisSewa;
        this.hargaSewa = hargaSewa;
        this.jumlahJamSewa = jumlahJamSewa;
    }

    // Metode void untuk menangani pilihan jenis sewa
    public void pilihSewa(Scanner sc) {
        System.out.println("*Jenis Penyewaan*");
        System.out.println("1. Rias Wajah (Biasa/MUA)");
        System.out.println("2. Baju Pengantin (Adat/Internasional)");
        System.out.println("3. Aksesoris (Anak/Dewasa)");
        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        int pilihanSewa = sc.nextInt();
        // Mengecek pilihan dan mengatur harga sewa berdasarkan pilihan
        switch (pilihanSewa) {
             case 1:
                System.out.println("------------------ o0o -------------------");
                System.out.println("========= MENU RIAS WAJAR ==========");
                System.out.println("1. Rias Wajah biasa Rp. 100.000");
                System.out.println("2. Rias Wajah (Make Up Artis)  Rp. 250.000");
                System.out.println("------------------ o0o -------------------");
                do{  
                    System.out.print("Masukkan pilihan Anda (1/2): ");
                    int menu_rias = sc.nextInt();
                    System.out.println("------------------ o0o -------------------");
                     if(menu_rias == 1){
                    jenisSewa = "Rias Wajah Biasa";
                    hargaSewa = 100000;
                    System.out.print("Berapa Jam: ");
                    jumlahJamSewa = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    scValid = true;
                    } else if(menu_rias == 2){
                    jenisSewa = "Rias Wajah (Make Up Artis)";
                    hargaSewa = 250000;
                    System.out.print("Berapa Jam: ");
                    jumlahJamSewa = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    scValid = true;
                    } else {
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    }
                } while (!scValid);
                break;
            case 2:
                System.out.println("------------------ o0o -------------------");
                System.out.println("========= MENU  BAJU PENGANTIN ==========");
                System.out.println("1. Baju Pengantin Adat   Rp. 150.000");
                System.out.println("2. Baju Pengantin Internasional Rp. 350.000");
                System.out.println("------------------ o0o -------------------");
                do{  
                    System.out.print("Masukkan pilihan Anda (1/2): ");
                    int menu_baju = sc.nextInt();
                    System.out.println("------------------ o0o -------------------");
                     if(menu_baju == 1){
                    jenisSewa = "Baju Pengantin Adat";
                    hargaSewa = 150000;
                    System.out.print("Berapa Jam: ");
                    jumlahJamSewa = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    scValid = true;
                    } else if(menu_baju == 2){
                    jenisSewa = "Baju Pengantin Internasional";
                    hargaSewa = 350000;
                    System.out.print("Berapa Jam: ");
                    jumlahJamSewa = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    scValid = true;
                    } else {
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    }
                } while (!scValid);
                break;
            case 3:
                System.out.println("------------------ o0o -------------------");
                System.out.println("========= MENU AKSESORIS ==========");
                System.out.println("1. Aksesoris Anak         Rp. 20.000");
                System.out.println("2. Aksesoris Dewasa       Rp. 50.000");
                System.out.println("------------------ o0o -------------------");
                do{  
                    System.out.print("Masukkan pilihan Anda (1/2): ");
                    int menu_aksesoris = sc.nextInt();
                    System.out.println("------------------ o0o -------------------");
                     if(menu_aksesoris == 1){
                    jenisSewa = "Aksesoris Anak";
                    hargaSewa = 20000;
                    System.out.print("Berapa Jam: ");
                    jumlahJamSewa = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    scValid = true;
                    } else if(menu_aksesoris == 2){
                    jenisSewa = "Aksesoris Dewasa";
                    hargaSewa = 50000;
                    System.out.print("Berapa Jam: ");
                    jumlahJamSewa = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    scValid = true;
                    } else {
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    }
                } while (!scValid);
                break;
            default:
                System.out.println("Pilihan Tidak Ada");
        }
        }
    
    public String getJenisSewa() {
        return jenisSewa;
    }

    public int getHargaSewa() {
        return hargaSewa;
    }
    
    public int getJamSewa() {
        return jumlahJamSewa;
    }

    // Metode non-void untuk menghitung harga per jenis sewa
    public int hitungHargaSewa() {
        return hargaSewa * jumlahJamSewa;
    }
}