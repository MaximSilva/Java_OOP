import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 6);
        Cat cat2 = new Cat("Luska", 2);
        Cat cat3 = new Cat("Umka", 4);
        Cat cat4 = new Cat("Barsic", 8);
        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4 };

        Arrays.sort(cats, Comparator.nullsFirst(new CatAgeComparator()));
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
    }
}
