package meet12;

public class ThreadA implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<10;i++){
            System.out.println("Thread A: "+ i );
        }
    }
}
