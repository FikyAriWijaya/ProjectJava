public class MultiThreadBioskop {
    public static void main(String []args){    
        
        System.out.println("\n");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Nama    : Fiky Ari Wijaya");
        System.out.println("NPM     : 4520210095");
        System.out.println("Program : Multi Thread");
        System.out.println("Update  : 14 October 2021");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("PROGRAM THREAD BIOSKOP");
        TreadBios object1 = new TreadBios("Antasari", 50000);
        object1.start();
        System.out.println("\n");
            
    }
}
