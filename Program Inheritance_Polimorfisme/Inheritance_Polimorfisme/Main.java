import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        Sapipanggang objek1 = new Sapipanggang("Chitato", "Sapi Panggang ", "Medium", "Normal", 30000, "Rempah Barberque Panggang");
        Salmon objek2 = new Salmon("Chitato", "Salmon ", "Spesial", "Normal", 45000, "Repah Rumput Laut rih Spesial");
        Ayamgeprek objek3 = new Ayamgeprek("Chitato", "Ayam Geprek", "Spesial Hot", "Normal", 35000, "Rempah Gurih Bumbu Ayam Bawang");

        Scanner Input = new Scanner(System.in);
        
        System.out.println("--------------------------------------");
		System.out.println("Nama    : Fiky Ari Wijaya");
	 	System.out.println("NPM     : 4520210095");
	 	System.out.println("Program : Inheritance_Polimorfisme");
	 	System.out.println("Update  : 03 November 2021");
	 	System.out.println("--------------------------------------");
	 	System.out.println("");
        System.out.println("Menampilkan Farian Rasa Chitato");
        System.out.println("");
        System.out.println("1. Rasa Sapi Panggang");
        System.out.println("2. Rasa Salmon");
        System.out.println("3. Rasa Ayam Geprek");
        System.out.println("");
        System.out.print("Check Out Masukan = ");
        int opsi = Input.nextInt();
        System.out.println("");

        switch(opsi){

            case 1 :
            objek1.kategori();
            System.out.println(objek1.manfaat);
            System.out.println("");
            System.out.print("Masukan Jumlah Yang Ingin di beli : ");
            int berapa = Input.nextInt();
            System.out.println("");
            int hasil = berapa * objek1.hargaper;
            System.out.println("Subtotal Bayar = Rp. "+hasil);
    
            System.out.print("Jumlah yang harus dibayar sebesar Rp. "+hasil+" bayar sebesar =  Rp. ");
            int total = Input.nextInt();
            if (total == hasil){
                System.out.println("( Lunas )");
            }
            else if(total < hasil){
                int sisaan = hasil - total;
                System.out.println("Sisa yang Harus di bayar Rp. "+sisaan+" ( Terimakasih ) ingat sisah yang harus dibayar "+sisaan);
            }
            else if(total > hasil){
                int lebih = total-hasil;
                System.out.println("Ettt duit nya ke banyakan ni kembali nya jadi "+lebih);
            }
            else{
                System.out.println("Masukin Yang bener atuh");
            }
            System.out.println("-------------------------------------------------------------------------------"); break;

            case 2 :
            objek2.kategori();
            System.out.println(objek2.manfaat);
            System.out.println("");
            System.out.print("Masukan Jumlah Yang Ingin di beli : ");
            int berapa2 = Input.nextInt();
            System.out.println("");
            int hasil2 = berapa2 * objek2.hargaper;
            System.out.println("Subtotal Bayar = Rp. "+hasil2);
    
            System.out.print("Jumlah yang harus dibayar sebesar Rp. "+hasil2+" bayar sebesar =  Rp. ");
            int total2 = Input.nextInt();
            if (total2 == hasil2){
                System.out.println("( Lunas )");
            }
            else if(total2 < hasil2){
                int sisaan2 = hasil2 - total2;
                System.out.println("Sisa yang Harus di bayar Rp. "+sisaan2+" ( Terimakasih ) ingat sisah yang harus dibayar "+sisaan2);
            }
            else if(total2 > hasil2){
                int lebih2 = total2-hasil2;
                System.out.println("Ettt duit nya ke banyakan ni kembali nya jadi "+lebih2);
            }
            else{
                System.out.println("Masukin Yang bener atuh");
            }
            System.out.println("-------------------------------------------------------------------------------"); break;

            case 3 :
            objek3.kategori();
            System.out.println(objek3.manfaat);
            System.out.println("");
            System.out.print("Masukan Jumlah Yang Ingin di beli : ");
            int berapa3 = Input.nextInt();
            System.out.println("");
            int hasil3 = berapa3 * objek3.hargaper;
            System.out.println("Subtotal Bayar = Rp. "+hasil3);
    
            System.out.print("Jumlah yang harus dibayar sebesar Rp. "+hasil3+" bayar sebesar =  Rp. ");
            int total3 = Input.nextInt();
            if (total3 == hasil3){
                System.out.println("( Lunas )");
            }
            else if(total3 < hasil3){
                int sisaan3 = hasil3 - total3;
                System.out.println("Sisa yang Harus di bayar Rp. "+sisaan3+" ( Terimakasih ) ingat sisah yang harus dibayar "+sisaan3);
            }
            else if(total3 > hasil3){
                int lebih3 = total3-hasil3;
                System.out.println("Ettt duit nya ke banyakan ni kembali nya jadi "+lebih3);
            }
            else{
                System.out.println("Masukin Yang bener atuh");
            }
            System.out.println("-------------------------------------------------------------------------------"); break;

            default : System.out.println("Data Yang dipilih tidak sesuai Index");

        }
     
    }

}