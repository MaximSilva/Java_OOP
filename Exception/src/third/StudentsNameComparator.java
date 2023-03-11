package third;

import java.util.Comparator;

public class StudentsNameComparator implements Comparator{
    public int compare(Object St1, Object St2) {
        Student student1 = (Student) St1;
        Student student2 = (Student) St2;

        String lastName1 = student1.getLastName();
        String lastName2 = student2.getLastName();

        if (lastName1.compareTo(lastName2) > 0) {
            return 1;
        }
        if (lastName1.compareTo(lastName2) < 0) {
            return -1;
        }
        return 0;
    }
}
