import java.util.Scanner;

class program2 {
	static int penjumlahan(int bil_1, int  bil_2){
		return bil_1 + bil_2;
	}
	static int pengurangan(int bil_1, int bil_2){
		return bil_1 - bil_2;
	}
	static int perkalian(int bil_1, int bil_2){
		return bil_1 * bil_2;
	}
	static int pembagian(int bil_1, int bil_2){
		return bil_1 / bil_2;
	}
	static int modulus(int bil_1, int bil_2){
		return bil_1 % bil_2;
	}

	public static void main (String[] args) {
	System.out.println("--------------------------------------");
	System.out.println("Nama: Fiky Ari Wijaya");
    System.out.println("NPM: 4520210095");
    System.out.println("Program: Program Operasi Bilangan");
    System.out.println("Update: 28 September 2021");
    System.out.println("--------------------------------------");
    System.out.println("");
	

	Scanner Input = new Scanner(System.in);

	int data1, data2;

	System.out.println("--------------------------------------");
	System.out.println("Operasi Penjumlahan");
	System.out.println("--------------------------------------");
	System.out.print(">> Masukan Nilai ke 1 (satu) : ");
	data1 = Input.nextInt();
	System.out.print(">> MAsukan Nilai ke 2 (Dua)  : ");
	data2 = Input.nextInt();
	System.out.println("");
	System.out.println("Hasil Operasi = "+data1+" + "+data2+" = " + penjumlahan(data1,data2));
	System.out.println("--------------------------------------");

	System.out.println("");
	System.out.println("--------------------------------------");
	System.out.println("Operasi Pengurangan");
	System.out.println("--------------------------------------");
	System.out.print(">> Masukan Nilai ke 1 (satu) : ");
	data1 = Input.nextInt();
	System.out.print(">> MAsukan Nilai ke 2 (Dua)  : ");
	data2 = Input.nextInt();
	System.out.println("");
	System.out.println("Hasil Operasi = "+data1+" - "+data2+" = " + pengurangan(data1,data2));
	System.out.println("--------------------------------------");
	
	System.out.println("");
	System.out.println("--------------------------------------");
	System.out.println("Operasi Perkali");
	System.out.println("--------------------------------------");
	System.out.print(">> Masukan Nilai ke 1 (satu) : ");
	data1 = Input.nextInt();
	System.out.print(">> MAsukan Nilai ke 2 (Dua)  : ");
	data2 = Input.nextInt();
	System.out.println("");
	System.out.println("Hasil Operasi = "+data1+" x "+data2+" = " + perkalian(data1,data2));
	System.out.println("--------------------------------------");

	System.out.println("");
	System.out.println("--------------------------------------");
	System.out.println("Operasi Pembagian");
	System.out.println("--------------------------------------");
	System.out.print(">> Masukan Nilai ke 1 (satu) : ");
	data1 = Input.nextInt();
	System.out.print(">> MAsukan Nilai ke 2 (Dua)  : ");
	data2 = Input.nextInt();
	System.out.println("");
	System.out.println("Hasil Operasi = "+data1+" : "+data2+" = " + pembagian(data1,data2));
	System.out.println("--------------------------------------");

	System.out.println("");
	System.out.println("--------------------------------------");
	System.out.println("Operasi Modulus");
	System.out.println("--------------------------------------");
	System.out.print(">> Masukan Nilai ke 1 (satu) : ");
	data1 = Input.nextInt();
	System.out.print(">> MAsukan Nilai ke 2 (Dua)  : ");
	data2 = Input.nextInt();
	System.out.println("");
	System.out.println("Hasil Operasi = "+data1+" bagi "+data2+" Sisa " + " = " + modulus(data1,data2));
	System.out.println("--------------------------------------");

	}
}