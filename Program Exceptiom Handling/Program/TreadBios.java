import java.util.Scanner;
public class TreadBios extends Thread{

    protected String namaBios;
    protected int tiket;
    protected int hargati;
    protected int keseluruhan;

    protected TreadBios(String namaBios,int hargati){

        this.namaBios = namaBios;
        this.hargati = hargati;
    }

    Scanner Input = new Scanner(System.in);

    @Override
    public void run(){

        TreadBios2 Bios2 = new TreadBios2();   
        System.out.println("Penayangan Film Bioskop "+this.namaBios);
        System.out.println("");
        System.out.println("1. Dragon-Ball");
        System.out.println("2. Naruto-Harvargan");
        System.out.println("3. Bermain-Ketsing");
        System.out.println("4. Beradu-Nyali");
        System.out.println("");
            try{
                System.out.println("Proses - - -  wait - - -");
                sleep(1000);
                System.out.println("Check in Keterangan tayang. ");
                System.out.println("");
                System.out.println(">>                         >>");
                System.out.println("");
                for(int a = 1; a < 4; a++){
                    sleep(1000);
                }
                Bios2.start();
                sleep(1000);
                System.out.println("");
                System.out.println("Ok Data Bisa dlihat");
                System.out.println("");
                System.out.println(">>                         >>");
                System.out.println("");
                for(int b = 1; b < 4; b++){
                    sleep(1000);
                }
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("Nama Bioskop  ------------------------------------------------- "+this.namaBios);
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("");
                System.out.print("Masukan Kategori film yang dipilih = ");
                String[] studi = {"Dragon-Ball","Naruto-Harvargan","Bermain-Ketsing","Beradu-Nyali","Pokemon-Expirit"};
                int masukin = Input.nextInt();
                System.out.println("Tarif pertiket  = "+this.hargati);
                System.out.println("");
                System.out.print("Banyak Tiket   = ");
                tiket = Input.nextInt();
                System.out.println("\n");
                keseluruhan = this.hargati * tiket;
                System.out.println("Tottal Pembayarn = "+keseluruhan);
                System.out.println("");
                System.out.println("--------------------------------------------------------              ----");
                System.out.println("                                                            PROSESSS      ");
                System.out.println("---------------------------------------------------------             ----");
                for(int b = 1; b < 4; b++){
                    System.out.println("");
                    sleep(1000);
                }
                System.out.println("");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("Nama Bioskop  ------------------------------------------------  "+this.namaBios+" ");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("");
                switch(masukin){
                    case 0 :
                    System.out.println("Film yang dipilih = >> "+studi[0]);break;
                    case 1 :
                    System.out.println("Film yang dipilih = >> "+studi[1]);break;
                    case 2 :
                    System.out.println("Film yang dipilih = >> "+studi[2]);break;
                    case 3 :
                    System.out.println("Film yang dipilih = >> "+studi[3]);break;
                    case 4 :
                    System.out.println("Film yang dipilih = >> "+studi[4]);break;
                    default :
                    System.out.println("Pengakategorian Film Tidak ditemukan");break;
                }
                System.out.println("");
                System.out.println("Tottal Pembayarn = "+keseluruhan);
                System.out.println("");
                System.out.println("-------       ------------------------------------------------------------");
                System.out.println("                                                               - Proses -");
                System.out.println("--------------------------------------------------------------------------");
                for(int b = 1; b < 4; b++){
                    sleep(800);
                }
                System.out.println("");
                sleep(1000);
                System.out.println("Data Berhasi Diproses");
                System.out.println("-    Terimakasih    -");
                System.out.println("Selamat Menyaksikan Film");
                System.out.println("\n");
            }
            catch(InterruptedException e){
            }
    }
    
}

