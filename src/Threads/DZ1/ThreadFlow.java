package Threads.DZ1;
import java.util.List;

public class ThreadFlow extends Thread {

    private List<Integer> listNumber;

    public ThreadFlow(List listNumber) {
        this.listNumber = listNumber;
    }

    @Override
    public void run(){
        for (Integer i : listNumber){
            System.out.println("Number: " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
