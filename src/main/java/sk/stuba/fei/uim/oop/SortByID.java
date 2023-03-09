package sk.stuba.fei.uim.oop;

import java.util.Comparator;

public class SortByID implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return a.ID - b.ID;
    }
}
