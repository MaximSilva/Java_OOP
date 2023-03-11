package sample;

public class Student {
    String FIO;
    String facultet;
    int cource;
    double oc;
    Student(String FIO, String facultet, int cource, double oc){
        this.FIO=FIO;
        this.facultet=facultet;
        this.cource=cource;
        this.oc=oc;
    }
    public String toString(){
        return ("Student: "+FIO+" facultet "+facultet+" curs "+cource);
    }
}
