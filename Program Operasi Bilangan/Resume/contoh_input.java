import java.util.Scanner;

public class contoh_input {
	public static void main(String[] args){

		System.out.println("--------------------------------------");
		System.out.println("Nama : Fiky Ari Wijaya");
	 	System.out.println("NPM : 4520210095");
	 	System.out.println("Program : Contoh Input Program");
	 	System.out.println("Update : 24 September 2021");
	 	System.out.println("--------------------------------------");
	 	System.out.println("");

		Scanner Input = new Scanner(System.in);

		System.out.print("Masukan Nama = ");
		String nama = Input.nextLine();
		System.out.println("Nama Saya Adalah : " + nama);
		
		System.out.print("Masukan Npm Anda = ");
		String NPM = Input.nextLine();
		System.out.println("NPM Saya Adalah : " + NPM);

		System.out.print("Masukan Usia Saya = ");
		int usia = Input.nextInt();
		System.out.println("Usia Saya : "+ usia + "Tahuun");

	}
}