package by.spg.concurrency;

public class ConcurrencyApplication {



    public static void main(String[] args){
        Runnable rnbl = new Runnable() {
            @Override
            public void run() {
                System.out.println("rnb3");

                System.out.println("add");
            }
        };

        Thread thrd = new Thread(rnbl);
        thrd.start();
    }
}
