package sk.stuba.fei.uim.oop;

import java.util.Arrays;

public class Student implements Comparable<Student> {
    int ID ;
    String meno ;
    String priezvisko ;
    int vek ;
        public Student() {
    }
    public Student(int ID, String meno, String priezvisko, int vek) {
        this.ID = ID;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }
    public String toString()
    {
        return this.ID+ " " + this.meno + " " + this.priezvisko+ " " + this.vek;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }
    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
