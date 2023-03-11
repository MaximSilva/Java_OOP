package sample;

public class AllGroup<E> {
    private  E[] arr = (E[]) new Object[10];
    private int i = 0;

    public void add(E st){
        for(int i =0; i < arr.length; i++){
            if(arr[i] == null){
                arr[i] = st;
                this.i ++;
                return;
            }
        }
    }

    public int getI() {
        return i;
    }
    <T extends Number> double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }
    public boolean check(AllGroup<?> a){
        return (this.getI() == a.getI());
    }
}
