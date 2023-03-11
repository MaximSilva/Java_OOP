package sample;

public class SomeThread implements Runnable {
    private SomeClass someClass;
    public SomeThread(SomeClass someClass) {
        super();
        this.someClass = someClass;
    } @
            Override
    public void run() {
        int x = someClass.volume.getAndIncrement();
        System.out.print(" " + x);
    }
}
