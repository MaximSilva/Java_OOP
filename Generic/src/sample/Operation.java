package sample;

public class Operation <T extends Number, V extends Number>{
    T obj;
    V obj1;
    Operation(T a, V b){
        this.obj=a;
        this.obj1=b;
    }
    void print(){
        System.out.println(obj.toString());
    }
    double sum(){
        return obj.doubleValue()+obj1.doubleValue();
    }
}
