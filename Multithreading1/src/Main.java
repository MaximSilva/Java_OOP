
public class Main {

    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();

        System.out.println(mainThread.getName() + "start");

        int[] numsArray = new int[100];
        for (int i = 1; i <= numsArray.length; i++) {
            Factorial task = new Factorial(i);
            Thread thread = new Thread(task);
            thread.start();
        }

        System.out.println(mainThread.getName() + "end");


    }
}
