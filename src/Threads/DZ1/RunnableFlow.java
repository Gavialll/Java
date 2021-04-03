package Threads.DZ1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnableFlow implements Runnable {

    private List<Integer> listNumber;

    public RunnableFlow(List<Integer> listSort) {
        this.listNumber = listSort;
    }

    @Override
    public void run(){

        List<Integer> listSort = new ArrayList<>(listNumber);

        Collections.sort(listSort);
        Collections.reverse(listSort);

        for (int i = 0; i < listSort.size(); i++) {
            System.out.println("Number reverse: " + listSort.get(i));

            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }

    }
}
