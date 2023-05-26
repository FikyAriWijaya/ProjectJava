import java.util.Scanner;

public class TreadBios2 extends Thread{
    Scanner Input = new Scanner(System.in);

    public void run(){
        try{
            String[] film = {"Dragon-Ball","Naruto-Harvargan","Bermain-Ketsing","Beradu-Nyali","Pokemon-Expirit"};
            for(int i = 0; i < 5; i++){
                System.out.println(i+". "+film[i]+" Studio-"+i);
            }
            sleep(100);
        }catch (InterruptedException e) {
            System.out.println(e.getMessage());
          }
    }

}
