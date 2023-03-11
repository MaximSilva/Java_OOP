package sample;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Action action = new Action();
        SomeClass smClass = new SomeClass();



        Provider provider = new Provider(action);
        Receiver receiver = new Receiver(action);

        Thread threadOne = new Thread(provider);
        Thread threadTwo = new Thread(receiver);

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SomeThread(smClass));
            thread.start();
        }

        threadOne.start();
        threadTwo.start();


        Account account = new Account(200, "login", 123);

        SingleThread stOne = new SingleThread(account);
        SingleThread stTwo = new SingleThread(account);


        stOne.getMoneyFromAccount("login", 123, 150);
        stTwo.getMoneyFromAccount("login", 123, 150);
    }
}
