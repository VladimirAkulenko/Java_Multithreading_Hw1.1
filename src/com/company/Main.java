package com.company;

public class Main {

    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        System.out.println("Создаю потоки...");
        Thread thread1 = new MyThread(mainGroup, "поток 1");
        Thread thread2 = new MyThread(mainGroup, "поток 2");
        Thread thread3 = new MyThread(mainGroup, "поток 3");
        Thread thread4 = new MyThread(mainGroup, "поток 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


        try {
            Thread.sleep(15_000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершаю все потоки.");
        mainGroup.interrupt();
    }
}
