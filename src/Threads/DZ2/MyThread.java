package Threads.DZ2;

import java.util.List;

public class MyThread extends Thread {

    private List<String> list;

    public MyThread(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (String s : list) {
            System.out.print(s);

            try {
                sleep(1500);
            } catch (Exception e) {
            }
        }
    }
}
