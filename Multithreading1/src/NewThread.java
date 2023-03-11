public class NewThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 160; i++) {
            System.out.println(Thread.currentThread().getName()+ " -" + i);
        }
    }
}
