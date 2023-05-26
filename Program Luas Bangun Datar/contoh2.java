import java.util.Scanner;

public class contoh2 {

public static void main(String[] args){

	Scanner Input = new Scanner(System.in);

	System.out.println("--------------------------------------");
	System.out.println("Nama: Fiky Ari Wijaya");
   System.out.println("NPM: 4520210095");
   System.out.println("Program: Program Konversi");
   System.out.println("Update: 06 October 2021");
   System.out.println("--------------------------------------");
   System.out.println("\n");
	System.out.print("Konversi Suhu");
	System.out.println("\n");
	System.out.println("1. Dari Celcius");
	System.out.println("2. Dari Reamur");
	System.out.println("3. Dari Fahrenheit");
	System.out.println("4. Dari Kelvin");
	System.out.println("5. Keluar");
	System.out.println("\n");
	System.out.print("Memilih  : ");
	int opsi = Input.nextInt();
	System.out.println("\n");
	switch (opsi){

		case 1:
		System.out.println("--------------------------------------");
		System.out.print("Masukkan Nilai Celcius : ");
		float c = Input.nextFloat();
		System.out.println("--------------------------------------");
		float reamur = 4*c / 5;
		float fahrenheit = 9*c / 5 +32;
		float kelvin = c + 273;
		System.out.println("Celcius -> Reamur     = " +reamur);
		System.out.println("Celcius -> Fahrenheit = " +fahrenheit);
		System.out.println("Celcius -> Kelvin     = " +kelvin);
		System.out.println("--------------------------------------");
		break;

		case 2 :
		System.out.println("--------------------------------------");
		System.out.print("Masukkan Nilai Reamur : ");
		float r = Input.nextFloat();
		System.out.println("--------------------------------------");
		float celcius = 5*r / 4;
		float kelvin2 = 5*r / 4 + 273;
		float fahrenheit2 = 9*r / 4 + 32;
		System.out.println("Reamur -> Celcius    = " +celcius);
		System.out.println("Reamur -> Kelvin     = "+kelvin2);
		System.out.println("Reamur -> Fahrenheit = "+fahrenheit2);
		System.out.println("--------------------------------------");
      break;

		case 3 :
		System.out.println("--------------------------------------");
		System.out.print("Masukkan Nilai Fahrenheit : ");
		float f = Input.nextFloat();
		System.out.println("--------------------------------------");
		float celcius2 = 5*(f-32)/9;
		float reamur2 = 4*(f-32)/9;
		float kelvin3 = 5*(f-32)/9 + 273;
		System.out.println("Fahrenheit -> Celcius    = " +celcius2);
		System.out.println("Fahrenheit -> Reamur     = " +reamur2);
		System.out.println("Fahrenheit -> Kelvin     = "+kelvin3);
      System.out.println("--------------------------------------");
      break;

		case 4:
		System.out.println("--------------------------------------");
		System.out.print("Masukkan Nilai Kelvin : ");
		float k = Input.nextFloat();
		System.out.println("--------------------------------------");
		float celcius3 = k-273;
		float reamur3 = 4*(k-273)/9;
		float fahrenheit3 = 9*(k-273)/5 + 32;
		System.out.println("Kelvin -> Celcius    = " +celcius3);
		System.out.println("Kelvin -> Reamur     = " +reamur3);
		System.out.println("Kelvin -> Fahrenheit = "+fahrenheit3);
      System.out.println("--------------------------------------");
      break;

		case 5 :
		System.out.println("Terimakasih Telah menggunakan program Ini");
      break;

		default:
		System.out.println("Opsion Tidak ditemukan");
      break;
		}
	}
}
