

public class Main {

    static class MyThread extends Thread{
        public void run(){
            // define the job for this particular thread
            for(int i=0;i<=3;i++){
                System.out.println("inside Thread "+i);
            }
        }
    }
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();
        for(int i=0;i<=3;i++){
            System.out.println("inside main thread "+i);
        }
    }
}
