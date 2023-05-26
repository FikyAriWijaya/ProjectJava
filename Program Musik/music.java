import java.util.Scanner;
public class music{

String judullagu;
String penyanyi;
String gandre;
    
public void setjudullagu(String judullagu){
	this.judullagu = judullagu;
}
public String getjudullagu(){
	return this.judullagu;
}
public void setpenyanyi(String penyanyi){
	this.penyanyi = penyanyi;
}
public String getpenyanyi(){
	return this.penyanyi;
}
public void setgandre(String gandre){
	this.gandre = gandre;
}
public String getgandre(){
	return this.gandre;
}

	public static void main(String[]args){

    String ulg = "y";
    while (ulg.equals("y")){

    Scanner Input = new Scanner(System.in);

    System.out.println("----------------------------------------");
    System.out.println("Nama    : Fiky Ari Wijaya");
    System.out.println("NPM     : 4520210095");
    System.out.println("Program : Music");
    System.out.println("Update  : 12 October 2021");
    System.out.println("----------------------------------------");
    System.out.println("\n");
    System.out.println("Program Pilihan Music ");
    System.out.println("\n");
    System.out.println("1. Ganre Music POP ");
    System.out.println("2. Ganre Music Jazz");
    System.out.println("3. Ganre Music Dangdut");
    System.out.println("\n");
    System.out.print("Memilih : ");
    int opsi = Input.nextInt();
    System.out.println("\n");
        
    switch (opsi){
    case 1:

    music data1 = new music(); //membuat Object
    music data2 = new music();

    data1.setjudullagu("Firasat"); //mengatur nilai setter
    data2.setjudullagu("takbisakah");
    data1.setpenyanyi("Raisah");
    data2.setpenyanyi("Aril");
    data1.setgandre("Ganre POP");

    System.out.println("----------------------------------------");
    System.out.println("Gendre Music POP");
    System.out.println("----------------------------------------");
    System.out.print("Opsi 1 / 2 Lagu ---------------------  ");
    int jumlah = Input.nextInt();
    System.out.println("\n");
    System.out.println("----------------------------------------");
    System.out.println("Judul Lagu    : " + data1.getjudullagu());
    System.out.println("Penyanyi      : " + data1.getpenyanyi());
    System.out.println("Ganre Music   : " + data1.getgandre());
    System.out.println("\n");
    System.out.println("----------------------------------------");
    System.out.println("\n");
    if (jumlah == 2){
    System.out.println("Judul Lagu    : " + data2.getjudullagu());
    System.out.println("Penyanyi      : " + data2.getpenyanyi());
    System.out.println("Ganre Music   : " + data1.getgandre());
    }
    else{
        break;
    }
    System.out.println("----------------------------------------");
    break;

    case 2:

    music data3 = new music(); //membuat Object
    music data4 = new music();

    data3.setjudullagu("Aku Ingin"); //mengatur nilai setter
    data4.setjudullagu("kau");
    data3.setpenyanyi("Indra lesmana");
    data4.setpenyanyi("Chandra darusman");
    data3.setgandre("Ganre JAZZ");

    System.out.println("----------------------------------------");
    System.out.println("Gendre Music JAZZ");
    System.out.println("----------------------------------------");
    System.out.print("Opsi 1 / 2 Lagu ---------------------  ");
    int masuk = Input.nextInt();
    System.out.println("\n");
    System.out.println("----------------------------------------");
    System.out.println("Judul Lagu    : " + data3.getjudullagu());
    System.out.println("Penyanyi      : " + data3.getpenyanyi());
    System.out.println("Ganre Music   : " + data3.getgandre());
    System.out.println("\n");
    System.out.println("----------------------------------------");
    System.out.println("\n");
    if (masuk == 2){
    System.out.println("Judul Lagu    : " + data4.getjudullagu());
    System.out.println("Penyanyi      : " + data4.getpenyanyi());
    System.out.println("Ganre Music   : " + data3.getgandre());
    }
    else{
        break;
    }
    System.out.println("----------------------------------------");
    break;

    case 3:

    music data5 = new music(); //membuat Object
    music data6 = new music();

    data5.setjudullagu("Alamat Palsu , Geboi Mujahir"); //mengatur nilai setter
    data6.setjudullagu("kejora");
    data5.setpenyanyi("Ayu ting ting");
    data6.setpenyanyi("Lesti");
    data5.setgandre("Ganre Dangdut");

    System.out.println("----------------------------------------------");
    System.out.println("Gendre Music DANGDUT");
    System.out.println("----------------------------------------------");
    System.out.print("Opsi 1 / 2 Lagu ---------------------------  ");
    int masukan = Input.nextInt();
    System.out.println("\n");
    System.out.println("----------------------------------------------");
    System.out.println("Judul Lagu    : " + data5.getjudullagu());
    System.out.println("Penyanyi      : " + data5.getpenyanyi());
    System.out.println("Ganre Music   : " + data5.getgandre());
    System.out.println("\n");
    System.out.println("----------------------------------------------");
    System.out.println("\n");
    if (masukan == 2){
    System.out.println("Judul Lagu    : " + data6.getjudullagu());
    System.out.println("Penyanyi      : " + data6.getpenyanyi());
    System.out.println("Ganre Music   : " + data5.getgandre());
    }
    else{
        break;
    }
    System.out.println("----------------------------------------------");
    break;

    default :
    System.out.println("Perintah Opsion Tidak di temukan");
    break;
    }

    System.out.print("Apakah anda ingin mengulang (y/t)? ");
    ulg = Input.next();
    System.out.println("\n"); 

    }		  
}

}