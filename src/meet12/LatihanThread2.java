package meet12;

public class LatihanThread2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i=0; i<10;i++){
                    System.out.println("Thread t: "+ i );
                }
            }
        });
        t.start();
        Thread t2 = new Thread(new ThreadA());
        t2.start();
        Thread t3 = new ThreadB();
        t3.start();
        for (int i=0; i<10;i++){
            System.out.println("Main Thread: "+ i );
        }
    }
}
