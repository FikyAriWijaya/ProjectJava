import java.util.Scanner;

public class contoh2 {

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

	String[] mahasiswa = {"Fiky","Bardan","Bagas","Kemal"};

    System.out.println(mahasiswa[0]);
    System.out.println(mahasiswa[1]);
    System.out.println(mahasiswa[2]);
    System.out.println(mahasiswa[3]);

    System.out.println("\n");

    for(int i=0; i<=3; i++){
        System.out.println(mahasiswa[i]);

    	}
	} 
}
