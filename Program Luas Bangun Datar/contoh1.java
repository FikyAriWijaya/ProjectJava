import java.util.Scanner;

class contoh1{

	public static void main(String[] args){

    double r, phi, luasli;
    int opsi, nilai1, nilai2, luasp, luase;

    Scanner Input = new Scanner(System.in);

	System.out.println("--------------------------------------");
	System.out.println("Nama: Fiky Ari Wijaya");
    System.out.println("NPM: 4520210095");
    System.out.println("Program: Program Luas Bangun Datar");
    System.out.println("Update: 06 October 2021");
    System.out.println("--------------------------------------");
    System.out.print("Operasi Matematik");
    System.out.println("\n");
    System.out.println("1. Menghitung Luas Persegi");
    System.out.println("2. Menghitung Luas Lingkaran");
    System.out.println("3. Menghitung Luas Segitigas sama sisi");
    System.out.println("4. Keluar ");
    System.out.println("\n");
    System.out.print("Memilih : ");
    opsi = Input.nextInt();
    System.out.println("\n");

    switch(opsi){

        case 1 :
        System.out.println("--------------------------------------");
        System.out.println("Luas Persegi");
        System.out.println("--------------------------------------");
        System.out.print("Masukan Nilai Sisi = ");
        nilai1 = Input.nextInt();
        System.out.print("Masukan Nilai Sisi = ");
        nilai2 = Input.nextInt();
        luasp = nilai1 * nilai2;
        System.out.println("\n");
        if( luasp % 2 == 0){
            System.out.println("Luas Persegi : "+luasp+" (Bilangan Genap)");
        }
        else{
            System.out.println("Luas Persegi : "+luasp+" (Bilangan Ganjil)");
        };
        System.out.println("--------------------------------------");
        break;

        case 2 :
        System.out.println("--------------------------------------");
        System.out.println("Luas Lingkaran");
        System.out.println("--------------------------------------");
        System.out.print("Masukan Nilai r (jari-jari) = ");
        r = Input.nextDouble();
        phi = 3.14;
        luasli = phi * r * r;
        System.out.println("\n");
        if( luasli % 2 == 0){
            System.out.println("Luas Lingaran : "+luasli+" (Bilangan Genap)");
        }
        else{
            System.out.println("Luas Lingkaran : "+luasli+" (Bilangan Ganjil)");
        };
        System.out.println("--------------------------------------");
        break;

        case 3 :
        System.out.println("--------------------------------------");
        System.out.println("Luas Segitiga");
        System.out.println("--------------------------------------");
        System.out.print("Masukan Nilai Alas = ");
        nilai1 = Input.nextInt();
        System.out.print("Masukan Nilai Tinggi = ");
        nilai2 = Input.nextInt();
        luase = nilai1 * nilai2 / 2;
        System.out.println("\n");
        if( luase % 2 == 0){
            System.out.println("Luas Segitiga : "+luase+" (Bilangan Genap)");
        }
        else{
            System.out.println("Luas Segitiga : "+luase+" (Bilangan Ganjil)");
        };
        System.out.println("--------------------------------------");
        break;

        case 4 :
        System.out.println("Terimakasih Telah menggunakan Program ini");
        break;

        default :
        System.out.println("Perintah Opsion Tidak di temukan");
        break;
    }
}
}