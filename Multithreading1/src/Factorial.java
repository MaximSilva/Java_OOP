import java.math.BigInteger;

public class Factorial implements Runnable{

    private int n;
    private BigInteger factorialsum = BigInteger.ZERO;

    public Factorial(int n){
        super();
        this.n = n;
    }

    public int getN(){
        return n;
    }

    public BigInteger getFactorialsum()
    {
        return factorialsum;
    }

    public BigInteger calculateFactorial(int number){
        BigInteger fact = BigInteger.ONE;
        for(int i = 1; i <= number; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
    @Override
    public void run() {
        Thread thr = Thread.currentThread();

        for (int i = 0; i < n; i++){
            BigInteger fact = BigInteger.ONE;
            System.out.println(thr.getName() + " " + i + "!=" + fact);
            factorialsum = factorialsum.add(fact);
        }

    }
}
