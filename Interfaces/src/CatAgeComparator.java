import java.util.Comparator;
public class CatAgeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Cat cat1 = (Cat) o1;
        Cat cat2 = (Cat) o2;
        if (cat1.getAge() > cat2.getAge()) {
            return 1;
        } if (
                cat1.getAge() <
                        cat2.getAge()) {
            return -1;
        } return 0;
    }
}
