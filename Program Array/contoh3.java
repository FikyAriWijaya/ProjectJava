import java.util.Scanner;

public class contoh3 {

    public static void main(String[] args){

        Scanner Input = new Scanner(System.in);
		
		System.out.println("\n");
        System.out.println("----------------------------------------");
        System.out.println("Nama    : Fiky Ari Wijaya");
        System.out.println("NPM     : 4520210095");
        System.out.println("Program : Array 2D");
        System.out.println("Update  : 19 October 2021");
        System.out.println("----------------------------------------");
        System.out.println("\n");

        System.out.print(" Masukkan jumlah baris pertama : ");
        int baris = Input.nextInt();
        System.out.print(" Masukkan jumlah kolom pertama : ");
        int kolom = Input.nextInt();

        System.out.println("\n");

        System.out.println(" Masukkan data pada matriks");
        System.out.println();
        int matriks[][] = new int[baris][kolom];
        for(int i=0; i<=baris-1; i++){
            for (int j=0; j<=kolom-1; j++){
                System.out.print(" Data baris ke-" +(i+1)+ " kolom ke-" +(j+1)+ " : ");
                matriks[i][j] = Input.nextInt();
            }
        }

        System.out.println();
        System.out.println("Isi Matriks");
        System.out.println("\n");

        for(int i=0; i<=baris-1; i++){
            for(int j=0; j<=kolom-1; j++){
                System.out.print(matriks[i][j] + "  ");
            }System.out.println();
        }
    }
}
