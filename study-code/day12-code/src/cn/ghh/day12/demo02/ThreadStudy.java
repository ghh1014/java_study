package cn.ghh.day12.demo02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadStudy {
    public static void main(String[] args) {
        /*Thread thread = new SubThread();
        thread.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                
            }
        }).start();*/
        final ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"多线程方法执行"+ finalI);
                }
            });
        }
        executorService.shutdown();
    }
}
