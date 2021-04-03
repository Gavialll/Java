package Threads.DZ2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunnableThread implements Runnable{

    private List<String> listFibo;

    public RunnableThread(List<String> list) {
        this.listFibo = list;
    }

    @Override
    public void run() {

        List<String> list = new ArrayList<>(listFibo);
        Collections.reverse(list);
        for (String s : list) {
            System.out.print(s);

            try {
                Thread.sleep(1500);
            } catch (Exception e) {
            }
        }
    }
}
