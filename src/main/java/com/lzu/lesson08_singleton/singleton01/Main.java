package com.lzu.lesson08_singleton.singleton01;

public class Main {
    public static void main(String[] args) {
        Singleton[] singletons = new Singleton[100];

        Thread[] threads = new Thread[100];

        for (int i = 0; i < 100; i++) {
            int finalI = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    singletons[finalI] = Singleton.getInstance();
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(singletons[i].hashCode());
        }
    }
}
