package pl.kraleppa.lab4.task_2;

public class Main {
    public static void main(String[] args) {
        Buffer buffer = new JustBuffer(1000);
        int producersNumber = 1000;

        for (int i = 0; i < producersNumber; i++){
            new Producer(buffer).start();
            new Consumer(buffer).start();
        }
    }
}
