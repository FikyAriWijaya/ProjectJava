import java.util.Scanner;

public class contoh1{

public static void main(String[] args){

	Scanner Input = new Scanner(System.in);

	System.out.println("\n");
	System.out.println("----------------------------------------");
	System.out.println("Nama    : Fiky Ari Wijaya");
	System.out.println("NPM     : 4520210095");
	System.out.println("Program : Array 1D");
	System.out.println("Update  : 19 October 2021");
	System.out.println("----------------------------------------");
	System.out.println("\n");

	String[] barang = new String[5];

	System.out.print("Nama barang 1: ");
	barang[0] = Input.nextLine();
	System.out.print("Nama barang 2: ");
	barang[1] = Input.nextLine();
	System.out.print("Nama barang 3: ");
	barang[2] = Input.nextLine();
	System.out.print("Nama barang 4: ");
	barang[3] = Input.nextLine();
	System.out.print("Nama barang 5: ");
	barang[4] = Input.nextLine();

	System.out.println("\n");

	System.out.println("Nama Barang : "+barang[0]+", "+barang[1]+", "+barang[2]+", "+barang[3]+", "+barang[4]);
} 
}
