package sample;

public class Action {
    private int value;
    private boolean turn = false;
    private boolean stop = false;

    public Action() {
        super();
    }

    public synchronized int getValue() {
        for (; turn == false;) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        } int temp =
                this.value;
        turn = false;
        notifyAll();
        System.out.println("Number accepted -> " + this.value);
        return temp;
    }

    public synchronized void setValue(int value) {
        for (; turn == true;) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        } this.value =
                value;
        turn = true;
        System.out.println("Send number -> " + this.value);
        notifyAll();
    }
    public boolean isStop() {
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
