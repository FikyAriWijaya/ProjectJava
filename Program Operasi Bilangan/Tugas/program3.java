import java.util.Scanner;

public class program3 {

    static int luas(int x1, int x2)
    {
        return x1*x2;
    }
    static int keliling(int x1, int x2)
    {
        return 2*x1 + 2*x2;
    }
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    int panjang, lebar;

    System.out.println("-----------------------------------------");
    System.out.println("Nama: Fiky Ari Wijaya");
    System.out.println("NPM: 4520210095");
    System.out.println("Program: Program Bangun Datar");
    System.out.println("Update: 28 September 2021");
    System.out.println("-----------------------------------------");
    System.out.println("");
    
    System.out.println("-----------------------------------------");
    System.out.println("Pengoprasian Bangun Datar Persegi Panjang");
    System.out.println("-----------------------------------------");
    System.out.println("");

    System.out.print(">> Masukan Panjang       : ");
    panjang=input.nextInt();
    System.out.print(">> Masukan Lebar         : ");
    lebar=input.nextInt();
    System.out.println("");
        
    System.out.println("Luas Persegi Panjang     : "+luas(panjang,lebar));
    System.out.println("Keliling Persegi Panjang : " + keliling(panjang,lebar));
    System.out.println("-----------------------------------------");
    }  
}


