

public class Main {
    static class MyThread implements Runnable{
        @Override
        public void run(){
            System.out.println("inside thread");
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
    }    
}
