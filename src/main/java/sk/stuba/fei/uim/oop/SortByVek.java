package sk.stuba.fei.uim.oop;

import java.util.Comparator;
public class SortByVek implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return a.vek - b.vek;
    }
}
