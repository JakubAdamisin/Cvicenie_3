package sk.stuba.fei.uim.oop;

import java.util.Comparator;


public class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return (a.getMeno().compareTo(b.getMeno()))*(-1);
    }
}


