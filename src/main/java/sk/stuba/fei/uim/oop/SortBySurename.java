package sk.stuba.fei.uim.oop;

import java.util.Comparator;

public class SortBySurename  implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return (a.getPriezvisko().compareTo(b.getPriezvisko()));
    }
}
