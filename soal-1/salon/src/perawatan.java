import java.util.Scanner;

class Perawatan {
    // Atribut
    String jenisPerawatan;
    int hargaPerawatan,jumlahOrang;
    
    // Constructor
    public Perawatan(String jenisPerawatan, int hargaPerawatan, int jumlahOrang, int hitungHargaPerawatan) {
        this.jenisPerawatan = jenisPerawatan;
        this.hargaPerawatan = hargaPerawatan;
        this.jumlahOrang = jumlahOrang;

    }

    // Metode void untuk menangani pilihan jenis perawatan
    public void pilihPerawatan(Scanner sc) {
        boolean inputValid = false;
        System.out.println("*Jenis Perawatan*");
        System.out.println("1. Facial Wajah");
        System.out.println("2. Masker");
        System.out.println("3. Potong Rambut");
        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        int pilihanPerawatan = sc.nextInt();
        
        
        // Mengecek pilihan dan mengatur harga perawatan berdasarkan pilihan
        switch (pilihanPerawatan) {
            case 1:
                System.out.println("------------------ o0o -------------------");
                System.out.println("========= MENU FACIAL WAJAH ==========");
                System.out.println("1. Facial biasa Rp. 50.000");
                System.out.println("2. Facial Emas  Rp. 100.000");
                System.out.println("------------------ o0o -------------------");
                do{  
                    System.out.print("Masukkan pilihan Anda (1/2): ");
                    int menu_facial = sc.nextInt();
                    System.out.println("------------------ o0o -------------------");
                     if(menu_facial == 1){
                    jenisPerawatan = "Facial Biasa";
                    hargaPerawatan = 50000;
                    System.out.print("Masukkan jumlah orang: ");
                    jumlahOrang = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    inputValid = true;
                    } else if(menu_facial == 2){
                    jenisPerawatan = "Facial Emas";
                    hargaPerawatan = 100000;
                    System.out.print("Masukkan jumlah orang: ");
                    jumlahOrang = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    inputValid = true;
                    } else {
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    }
                } while (!inputValid);
                break;
            case 2:
                System.out.println("------------------ o0o -------------------");
                System.out.println("========= MENU MASKER ==========");
                System.out.println("1. Masker Buah   Rp. 40.000");
                System.out.println("2. Masker Lumpur Rp. 75.000");
                System.out.println("------------------ o0o -------------------");
                do{  
                    System.out.print("Masukkan pilihan Anda (1/2): ");
                    int menu_masker = sc.nextInt();
                    System.out.println("------------------ o0o -------------------");
                     if(menu_masker == 1){
                    jenisPerawatan = "Masker Buah";
                    hargaPerawatan = 40000;
                    System.out.print("Masukkan jumlah orang: ");
                    jumlahOrang = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    inputValid = true;
                    } else if(menu_masker == 2){
                    jenisPerawatan = "Masker Lumpur";
                    hargaPerawatan = 75000;
                    System.out.print("Masukkan jumlah orang: ");
                    jumlahOrang = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    inputValid = true;
                    } else {
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    }
                } while (!inputValid);
                break;
            case 3:
                System.out.println("------------------ o0o -------------------");
                System.out.println("========= MENU POTONG RAMBUT ==========");
                System.out.println("1. Tidak Keramas  Rp. 20.000");
                System.out.println("2. Keramas        Rp. 35.000");
                System.out.println("------------------ o0o -------------------");
                do{  
                    System.out.print("Masukkan pilihan Anda (1/2): ");
                    int menu_potong = sc.nextInt();
                    System.out.println("------------------ o0o -------------------");
                     if(menu_potong == 1){
                    jenisPerawatan = "Tidak Keramas";
                    hargaPerawatan = 20000;
                    System.out.print("Masukkan jumlah orang: ");
                    jumlahOrang = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    inputValid = true;
                    } else if(menu_potong == 2){
                    jenisPerawatan = "Keramas";
                    hargaPerawatan = 35000;
                    System.out.print("Masukkan jumlah orang: ");
                    jumlahOrang = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    inputValid = true;
                    } else {
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    }
                } while (!inputValid);
                break;
            default:
                System.out.println("Pilihan Tidak Ada");
        }
        
        
    }
    public String getJenisPerawatan() {
        return jenisPerawatan;
    }

    public int getHargaPerawatan() {
        return hargaPerawatan;
    }

 
    public int getJumlahOrang() {
        return jumlahOrang;
    }

    public int hitungHargaPerawatan() {
        return hargaPerawatan * jumlahOrang;
    }
}